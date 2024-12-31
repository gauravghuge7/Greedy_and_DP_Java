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



public class bellman {
   

   static void createGraph(ArrayList<Edge> graph[]) {

      for(int i=0; i<graph.length; i++) {

         graph[i] = new ArrayList<>();
      }

      graph[0].add(new Edge(0, 1, 2));

      graph[0].add(new Edge(0, 2, 4));

      graph[1].add(new Edge(1, 2, (-4)));

      graph[2].add(new Edge(2, 3, 2));

      graph[3].add(new Edge(3, 4, 4));

      graph[4].add(new Edge(4, 1, -1));

   }




   // static void printGraph(ArrayList<Edge> graph[]) {

   //    for(int i=0; i<graph.length; i++) {

         
   //       for(int j=0; j<graph[i].size(); j++) {

   //          System.out.println("src => "+graph[i].get(j).src);

   //          System.out.println("dest => "+graph[i].get(j).dest);

   //          System.out.println("weight => "+graph[i].get(j).weight);
   //       }
   //       System.out.println();
   //    }
   // }


   public static void bellmanFord(ArrayList<Edge> graph[], int src, int V) {

      int dist[] = new int[V];


      for(int i=0; i<V; i++) {

         if(i != src) {
            dist[i] = Integer.MAX_VALUE;
         }
      }


      for(int k=0; k<V-1; k++) {

         for(int i=0; i<V; i++) {

            for(int j=0; j<graph[i].size(); j++) {

               Edge e = graph[i].get(j);

               int u = e.src;
               int v = e.dest;
               int w = e.weight;

               if(dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                  dist[v] = dist[u] + e.weight;
               }
            }
         }
      }


      for(int i=0; i<V; i++) {
         System.out.print(dist[i]+" ");
      }
      System.out.println();



   }



   public static void main(String[] args) {
   
      int V = 5;

      ArrayList<Edge> graph[] = new ArrayList[V];


      createGraph(graph);

      // printGraph(graph);

      bellmanFord(graph, 0, V);
      

   }
}
