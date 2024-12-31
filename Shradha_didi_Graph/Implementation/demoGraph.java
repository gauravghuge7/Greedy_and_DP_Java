

/* 
 * 
 *   using the Adjacancy List optimized Graph
 * 
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

   int V;    // vertices of the graph

   int length = 0;

   ArrayList<Edge> graph[];  

   public Graph(int V) {
      this.V = V;


      graph = new ArrayList[V];

      for (int i = 0; i < V; i++) {
         graph[i] = new ArrayList<Edge>();
      }

   }

   public void addEdge(int src, int dest) {

      graph[src].add(new Edge(src, dest));

   }


   public void printGraph() {

      System.out.println("The graph is as follows");


      for (int i = 0; i < V; i++) {
         System.out.println("Adjacency list of vertex " + i + " is ");

         for (int j = 0; j < graph[i].size(); j++) {

            System.out.println(graph[i].get(j).src + " ---> " + graph[i].get(j).dest);

         }
      }

   }

   public void dfs(Graph data, int v, boolean[] visited) {
         visited[v] = true;

         System.out.print(v + " ");

         for (int i = 0; i < data.graph[v].size(); i++) {
            int n = data.graph[v].get(i).dest;
            if (visited[n] == false) {
               dfs(data, n, visited);
            }
         }
   }


   public void bfs(Graph data, int V, boolean[] visited, int start) {

      Queue<Integer> q = new LinkedList<>();

      q.add(start);

      while (q.isEmpty() == false)  {

         int curr = q.poll();

         if(visited[curr] == false) {

            System.out.println(curr+" ");

            visited[curr] = true;

            for (int i=0; i<data.graph[curr].size(); i++) {

               Edge e = data.graph[curr].get(i);
               q.add(e.dest);
            }
         }
      }

   }

}



public class demoGraph {

   

public static void main(String[] args) {

      Graph data = new Graph(4);  // Graph with 4 vertices

      // Add edges to the graph
      data.addEdge(0, 2);
      data.addEdge(1, 1);
      data.addEdge(1, 0);
      data.addEdge(3, 2);

      // Print the graph to see the edges
      // data.printGraph();


      
      boolean[] visited = new boolean[data.V];;

      for(int i=0; i<data.V; i++) {
         
         if(visited[i] == false) {
            data.dfs(data, i, visited);
         }
      }

      for(int i=0; i<data.V; i++) {
         
         if(visited[i] == false) {
            data.bfs(data, data.V, visited, i);
         }
      }

   }

}