import java.util.*;

public class BFS {

    Map<Integer, ArrayList<Integer>> map = new HashMap<>();

    public void addEdge(int u, int v) {
        map.putIfAbsent(u, new ArrayList<>());
        map.putIfAbsent(v, new ArrayList<>());
        map.get(u).add(v);
    }

    public void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);

        System.out.print("BFS Traversal: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : map.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(n)) {
                    q.add(n);
                    visited.add(n);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BFS g = new BFS(); // ✅ Fixed
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.bfs(1);
    }
}
