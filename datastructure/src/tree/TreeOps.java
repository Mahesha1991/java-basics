package tree;

public class TreeOps {

    private int multiplier = 0;
    private TreeNode root;

    public void insertCount(int count){
        multiplier = count < 10 ? 1000 : count;

        if(root == null){
            root = new TreeNode((int) (Math.random() * multiplier));
        }
        for(int i = 0; i < count-1; i++)
            randomInsert(root);
    }

    private void randomInsert(TreeNode root) {
        boolean isLeft = Math.random() < 0.5;
        if(isLeft){
            if(root.left == null){
                root.left = new TreeNode((int) (Math.random() * multiplier));
            }else{
                randomInsert(root.left);
            }
        }else{
            if(root.right == null){
                root.right = new TreeNode((int) (Math.random() * multiplier));
            }else{
                randomInsert(root.right);
            }
        }
    }

    public void inOrderDisplay(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(TreeNode root) {
        if (root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public void preOrderDisplay(){
        preOrder(root);
        System.out.println();
    }

    private void preOrder(TreeNode root) {
        if (root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public void postOrderDisplay(){
        postOrder(root);
        System.out.println();
    }

    private void postOrder(TreeNode root) {
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int getHeight(){
        return getTreeHeight(root);
    }

    private int getTreeHeight(TreeNode root) {
        if(root == null){
            return 0;
        }
        return max(getTreeHeight(root.left),getTreeHeight(root.right)) + 1;
    }

    private int max(int left, int right){
        return (left > right ? left : right);
    }

    public int maxElement(){
        return maxTreeElement(root);
    }

    private int maxTreeElement(TreeNode root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return max(maxTreeElement(root.left),maxTreeElement(root.right),root.data);
    }

    private int max(int a, int b, int c){
        int temp = a > b ? a : b;
        return (temp > c ? temp : c);
    }

}
