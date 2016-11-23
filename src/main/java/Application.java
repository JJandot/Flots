import Graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Graph g = new Graph();
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(4);
        list.add(6);
        g.setChilds(2, list);
        List<Integer> list1 = new ArrayList<>();
        list1.add(7);
        list1.add(8);
        list1.add(9);
        g.setChilds(5, list1);


        try {
            g.getChildrens(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("mdr t nul");
        }
    }
}
