import java.util.*;

public class Solution {

    // Returns true if a cycle exists.
    private static boolean isCycle(int vertex, List<List<Integer>> graph, ArrayList<Boolean> visited,
            ArrayList<Boolean> recursionStack) {

        // Udpate the "visited" and "recursionStack" values of current vertex.
        visited.set(vertex, true);
        recursionStack.set(vertex, true);

        for (int adjVertex : graph.get(vertex)) {
            if (visited.get(adjVertex) == false) {
                if (isCycle(adjVertex, graph, visited, recursionStack)) {
                    return true;
                }
            }

            else if (recursionStack.get(adjVertex)) {
                return true;
            }
        }

        recursionStack.set(vertex, false);

        return false;
    }

    public static String canFinish(List<List<Integer>> adj, int n, int m) {

        // To keep track of visited vertices.
        ArrayList<Boolean> visited = new ArrayList<Boolean>();
        for (int i = 0; i < n + 1; i++) {
            visited.add(false);
        }

        // To keep track of vertices which are currently in recursion stack.
        ArrayList<Boolean> recursionStack = new ArrayList<Boolean>();
        for (int i = 0; i < n + 1; i++) {
            recursionStack.add(false);
        }

        for (int i = 1; i <= n; i++) {
            if (visited.get(i) == false) {
                if (isCycle(i, adj, visited, recursionStack)) {
                    return "No";
                }
            }
        }

        return "Yes";
    }
    
    public static void main(String [] args) {
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int m = scn.nextInt();
        
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<=n;i++) {
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<m;i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            
            adj.get(u).add(v);
        }
        
        System.out.println(canFinish(adj,n,m));
    }
}
