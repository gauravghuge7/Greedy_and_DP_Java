package MatrixGraph;
import java.util.*;
import java.lang.*;

class Edge {

}



class Graph {

   int[][] grid;

   int V;

   Graph(int V) {
      
      grid = new int[V][V];
      this.V = V;
   }


   void addEdge(int v, int w) {

      grid[v][w] = 1;
      grid[w][v] = 1;
   }


   void printGraph() {

      for (int i=0; i<V; i++) {

         for(int j=0; j<V; j++) {

            if(grid[i][j] == 1) {
               System.out.print("1 ");
            }
            else {
               System.out.print("0 ");
            }

         }
         System.out.println();

      }

   }


   void BFS(int s) {

      boolean[] visited = new boolean[V];

      Queue<Integer> queue = new Queue<>();
      queue.enqueue(s);
      visited[s] = true;

      while(!queue.isEmpty()) {
         int node = queue.dequeue();
         System.out.print(node + " ");
         for(int neighbor : grid[node]) {
            if(!visited[neighbor]) {
               queue.enqueue(neighbor);
               visited[neighbor] = true;
            }
         }
      }
   }
}




/**
 * demo
 */
public class demo {

   public static void main(String[] args) {
      

      Graph graph = new Graph(5);

      /** this is the one way to add edges */
      graph.grid[0][0] = 1;
      graph.grid[0][1] = 1;
      graph.grid[0][2] = 1;


      //** this is the other way to add edges */

      graph.addEdge(2, 4);


      graph.printGraph();



   }
   
}