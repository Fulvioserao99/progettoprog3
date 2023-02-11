package com.example.robot_3;

public abstract class Graph<T>{

    private MultiMap<Integer, Integer> edges;


    Graph(){
        edges = new MultiMap<>();


    }

    public void addEdge(Integer source, Integer dest){
        this.edges.put(source,dest);
    }

    public MultiMap<Integer, Integer> getEdges(){
        return this.edges;
    }

    public abstract T getNode(Integer index);
    public abstract void graphGen();
}
