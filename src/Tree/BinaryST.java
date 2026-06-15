package Tree;

public class BinaryST {
    static class tree {
        int val;
        tree left;
        tree right;

        public tree(int data) {
            val = data;
            left = right = null;
        }
        static tree root;
        public tree insert(int value,tree root){
            if(root == null){
                return new tree(value);
            }
            if(value<root.val){
                root.left = insert(value,root.left);
            }
            else if(value>root.val){
                root.right = insert(value,root.right);
            }
            return root;
        }

        public void inorder(tree root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }

        public boolean search(int data){
            inorder(root.left);
            if(root.val == data){
                return true;
            }
            inorder(root.right);
            if(root.val == data){
                return true;
            }
            return false;
        }

        public static void main(String[] args) {
            tree t = new tree(5);
            t.insert(4,root);
            t.insert(2,root);
            t.insert(7,root);
            t.insert(67,root);
            t.insert(6,root);
            t.insert(8,root);
            t.inorder(root);


        }
    }
}
