package com.rudra.DSA.Graphs;

import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        // Number of nodes and edges in the graph
        int n = 3, m = 3;

        // Create an array list to store the adjacency lists
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize the adjacency list with empty lists for each vertex
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        // Add edges to the graph
        // Edge 1---2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge 2---3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge 1---3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Print the adjacency list
        for (int i = 1; i <= n; i++) {
            System.out.print("Node " + i + ": ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
