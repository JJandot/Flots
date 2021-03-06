package Graph;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.exit;

public class Graph {

    private List<List<Integer>> root;
    private int[][] weights;

    public Graph(int initCapacity) {
        root = new ArrayList<>(initCapacity);
        for (int i = 0; i < initCapacity; ++i)
            root.add(i, new ArrayList<Integer>());
        weights = new int[initCapacity][initCapacity];
    }

    public void setChildren(int parent, List<Integer> children){
        for (int child : children) {
            if(parent != child)
                root.get(parent).add(child);
        }
    }

    public void setChildren(int parent, List<Integer> children, List<Integer> weights){
        for (int child : children) {
            if(parent != child) {
                addEdge(parent, child, weights.get(children.indexOf(child)));
                root.get(parent).add(child);
            }
        }
    }

    public void setChildren(int parent, List<Integer> children, int weight){
        for (int child : children) {
            if(parent != child) {
                addEdge(parent, child, weight);
                root.get(parent).add(child);
            }
        }
    }

    public void addEdge(int parent, int child, int weight){
        if(getChildren(parent).contains(child))
            weights[parent][child] = weight;
        else {
            System.out.println("Erreur, " + parent + " n'est pas relié à " + child);
            System.out.println("Revoir les arguments de addEdge (graphe orienté)");
            exit(-1);
        }

    }

    public int[][] getWeights(){
        return weights;
    }

    public int getWeights(int vertex, int vertex2){
        return weights[vertex][vertex2];
    }

    public List<Integer> getChildren(int parent) {
        return root.get(parent);
    }

    public List<List<Integer>> getChildren(){
        return root;
    }

    @Override
    public String toString() {
        return "Graphe : " + root;
    }
}
