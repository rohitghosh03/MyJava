import java.util.*;

public class DFS {

    Map<Integer, ArrayList<Integer>> map = new HashMap<>();

    public void addEdge(int u, int v) {
        map.putIfAbsent(u, new ArrayList<>());
        map.putIfAbsent(v, new ArrayList<>());
        map.get(u).add(v);
        // map.get(v).add(u); // Uncomment for undirected
    }

    public void dfsHelper(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : map.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public void DFS(int start) {
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(start, visited);
        System.out.println();
    }

    public static void main(String[] args) {
        DFS g = new DFS();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.DFS(1);
    }
}
