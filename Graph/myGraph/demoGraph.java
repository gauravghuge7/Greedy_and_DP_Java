package Graph.myGraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Edge {

   int src;
   int dest;


   public Edge(int s, int d) {

      this.src = s;
      this.dest = d;
   }

}


class Graph {

   int V;

   ArrayList<Edge> graph[];

   public Graph(int V) {

      this.V = V;

   }

   public void createGraph() {

      graph = new ArrayList[V];

      for(int i=0; i<V; i++) {

         graph[i] = new ArrayList<>();

      }


   }


   public void printGraph() {

      

   }


   public void bfs() {

      Queue<Integer> q = new LinkedList<>();

      q.add(0);


      while(!q.isEmpty()) {

         


      }

   }

}







public class demoGraph {

   
   public static void main(String[] args) {
      
      Graph graph = new Graph(4);

      graph.createGraph();

      graph.printGraph();



   }
}
