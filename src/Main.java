public class Main {

    public static void main(String[] args) {
//        Graph graph = new Graph(5, 6);
//        graph.print();
//        System.out.println();
//        graph.firstMethod();
//        System.out.println();
//        graph.secondMethod();
//        System.out.println();
////        graph.thirdMethod();   //only for square graph
//        System.out.println();
//        graph.randomDirectionMethod();

        System.out.println();

        GraphIsland islandGraph = new GraphIsland(4, 5);
        islandGraph.drawGraph("graph.png");
//        System.out.println();
//        islandGraph.breadthFirstSearch(); //to show that BFS is bad idea
        System.out.println();
        islandGraph.depthFirstSearch();
    }
}