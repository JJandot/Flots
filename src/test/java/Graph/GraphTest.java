package Graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GraphTest {
    @Test
    public void setChildrenWeightList() throws Exception {
        Graph g = new Graph(10);
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        List<Integer> weights = new ArrayList<>();
        weights.add(5);
        weights.add(6);
        g.setChildren(2, integers,weights);
        for (int i : integers)
            assertThat(g.getWeights(2, i), equalTo(weights.get(integers.indexOf(i))));
    }

    @Test
    public void addEdge() throws Exception {
        Graph g = new Graph(10);
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        g.setChildren(2, integers);
        g.addEdge(2, 5, 6);
        assertThat(g.getWeights(2, 5), equalTo(6));
        assertThat(g.getWeights(5, 2), equalTo(6));
    }

    @Test
    public void getAndSetWeights() throws Exception {
        Graph g = new Graph(10);
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        g.setChildren(2, integers, 6);
        assertThat(g.getWeights(2, 5), equalTo(6));
    }

    @Test
    public void setAndGetChilds() {
        Graph g = new Graph(10);
        List<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(3);
        g.setChildren(2, integers);
        assertThat(g.getChildren(2), equalTo(integers));
    }
}