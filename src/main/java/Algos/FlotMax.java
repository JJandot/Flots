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
        flot.add(debut);

        calcFlot(debut, fin);
        System.out.println("flot max = " + flotMax);
        System.out.println(flot);
    }

    private void calcFlot(int debut, int fin){

    }



}
