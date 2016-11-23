package Graph;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class GraphTest {

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