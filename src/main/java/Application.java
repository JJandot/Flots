import Graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Graph g = new Graph(10);
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        g.setChildren(2, list);

        List<Integer> liste = new ArrayList<>();
        liste.add(1);
        liste.add(3);
        liste.add(2);
        g.setChildren(1, liste);

        g.addEdge(5, 2, 3);
        g.displayWeights();
        g.displayWeights(2, 5);

        System.out.println(g.toString());
    }
}
