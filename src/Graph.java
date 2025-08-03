import java.util.*;
public class Graph {
    Map<Integer,ArrayList<Integer>>map=new HashMap<>();

    public void addEdge(int u,int v){
        map.putIfAbsent(u,new ArrayList<>());
        map.putIfAbsent(v,new ArrayList<>());
        map.get(u).add(v);
        map.get(v).add(u);//for undirected
    }

    public void printGraph() {
        for (int node : map.keySet()) {
            System.out.print(node + " -> ");
            for (int neighbor : map.get(node)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        g.addEdge(4, 5);

        g.printGraph();



//    int[][]adjMat;
//    int numnodes;
//
//    public Graph(int n){
//        numnodes=n;
//        adjMat=new int[n+1][n+1];
//    }
//
//    public void addEdge(int u,int v){
//        adjMat[u][v]=1;
//    }
//    public void printgraph(){
//        for(int i=1;i<=numnodes;i++){
//            for(int j=1;j<=numnodes;j++){
//                System.out.print(adjMat[i][j] + " ");
//            }
//            System.out.println();
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        Graph g = new Graph(5);   // No constructor with arguments
//
//        g.addEdge(1, 2);
//        g.addEdge(1, 3);
//        g.addEdge(2, 4);
//        g.addEdge(3, 4);
//        g.addEdge(4, 5);
//
//        g.printgraph();
    }


}
