# uk.ac.nulondon:lab10

Problem 1: addNode
Write the method public void addNode(int value) that takes in a value and adds a new entry to the adjacency list for this value.

Problem 2: getNeighbors
Write the method public List<Integer> getNeighbors(int value) that takes in a value and returns all the nodes that share an edge with the value.

Problem 3: isConnected
Write the method public boolean isConnected(int v1, int v2) that takes in two values and returns true if they share an edge, false if not.

Problem 4: mutualFriends
Write the method public List<Integer> mutualFriends(int v1, int v2) that takes in two values and returns a list of integers who share an edge with both of the given values. This list should not contain duplicates.

For example, in the given graph:

Screenshot 2024-04-09 at 3.14.20 PM.png

Calling mutualFriends on 2 and 4 would return a list containing 1 and 3.

Problem 5: getConnectedNeighbors
Write the method public List<IntegerPair> getConnectedNeighbors(int value) that takes in a value and returns a list of of IntegerPair. This list should include all the neighbors of the given value that share an edge. This list should not contain duplicates.

For example, in the given graph:

Screenshot 2024-04-09 at 3.03.14 PM.png

Calling getConnectedNeighbors on 1 would return a list of (0, 4), (2, 3), and (3, 4).

Java version 21

Generated at 2024-04-10 23:17:05
