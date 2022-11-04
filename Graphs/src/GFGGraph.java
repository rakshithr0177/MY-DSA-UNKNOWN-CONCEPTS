import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GFGGraph {

    private LinkedList<Integer> adj[];
    public GFGGraph(int v){
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source , int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public ArrayList<Integer> BFS(){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean []visited = new boolean[adj.length];

       for (int i = 0; i < adj.length; i++) {
            if(!visited[i] ){
                bfs( i, visited ,ans);
            }
        }
        return ans ;
    }

    private void bfs(int source , boolean []visited ,ArrayList<Integer> ans ){
        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        visited[source] =  true;
        while(!q.isEmpty()){
            int removedElement = q.poll();
            ans.add(removedElement);
            for (int i = 0; i < adj[removedElement].size(); i++) {
                int currV = adj[removedElement].get(i);
                if (visited[currV] == false){
                    q.add(currV);
                    visited[currV]=true;
                }

            }
        }
    }


    public ArrayList<Integer> DFS(){
        ArrayList<Integer> ans = new ArrayList<>();
        boolean []visited = new boolean[adj.length];

        for (int i = 0; i < adj.length; i++) {
            if(!visited[i] ){
                dfs( i, visited ,ans);
            }
        }
        return ans ;
    }

    private void dfs(int source, boolean[] visited, ArrayList<Integer> ans) {
        ans.add(source);
        visited[source] = true ;
        for (int i = 0; i < adj[source].size(); i++) {
            int currV = adj[source].get(i);
            if (visited[currV] == false){
                dfs(currV,visited,ans);
            }
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int verticesCount = rd.nextInt();
        int edgesCount = rd.nextInt();

        GFGGraph g = new GFGGraph(verticesCount);

        for (int i = 0; i < edgesCount; i++) {
            int source = rd.nextInt();
            int destination = rd.nextInt();
            g.addEdge(source,destination);
        }

        System.out.println(g.DFS());

    }

}
