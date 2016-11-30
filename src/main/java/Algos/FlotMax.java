package Algos;

import Graph.Graph;

import java.util.ArrayList;
import java.util.List;

public class FlotMax {

    private int debut;
    private int fin;
    private List<List<Integer>> neighboors;
    private int[][] weights;

    private int flotMax;
    private List<Integer> flot;

    public FlotMax(Graph graph, int debut, int fin) {
        this.debut = debut;
        this.fin = fin;
        this.weights = graph.getWeights();
        this.neighboors = graph.getChildren();

        flotMax = 0;
        flot = new ArrayList<>();
    }

    public void calcFlot(){
        neighboors.get(debut);
    }


}
