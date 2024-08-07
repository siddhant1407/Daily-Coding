import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ClassroomBFS {
    public static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
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

    public static void bfs(ArrayList<Edge> graph [], boolean visited[], int start){
        Queue<Integer> que = new LinkedList<>();
        que.add(start);

        while (!que.isEmpty()){
            int curr = que.poll();

            // if the curr node is not visited before
            if (visited[curr] == false){
                // 1) print the unvisited node
                System.out.print(curr + " ");
                // 2) mark the unvisited node as visited by setting true
                visited[curr] = true;

                // 3)add its neighbors to the queue for traversal.
                for (int i=0; i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    que.add(e.des);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        int v = 7;
        // APPROACH1- Using Adjacency List.
        ArrayList<Edge> graph [] = new ArrayList[v];

        createGraph(graph);

        boolean visited[] = new boolean[v];

        // if the graphs is disconnected! Then follow this loop to get the start at each one.
        for (int i=0; i<graph.length; i++){
            if (visited[i]==false){
                bfs(graph, visited, i);
            }
        }
        System.out.println();
        
    }
}
