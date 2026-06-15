package Tree;

import java.util.ArrayList;
import java.util.List;

public class Impl {
    static class tree {

        static List<Integer> l = new ArrayList<>();
        int value;
        tree left, right;

        public tree(int value) {
            this.value = value;
            left = right = null;
        }

        tree root; // start checking from root, initialize the root
        public void inorder(tree root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            l.add(root.value);
            inorder(root.right);
        }

        public void preorder(tree root) {
            if (root == null) {
                return;
            }
            System.out.print(root.value + "->");
            preorder(root.left);
            preorder(root.right);
        }

        public void postorder(tree root) {

        }

        public static void main(String[] args) {
            tree root = new tree(25);
            root.left = new tree(20);
            root.right = new tree(36);
            root.left.left = new tree(10);
            root.left.right = new tree(22);
            root.left.left.left = new tree(5);
            root.left.left.right = new tree(12);
            root.right.left = new tree(30);
            root.right.right = new tree(40);
            root.right.left.left = new tree(28);
            root.right.right.right = new tree(48);
            root.right.right.left = new tree(38);
            root.inorder(root);
            System.out.println(l);

        }
    }
}