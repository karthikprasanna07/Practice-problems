package Tree;

public class bsl {
    static class bsTree {
        int value;
        bsTree left;
        bsTree right;

        bsTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
        bsTree root;
        public bsTree insert(bsTree root, int value) {
            if (root == null) {
                return new bsTree(value);
            }
            if (value < root.value) {
                root.left = insert(root.left, value);
            } else if (value > root.value) {
                root.right = insert(root.right, value);
            }
            return root;
        }

        public void inorder(bsTree root) {
            if (root == null) {
                return;
            }
            inorder(root.left);
            System.out.print(root.value + "->");
            inorder(root.right);
        }
        public void leafnode(bsTree root){
            if(root == null){
                return;
            }
            if(root.left == null && root.right == null){
                System.out.println(root.value);
            }
                leafnode(root.left);
                leafnode(root.right);
        }
        public int min_leaf(bsTree root){
            int min = root.value;
            while(root.left != null){
                min = root.left.value;
                root = root.left;
            }
            return min;
        }

        /*public bsTree search(bsTree root) {
            if (root == null) {
                return NULL;
            }
            if(value == root.value) {
                return root.value;
            }
            if(value < root.value) {
                return search(root.left);
            }
            if(value > root.value) {
                return search(root.right);
            }
            return root;
        }*/
    }
    public static void main(String[]args){
        bsTree root = new bsTree(5);
        root.insert(root, 8);
        root.insert(root, 3);
        root.insert(root, 1);
        root.insert(root, 6);
        root.insert(root, 7);
        root.insert(root, 7);
        root.insert(root,10);
        root.insert(root,14);
        root.inorder(root);
        System.out.println();
        root.leafnode(root);
    }
}
