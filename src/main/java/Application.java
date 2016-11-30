import Algos.FlotMax;
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

        List<Integer> zerfb = new ArrayList<>();
        zerfb.add(9);
        zerfb.add(1);
        zerfb.add(8);
        g.setChildren(5, zerfb);

        g.addEdge(2, 5, 3);
        g.addEdge(5, 1, 3);
        g.addEdge(1, 3, 2);

        System.out.println("Graphe : " + g.getChildren());

        new FlotMax(g, 2, 3);
    }
}
