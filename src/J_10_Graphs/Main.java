package J_10_Graphs;

public class Main {
    public static void main(String[] args){

        var graph = new Graph();

        //testing addNode
        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");

        //testing addEdge

        graph.addEdge("X", "A");
        graph.addEdge("X", "B");
        graph.addEdge("A","P");
        graph.addEdge("B","P");
//
//        graph.addEdge("X", "A");
//        graph.addEdge("B", "X");
//        graph.addEdge("A","P");
//        graph.addEdge("P","B");

        //testing has cycle
        System.out.println(graph.hasCycle());

        //testing  traversal
        graph.traverseDepthFirstRec("X");
        graph.traverseDepthFirst("X");
        graph.traverseBreadthFirst("X");

        //testing topological sort
        var list = graph.topologicalSort();
        System.out.println(list);




        //remove edge
        graph.removeEdge("X","B");
        graph.print();

        //testing removeNode
        //graph.removeNode("A");

        //testing print
        //graph.print();



    }
}
