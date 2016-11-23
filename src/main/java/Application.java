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
        List<Integer> list2 = new ArrayList<>();
        list2.add(55);
        g.setChildren(2, list2);
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        g.setChildren(5, list1);

        System.out.println(g.getChildren(9));

        System.out.println(g.toString());
    }
}
