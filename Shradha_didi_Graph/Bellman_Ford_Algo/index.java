import java.util.ArrayList;

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


class Graph {

   ArrayList<Edge> graph[];
   int V;

   public Graph(int V) {

      this.V = V;
      graph = new ArrayList[V];
   }

   public void addEdges(int src, int dest, int weight) {

      graph[src].add(new Edge(src, dest, weight));

   }


   public void printGraph() {

      for(int i=0; i<V; i++) {

         for(int j=0; j<graph[i].size(); j++) {

            System.out.println("src => "+graph[i].get(j).src);

            System.out.println("dest => "+graph[i].get(j).dest);

            System.out.println("weight => "+graph[i].get(j).weight);
         }
      }
   }


}



/**  My Graph */

/* 
 *     0 ----1---\
 *      \   |      4
 *       \ |      |
 *        2-------3  
 * 
*/



/**
 * index
*/
public class index {

   

   
   public static void main(String[] args) {
      
      int V = 4;

      ArrayList<Edge> graph[] = new ArrayList[V];

      Graph g = new Graph(V);

      // g.addEdges(0, 1, 2);

      // g.addEdges(V, V, V);


      g.printGraph();


   }
}