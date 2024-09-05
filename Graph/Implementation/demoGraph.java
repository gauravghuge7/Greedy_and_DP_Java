

/* 
 * 
 *   using the Adjacancy List optimized Graph
 * 
*/

import java.util.ArrayList;

/**
 * class Edge for the creating a Edge  
 *  
*/

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
      
      for(int i=0; i<=V; i++) {

         graph[i] = new ArrayList<Edge>();
      }

   }

   public void createGraph() {

   } 

}



public class demoGraph {


   
}