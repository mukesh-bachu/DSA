package J_06_BinaryTrees;

import java.io.PrintStream;

public class Main {
    public static void main(String[] args){
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(8);
        tree.insert(1);
        tree.insert(6);
        tree.insert(10);

        System.out.println(tree.find(11));
        //testing pre order
        tree.traversePreOrder();
        System.out.println();
        //testing Inorder
        tree.traverseInOrder();
        System.out.println();
        //testing post order
        tree.traversePostOrder();
        System.out.println();
        //testing height
        System.out.println(tree.height());
        //testing min
        System.out.println(tree.min());

        //testing equals
        Tree tree2 = new Tree();
        tree2.insert(7);
        tree2.insert(4);
        tree2.insert(9);
        tree2.insert(8);
        tree2.insert(1);
        tree2.insert(6);
        tree2.insert(10);

        System.out.println(tree.equals(null));

        //testing minBST
        System.out.println("min BST " + tree.minBST());


        //testing maxBST
        System.out.println("max BST " + tree.maxBST());

        //testing size
        System.out.println("size is  "+tree.size());

        //testing countOfLeaves
        System.out.println("num of leaves are "+tree.countLeaves());
        //testing contains
        System.out.println(tree.contains(11));
        //testing areSibling
        System.out.println("are sibling");
        System.out.println(tree.areSibling(4,6));

        //testing get Ancestors
        System.out.println("ancestors");
        System.out.println(tree.getAncestors(0));
        //testing isBST
        System.out.println(tree.isBST());
        tree.swapNodes();
        System.out.println(tree.isBST());



        //testing printNodesAtDistance
        System.out.println(tree.getNodesAtDistance(2).toString());

        //testing traverseLevelOrder()
        System.out.println();
        tree.traverseLevelOrder();





    }
}
