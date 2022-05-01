package tree;

import java.util.Arrays;

public class TreeMain {
    public static void main(String[] args) {
        TreeMain tm = new TreeMain();
        TreeOps to = new TreeOps();

        to.insertCount(20);

        System.out.println("PreOrder: ");
        to.preOrderDisplay();

        System.out.println("InOrder: ");
        to.inOrderDisplay();

        System.out.println("PostOrder: ");
        to.postOrderDisplay();

        System.out.println("Tree Height: " + to.getHeight());

        System.out.println("Max Tree Element: " + to.maxElement());
    }
}
