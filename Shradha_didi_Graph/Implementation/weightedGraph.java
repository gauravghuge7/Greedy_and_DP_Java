import java.util.ArrayList;

class weightedGraph {

    public static class Edge {

        int src;
        int dest;

        int weight;

        public Edge(int src, int dest, int weight) {

            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {

        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(1, 2, 3));

        graph[1].add(new Edge(4, 2, 6));
        graph[1].add(new Edge(4, 11, 9));
        
        
        graph[2].add(new Edge(11, 12, 93));
        graph[2].add(new Edge(11, 45, 67));
        graph[2].add(new Edge(11, 76, 54));
        
        
    }

    public static void main(String[] args) {
        
        int V = 5;

        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);


        for(int i=0; i<graph.length; i++) {

            Edge e = graph[2].get(i);

            System.out.print(e+" ");
        }

    }    

}