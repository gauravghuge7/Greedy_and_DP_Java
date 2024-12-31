import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_traversal {


    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here



        ArrayList<Integer> ans = new ArrayList<>();

        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();


        q.add(0);
        vis[0] = true;

        while(!q.isEmpty()) {

            Integer node = q.poll();
            ans.add(node);


            for(Integer i : adj.get(node)) {

                if(vis[i] == false) {
                    vis[i] = true;
                    q.add(i);
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {

    }
}
