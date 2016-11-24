package Graph;
import java.util.ArrayList;
import java.util.List;

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
            if(parent != child) {
                root.get(parent).add(child);
                if(!root.get(child).contains(parent))
                    root.get(child).add(parent);
            }
        }
    }

    public void setChildren(int parent, List<Integer> children, List<Integer> weights){
        for (int child : children) {
            if(parent != child) {
                addEdge(parent, child, weights.get(children.indexOf(child)));
                root.get(parent).add(child);
                if(!root.get(child).contains(parent))
                    root.get(child).add(parent);
            }
        }
    }

    public void setChildren(int parent, List<Integer> children, int weight){
        for (int child : children) {
            if(parent != child) {
                addEdge(parent, child, weight);
                root.get(parent).add(child);
                if(!root.get(child).contains(parent))
                    root.get(child).add(parent);
            }
        }
    }

    public void addEdge(int parent, int child, int weight){
        weights[parent][child] = weight;
        weights[child][parent] = weight;
    }

    public void displayWeights(){
        for (int i = 0; i < weights.length; ++i){
            for(int j = 0; j < weights.length; ++j) {
                if(weights[i][j] == 0)
                    System.out.print("x");
                else
                    System.out.print(weights[i][j]);
            }
            System.out.println();
        }
    }

    public void displayWeights(int vertex, int vertex2){
        if(weights[vertex][vertex2] == 0)
            System.out.println("Les sommets " + vertex + " et " + vertex2 + " ne sont pas reliés");
        else
            System.out.println("Le poids entre " + vertex + " et " + vertex2 + " est de : " + weights[vertex][vertex2]);
    }

    public List<Integer> getChildren(int parent) {
        return root.get(parent);
    }

    @Override
    public String toString() {
        return "Graphe : " + root;
    }
}
