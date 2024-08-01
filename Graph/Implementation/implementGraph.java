import java.util.*;

public class implementGraph {


    public static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {

            this.src = s;
            this.dest = d;


        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for(int i=0; i<graph.length; i++) {

            graph[i] = new ArrayList<Edge>();
        }


        /// here Enter the paths in graph 

        /// Starting point
        graph[0].add(new Edge(3, 4));


        /// second lines path 
        graph[1].add(new Edge(3, 4));
        graph[1].add(new Edge(3, 4));


        graph[2].add(new Edge(3, 4));
        graph[2].add(new Edge(3, 5));
        graph[2].add(new Edge(3, 2));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 4));


    }

    
    public static void main(String[] args) {
        
        int V = 4;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

        for(int i=0; i<graph[2].size(); i++) {

            Edge e = graph[2].get(i);

            System.out.print(e.dest+" ");
        }
        
    }
}