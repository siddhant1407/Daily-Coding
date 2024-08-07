import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ClassroomDFS {
    public static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }


    public static void dfs(ArrayList<Edge> graph [], int curr, boolean visited[]) {
        // 1) Print the start
        System.out.print(curr +" ");
        
        // 2) Assign the curr to true as now visited
        visited[curr] = true;

        // 3) get the neighbor recursively.
        for (int i=0; i<graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if (visited[edge.des] == false){
                dfs(graph, edge.des, visited);
            }
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        for (int i=0; i<graph.length; i++){
            // every graph point will have a edgelist
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }



    public static void main(String[] args) {
        int v = 7;
        // APPROACH1- Using Adjacency List.
        ArrayList<Edge> graph [] = new ArrayList[v];

        createGraph(graph);
        
        // For DFS
        boolean visited[] = new boolean[v];
        // if the graphs is disconnected! Then follow this loop to get the start at each one.
        for (int i=0; i<graph.length; i++){
            if (visited[i]==false){
                dfs(graph, i, visited );
            }
        }
        System.out.println();
        
    }
}
