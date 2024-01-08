package J_11_WeightedGraphs;

public class Main {
    public static void main(String[] args){
        var graph = new WeightedGraph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");

        graph.addEdge("A", "B", 3);
        graph.addEdge("A", "C",2);

        //testing print
        graph.print();

        //testing getShortestPath
        System.out.println(graph.getShortestPath("B", "C"));

        //testing hasCycle
        System.out.println(graph.hasCycle());

        //testing getMinimumSpanningTree
        var tree = graph.getMinimumSpanningTree();
        tree.print();

        //testing containsNode
        System.out.println(graph.containsNode("A"));

    }
}
