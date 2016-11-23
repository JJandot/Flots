package Graph;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<List<Integer>> root;

    public Graph() throws IndexOutOfBoundsException{
        root = new ArrayList<>();
    }

    public void setChilds(int parent, List<Integer> childs){
        if(root.indexOf(parent) == -1) {
            parent = getLastParent(parent);
        }
        root.add(parent, new ArrayList<Integer>());
        List<Integer> parentList = root.get(parent);
        parentList.addAll(childs);
    }

    private int getLastParent(int parent){
        if(root.isEmpty())
            return 0;
        for(int i = 0; i < parent; ++i)
            if (root.get(i) != null)
                parent = i + 1;
        return parent;
    }

    public List<Integer> getChildrens(int parent) throws IndexOutOfBoundsException {
        return root.get(parent) == null ? null : root.get(parent);
    }

    @Override
    public String toString() {
        return "Graph.Graph{" +
                "root=" + root +
                '}';
    }
}
