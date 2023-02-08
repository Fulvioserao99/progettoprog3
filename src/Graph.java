import java.util.ArrayList;

public abstract class Graph<T>{

    private MultiMap<Integer, Integer> edges;
    private ArrayList<T> nodes;

    Graph(){
        edges = new MultiMap<>();
        this.nodes = new ArrayList<>();

    }
    public void addEdge(Integer source, Integer dest){
        this.edges.put(source,dest);
    }

    public MultiMap<Integer, Integer> getEdges(){
        return this.edges;
    }

    public void addNode(T node){
        this.nodes.add(node);
    }

    public T getNode(int index){
        return this.nodes.get(index);
    }
    public abstract void graphGen();
}
