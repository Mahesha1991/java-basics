package bst;

public class BSTOps {

    private int multiplier = 0;
    private BSTNode root;

    //Not guaranteed as there might be duplicate random number generated
    public void insertMaxCount(int count){
        multiplier = count < 10 ? 1000 : count;

        if(root == null){
            root = new BSTNode((int) (Math.random() * multiplier));
        }
        for(int i = 0; i < count-1; i++){
            int element = (int) (Math.random() * multiplier);
            System.out.print("Ele: " + element + " ");
            randomInsert(root, element);
        }

    }

    private void randomInsert(BSTNode root, int element) {
        if (root.data == element){
            // As this is exact same number, we are ignoring
            return;
        }
        boolean isLeft = root.data > element;
        if(isLeft){
            if(root.left == null){
                System.out.print("In left: " + element + " ");
                root.left = new BSTNode(element);
            }else{
                randomInsert(root.left,element);
            }
        }else{
            if(root.right == null){
                System.out.print("In right: " + element + " " );
                root.right = new BSTNode(element);
            }else{
                randomInsert(root.right,element);
            }
        }
    }

    public void inOrderDisplay(){
        inOrder(root);
        System.out.println();
    }

    private void inOrder(BSTNode root) {
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

    private void preOrder(BSTNode root) {
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

    private void postOrder(BSTNode root) {
        if (root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public int getHeight(){
        return getTreeHeight(root);
    }

    private int getTreeHeight(BSTNode root) {
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

    private int maxTreeElement(BSTNode root) {
        if (root == null){
            return Integer.MIN_VALUE;
        }
        return max(maxTreeElement(root.left),maxTreeElement(root.right),root.data);
    }

    private int max(int a, int b, int c){
        int temp = a > b ? a : b;
        return (temp > c ? temp : c);
    }

    public boolean find(int element){
        return findBST(root,element);
    }

    private boolean findBST(BSTNode root, int element) {
        if(root == null){
            return false;
        }
        if(root.data == element){
            return true;
        }
        if(root.data > element){
            return findBST(root.left,element);
        }
        return findBST(root.right, element);
    }

    public void removeNode(int i) {
        root = remove(root,i);
    }

    private BSTNode remove(BSTNode root, int i) {
        if (root == null)
            return null;
        if (root.data > i){
            root.left = remove(root.left,i);
        } else if (root.data < i){
            root.right = remove(root.right,i);
        } else {
            System.out.println("Found Delete");
            if (root.left == null){
                return root.right;
            } else if (root.right == null){
                return root.left;
            } else {
                int min = findMin(root.right);
                root.data = min;
                root.right = remove(root.right,min);
            }
        }
        return root;
    }

    private int findMin(BSTNode root) {

        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
}
