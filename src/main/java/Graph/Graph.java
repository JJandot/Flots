package Graph;
import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<List<Integer>> root;

    public Graph(int initCapacity) {
        root = new ArrayList<>(initCapacity);
        for (int i = 0; i < initCapacity; ++i)
            root.add(i, new ArrayList<Integer>());
    }

    public void setChildren(int parent, List<Integer> children){
        if(!root.get(parent).isEmpty()){
            List<Integer> temp = root.get(parent);
            for (int i : temp)
                children.add(i);
        }
        root.add(parent, children);
    }

    public List<Integer> getChildren(int parent) {
        return root.get(parent) == null ? null : root.get(parent);
    }

    @Override
    public String toString() {
        return "Graphe : " + root;
    }
}
