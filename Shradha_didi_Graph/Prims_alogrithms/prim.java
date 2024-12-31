package Prims_alogrithms;

import java.util.ArrayList;



/** Edge class for Graph */
class Edge {   

   int src;
   int dest;
   int weight;

   public Edge(int src, int dest, int weight) {

      this.src = src;
      this.dest = dest;
      this.weight = weight;
   }
}



/* 
 *      0------1
 *     / 
 *    /
 *   
*/





// class Pair implements Comparable<Pair> {



//    public void CompareTo() {

//    }

// }




public class prim {





   public static void createGraph(ArrayList<Edge> graph[]) {

      for(int i=0; i<graph.length; i++) {

         graph[i] = new ArrayList<>();

      }

      /**   Edges for 0 vertices */
      graph[0].add(new Edge(0, 1, 10));
      graph[0].add(new Edge(0, 2, 15));
   
      graph[0].add(new Edge(0, 3, 30));


      graph[1].add(new Edge(1, 3, 40));

      graph[2].add(new Edge(2, 3, 50));


      /**  Edges for 1 Vertices */

      
      
   }
   
   public static void main(String[] args) {
      

      int V = 4;


      ArrayList<Edge> graph[] = new ArrayList[V];


   




      
      


   }
}
