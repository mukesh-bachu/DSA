package J_07_AVLTree;

public class AVLTree {
    private class AVLNode{
        private int height;
        private int value;
        private AVLNode left;
        private AVLNode right;

        public AVLNode(int value){
            this.value = value;
        }
        @Override
        public String toString(){
            return "Value= "+ this.value;
        }
    }

    private AVLNode root;
    public void insert(int val){
        root = insert(root, val);
    }
    private AVLNode insert (AVLNode root, int val){
        if(root == null)
            return  new AVLNode(val);

        if(val < root.value)
            root.left = insert(root.left, val);
        else
           root.right =  insert(root.right, val);

        setHeight(root);
        return balance(root);
    }

    private AVLNode balance(AVLNode root){
        if(isLeftHeavy(root)) {
            if (balanceFactor(root.left) < 0)
                root.left = rotateLeft(root.left);
            return rotateRight(root);
        }
        else if (isRightHeavy(root)) {
            if (balanceFactor(root.right) >0)
               root.right = rotateRight(root.right);
            return rotateLeft(root);
        }
        return root;
    }

    private int height(AVLNode node){
        return (node == null) ? -1: node.height;
    }

    private int balanceFactor(AVLNode node){
        return (node == null)?0:height(node.left) - height(node.right);
    }

    private boolean isLeftHeavy(AVLNode node){
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node){
        return balanceFactor(node) < -1;
    }

    private AVLNode rotateLeft(AVLNode root){
        var newRoot = root.right;
        root.right = newRoot.left;
        setHeight(root);
        setHeight(newRoot);

        return newRoot;

    }

    private AVLNode rotateRight(AVLNode root){
        var newRoot = root.left;
        root.left = newRoot.right;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }
    private void setHeight(AVLNode node){
        node.height = Math.max(height(node.left), height(node.right)) + 1;
    }



}
