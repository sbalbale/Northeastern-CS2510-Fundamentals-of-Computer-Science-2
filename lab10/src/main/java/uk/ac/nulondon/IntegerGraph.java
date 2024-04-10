package uk.ac.nulondon;

import java.util.*;

public class IntegerGraph {
    // used when constructing/printing
    int nodeCount;
    Map<Integer, List<Integer>> adjListMap;

    // constructor
    public IntegerGraph(int v) {
        this.nodeCount = v;
        adjListMap = new HashMap<>();

        // initialize the adjacency list map
        // with node values from 0 to v
        for (int i = 0; i < v; i++) {
            adjListMap.put(i, new LinkedList<>());
        }
    }

    /**
     * Class to represent a pair of integers.
     * Overrides toString()
     */
    public static class IntegerPair {
        Integer v1;
        Integer v2;

        public IntegerPair(Integer v1, Integer v2) {
            this.v1 = v1;
            this.v2 = v2;
        }

        public String toString() {
            return String.format("(%s, %s)", v1, v2);
        }
    }

    /**
     * Add an edge to the graph from the
     * source node to the destination node
     * @param src source
     * @param dest destination
     */
    public void addEdge(int src, int dest) {
        // add an edge from src to dest
        adjListMap.get(src).add(dest);

        // add an edge from dest to src
        adjListMap.get(dest).add(src);
    }

    /**
     * Add a node to the graph with the
     * given value. You may assume the given
     * value is unique and not already in the graph.
     * @param value new value we're adding
     */
    public void addNode(int value) {
        //TODO: Your code here.
    }

    /**
     * Get the nodes connected to the node
     * with the given value.
     * @param value node we're looking for
     */
    public List<Integer> getNeighbors(int value) {
        //TODO: Your code here.
        return new ArrayList<>();
    }

    /**
     * Determines if the given two nodes
     * share an edge.
     * @param v1 node 1
     * @param v2 node 2
     */
    public boolean isConnected(int v1, int v2) {
        //TODO: Your code here.
        return false;
    }

    /**
     * Finds all the nodes that share edges
     * with both of the given values.
     * @param v1 node 1
     * @param v2 node 2
     * @return list of integers that share edges with both v1 and v2
     */
    public List<Integer> mutualFriends(int v1, int v2) {
        //TODO: Your code here.
        return new ArrayList<>();
    }

    /**
     * Given a node, return a list of pairs representing
     * the neighbors who share an edge with each other.
     * @param value source node
     * @return a list of integer pairs
     */
    public List<IntegerPair> getConnectedNeighbors(int value) {
        //TODO: Your code here.
        return new ArrayList<>();
    }

    /**
     * Prints the adjacency list representation
     * of this graph
     */
    public void printGraph() {
        for (int v = 0; v < nodeCount; v++) {
            System.out.print(v + ": ");
            for (Integer node : adjListMap.get(v)) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int V = 5;
        IntegerGraph graph = new IntegerGraph(V);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // print the adjacency list representation of the above graph
        graph.printGraph();

        // getMutualFriends
        // should return [2, 4]
        List<Integer> mutualFriends = graph.mutualFriends(1, 3);
        System.out.println("Mutual Friends");
        System.out.println(mutualFriends);

        // getConnectedNeighbors
        // should return (0, 4), (2, 3), (3, 4)
        List<IntegerPair> friends = graph.getConnectedNeighbors(1);
        System.out.println("Connected Neighbors");
        System.out.println(friends);
    }
}
