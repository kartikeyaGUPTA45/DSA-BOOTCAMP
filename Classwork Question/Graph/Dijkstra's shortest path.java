import java.util.*;

public class Solution {
    public static class Pair {
        int v;
        int wt;

        public Pair(int v, int wt) {
            this.v = v;
            this.wt = wt;
        }
    }

    public static class PQPair {
        int distance;
        int node;

        public PQPair(int distance, int node) {
            this.distance = distance;
            this.node = node;
        }
    }

    public static int[] algo(List<List<Pair>> adj, int V, int S) {
        PriorityQueue<PQPair> pq = new PriorityQueue<>((x, y) -> Integer.compare(x.distance, y.distance));
        // PriorityQueue<PQPair> pq = new PriorityQueue<>(V, Comparator.comparingInt(o -> o.distance));

        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e9);
        dist[S] = 0;
        pq.add(new PQPair(0, S));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();

            for (Pair p : adj.get(node)) {
                int wt = p.wt;
                int adjNode = p.v;

                if (dis + wt < dist[adjNode]) {
                    dist[adjNode] = dis + wt;
                    pq.add(new PQPair(dist[adjNode], adjNode));
                }
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int V = scn.nextInt();
        int E = scn.nextInt();
        int S = scn.nextInt();

        List<List<Pair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int u = scn.nextInt();
            int v = scn.nextInt();
            int wt = scn.nextInt();

            adj.get(u).add(new Pair(v, wt));
            adj.get(v).add(new Pair(u, wt));
        }

        int[] dis = algo(adj, V, S);
        for (int i = 0; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }
    }
}
