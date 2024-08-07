import java.util.*;

public class ClassroomVisitallPaths {
    public static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }


    public static void printAllPaths(ArrayList<Edge> graph [], boolean visited[], int curr, String path, int tar) {
        // base case when we reach one of the target, print the path.
        if (curr == tar ){
            System.out.println(path);
            return;
        }
        // 1) get the neighbor recursively.
        for (int i=0; i<graph[curr].size();i++){
            Edge edge = graph[curr].get(i);
            if (visited[edge.des] == false){
                // set them to true for an indication that we visited them and not to come back.
                visited[curr] = true;
                printAllPaths(graph, visited, edge.des, path+edge.des, tar);
                // set to false again while returning so that other paths may use this node.
                visited[curr] = false;
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
        int src = 0;
        int tar = 5;
        int curr = src;
        boolean visited [] = new boolean[7];
        printAllPaths(graph, visited, curr, ""+ src, tar);
        
        System.out.println();
        
    }
}
