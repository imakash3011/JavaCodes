package Program_15.Graph;

import java.util.HashMap;

public class GraphClient {
    public static void main(String[] args) {
        Graph graph=new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

//        graph.addEdge("A","B",2);
//        graph.addEdge("A","D",3);
//        graph.addEdge("B","C",1);
//        graph.addEdge("C","D",8);
//        graph.addEdge("D","E",10);
//        graph.addEdge("E","F",45);
//        graph.addEdge("E","G",7);
//        graph.addEdge("F","G",18);

        //updating cost for prims problem
//        graph.addEdge("A","B",2);
//        graph.addEdge("A","D",6);
//        graph.addEdge("B","C",3);
//        graph.addEdge("C","D",1);
//        graph.addEdge("D","E",8);
//        graph.addEdge("E","F",5);
//        graph.addEdge("E","G",7);
//        graph.addEdge("F","G",9);



        //updating cost for Dijkstra problem
        graph.addEdge("A","B",2);
        graph.addEdge("A","D",10);
        graph.addEdge("B","C",3);
        graph.addEdge("C","D",1);
        graph.addEdge("D","E",8);
        graph.addEdge("E","F",5);
        graph.addEdge("E","G",6);
        graph.addEdge("F","G",4);

        graph.display();
        System.out.println("*******************************");
//        System.out.println(graph.numVertex());
//        System.out.println(graph.numEdges());
//
//        System.out.println(graph.containsEdge("A","C"));
//        System.out.println(graph.containsEdge("E","F"));
//
//        graph.removeEdge("A","B");
//        graph.display();
//
//        graph.removeVertex("F");
//        graph.display();
//
//        graph.addVertex("F");
//        graph.display();
//
//        graph.addEdge("F","A",10);
//        graph.display();




//        System.out.println(graph.hasPath("A","F",new HashMap<>()));
//
//        graph.removeEdge("D","E");
//        System.out.println(graph.hasPath("A","F",new HashMap<>()));




//        System.out.println(graph.bfs("A","F"));

//        graph.removeEdge("D","A");
//        System.out.println(graph.bfs("A","F"));



//        System.out.println(graph.dfs("A","F"));



//        graph.bft();
//        graph.removeEdge("D","E");
//        graph.bft();


//        graph.dft();
//        graph.removeEdge("D","E");
//        graph.dft();


//        graph.removeEdge("B","C");
//        graph.removeEdge("F","G");
//        System.out.println(graph.isCyclic());


//        graph.removeEdge("D","E");
//        System.out.println(graph.isConnected());


//        graph.removeEdge("B","C");
//        graph.removeEdge("F","G");
//        System.out.println(graph.isTree());


//        graph.removeEdge("D","E");
//        System.out.println(graph.getCC());

//        graph.prims().display();


        System.out.println(graph.dijkstra("A"));


    }
}
