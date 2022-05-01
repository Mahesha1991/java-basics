package bst;

import tree.TreeOps;

public class BSTMain {
    public static void main(String[] args) {
        BSTMain bm = new BSTMain();
        BSTOps bo = new BSTOps();

        bo.insertMaxCount(30);

        System.out.println("PreOrder: ");
        bo.preOrderDisplay();

        System.out.println("InOrder: ");
        bo.inOrderDisplay();

        System.out.println("PostOrder: ");
        bo.postOrderDisplay();

        System.out.println("Tree Height: " + bo.getHeight());

        System.out.println("Max Tree Element: " + bo.maxElement());

        System.out.println("Find BST 25 : " + bo.find(25));
    }
}
