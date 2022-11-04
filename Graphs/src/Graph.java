import java.util.*;

public class Graph <T>{

    private Map<T, List<T>> map = new HashMap<>();

    private void addVertex(T v){
        map.put(v,new LinkedList<>());
    }

    public void addEdges(T v, T u,Boolean directed){
        if (!map.containsKey(v)){
            addVertex(v);
        }
        if (!map.containsKey(u)){
            addVertex(u);
        }
        map.get(v).add(u);
        if (directed==false){
            map.get(u).add(v);
        }
    }

    public void printAdj(){
        System.out.println(map);
    }



    public static void main(String[] args) {
        Graph<Integer> g = new Graph<>();
        g.addEdges(0,1,false);
        g.addEdges(1,2,false);
        g.addEdges(1,4,false);
        g.addEdges(2,3,false);
        g.addEdges(3,0,false);
        g.addEdges(4,2,false);
        g.printAdj();

    }





}
