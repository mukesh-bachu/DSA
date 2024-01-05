package J_06_BinaryTrees;
import java.util.*;
public class Tree {
    private class Node{
        private int value;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        @Override
        public String toString(){
            return "Node " + value;
        }
    }
    private Node root;

    public void insert(int value){
        if(root == null){
            root = new Node(value);
            return;
        }
        Node cur = root;
        while(true) {
            if (value < cur.value) {
                if (cur.left != null) {
                    cur = cur.left;
                } else {
                    cur.left = new Node(value);
                    break;
                }
            } else {
                if (cur.right != null) {
                    cur = cur.right;
                } else {
                    cur.right = new Node(value);
                    break;
                }
            }
        }
    }

    public boolean find(int value){
        var cur = root;
        while(cur != null){
            if(cur.value > value)
                cur = cur.left;
            else if(cur.value < value)
                cur = cur.right;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder(){
        traversePreOrder(root);
    }


    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.println(root.value);
        traversePreOrder(root.left);
        traversePreOrder(root.right);
    }

    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if(root == null)
            return;
        traverseInOrder(root.left);
        System.out.println(root.value);
        traverseInOrder(root.right);
    }

    public void traversePostOrder(){
        traversePostOrder(root);
    }
    private void traversePostOrder(Node root){
        if(root == null)
            return;

        traversePostOrder(root.left);
        traversePostOrder(root.right);
        System.out.println(root.value);
    }
    public int height(){
        return height(root);
    }
    private int height(Node root){
        if(root == null)
            return -1;
        if(isLeaf(root))
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private boolean isLeaf(Node node){
        return (node.left == null && node.right == null);
    }

    public int min(){
        return min(root);
    }
    private int min(Node root){
        if(isLeaf(root))
            return root.value;

        var left = min(root.left);
        var right = min(root.right);

        return Math.min(Math.min(left, right), root.value);
    }

    public boolean equals(Tree other){
        if(other == null)
            return false;
        return equals(root, other.root);
    }

    private boolean equals(Node root, Node root1) {

        if (root == null && root1 == null)
            return true;
        if (root != null && root1 != null)
            return (root.value == root1.value) &&
                    equals(root.left, root1.left) &&
                    equals(root.right, root1.right);

        return false;
    }

    public boolean isBST(){
        return isBST(root, Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private boolean isBST(Node root, int min, int max){
        if(root == null)
            return true;

        if(root.value > min && root.value < max)
            return isBST(root.left, min, root.value) &&
                    isBST(root.right, root.value, max);
        return false;

    }

    public void swapNodes(){
        var temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public List<Integer> getNodesAtDistance(int distance){
        List<Integer> list = new ArrayList<>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance( Node root, int distance, List<Integer> list){
        if(root == null)
            return;
        if(distance == 0){
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.left, distance-1, list);
        getNodesAtDistance(root.right, distance-1,list);

    }

    public void traverseLevelOrder(){
        for(int i = 0; i <= height(); i++){
            for(int val:getNodesAtDistance(i))
                System.out.println(val);
        }
    }

    public int minBST(){
        return minBST(root);
    }
    private int minBST(Node root){
        if(root == null)
            return -1;
        if(root.left == null)
            return root.value;

        return minBST(root.left);
    }

    private int maxBST(Node root){
        if(root == null)
            return -1;
        if(root.right == null)
            return root.value;
        return maxBST(root.right);
    }

    public int maxBST(){
        return maxBST(root);
    }

    public int size(){
        return size( root);
    }
    private int size(Node root){
        if(root == null)
            return 0;
        return 1 + size(root.left) + size(root.right);
    }

    public int countLeaves(){
        return countLeaves(root);
    }

    private int countLeaves(Node root){
        if(root == null)
            return 0;
        if(isLeaf(root))
            return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    }

    public boolean contains(int val){
        return contains(root, val);
    }

    private boolean contains(Node root, int val){
        if(root == null)
            return false;
        if(root.value == val)
            return true;
        return contains(root.left, val) || contains(root.right, val);
    }

    public boolean areSibling(int val1, int val2){
        return areSibling(root, val1, val2);
    }

    private boolean areSibling(Node root, int val1, int val2){
        if(root == null)
            return false;
        if(root.left != null && root.right != null){
            return (root.left.value == val1 && root.right.value == val2) ||
                    (root.left.value == val2 && root.right.value == val1);
        }

        return areSibling(root.left, val1, val2) || areSibling(root.right, val1, val2);
    }

    public List<Integer> getAncestors(int val){
        List<Integer> list = new ArrayList<>();
        getAncestors(root, val, list);
        return list;
    }

    private boolean getAncestors(Node root, int val, List<Integer> list) {
        if (root == null)
            return false;
        if (root.value == val)
            return true;
        if (getAncestors(root.left, val, list) || getAncestors(root.right, val, list)) {
            list.add(root.value);
            return true;
        }
        return false;
    }
    }

