import java.io.*;
import java.util.*;

public class Solution {

    static class Edge {
        int src;
        int nbr;

        Edge(int src, int nbr) {
            this.src = src;
            this.nbr = nbr;
        }
    }


    public static void main(String[] agrs) {

        Scanner scn = new Scanner(System.in);

        String[] init = scn.nextLine().split(" ");

        int v = Integer.parseInt(init[0]);
        int e = Integer.parseInt(init[1]);

        // Graph

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < e; i++) {

            String[] parts = scn.nextLine().split(" ");

            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);

            graph[v1].add(new Edge(v1, v2));
            graph[v2].add(new Edge(v2, v1));

        }

//         for (int i = 0; i < graph.length; i++) {
//             System.out.print(i + " ");

//             for (Edge edge: graph[i]) {
//                 System.out.print(edge.nbr + " ");
//             }

//             System.out.println();
//         }
        
        boolean[] visited = new boolean[v];
        
        boolean isCycle = false;
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                if (isCycleDFS(graph, visited, i, -1)) {
                    isCycle = true;
                    break;
                }
            }
        }
        
        if (isCycle) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    
    public static boolean isCycleDFS(ArrayList<Edge>[] graph, boolean[] visited, int currVertex, int parent) {

        visited[currVertex] = true;

        for (Edge e: graph[currVertex]) {
            if (! visited[e.nbr]) {
                if (isCycleDFS(graph, visited, e.nbr, currVertex)) {
                    visited[e.nbr] = true;
                    return true;
                }
            } else {
                if (e.nbr != parent) {
                    return true;
                }
            }
        }

        return false;

    }
}
