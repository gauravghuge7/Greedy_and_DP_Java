import java.util.ArrayList;

public class dfs_traversal {
    public void dfs(ArrayList<Integer> ans, boolean[] vis, ArrayList<ArrayList<Integer>> adj, int curr) {


        vis[curr] = true;
        ans.add(curr);

        ArrayList<Integer> temp = adj.get(curr);

        for(int i=0; i<temp.size(); i++) {

            if(vis[temp.get(i)] == false) {
                vis[temp.get(i)] = true;

                dfs(ans, vis, adj, temp.get(i));
            }
        }

    }

    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        // Code here

        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] vis = new boolean[adj.size()];

        dfs(ans, vis, adj, 0);

        return ans;

    }


    public static void main(String[] args) {

    }
}
