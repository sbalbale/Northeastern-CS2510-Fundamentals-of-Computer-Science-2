# uk.ac.nulondon:hw05

DUE Friday March 22nd, 11:59pm

This is a formative assignment.

See Creating and Exporting a Project on how to create/zip your project.

In this homework we will be storing words using a tree. This data structure has a better worst case runtime compared to a hash table, but is not often used because of the complexities of maintaining the tree. In addition, the hash table has a much better expected runtime.

This homework will give you practice on searching trees and building them on your own. The data structure defined here is a variant of something called a trie. It is easy to find implementations online. You should not use online code, but instead build your own as practice for the quiz.

Idea: Use a data structure that takes advantage of common prefixes. Consider the following list of words:

“CAB” “CAT” “CABIN” “CART” “CATCH” “COB” “CORE” “COME”

Each shares many of the same prefixes.

Now consider a piece of a tree structure:

Screenshot 2024-03-12 at 3.31.13 PM.png

Each path from root is a potential word in our data structure. To search for a word, we follow the path character by character to see if it is in the tree. For example to search for the word CAT, we search for “C” then we look for an “A” in its set of children, then at the “A”node we look to see if there is a child node where “T” should be located. (We will explain more about how we know if the word is in the collection of words later.) If we searched for the word “COW” we would first look for the “C” then see that there was an “O” in the children of “C”. Then we look at the children of “O” we see that we only have “B”, “M”, and “R”. So it is not in the collection of words.

In the structure above it would appear that “CAR” was in our list of words, but this is a side effect because the word “CART” was stored. We could use a boolean to flag if the character represent the last character of a word in the collection of words. In our structure we will instead use an int to record the count of words so that we can store multiple instances of words in the structure.

So in the above, the nodes containing the character B on the left side of the tree would have a 1 stored in it because the word “CAB” is in the list. The node with the R on the left side would contain a 0 as the word car has not been inserted. Once the word car was inserted it would not created new nodes, but increment a counter.

Since words will start with up to 26 different characters and we can only have one root, the root node would not contain a character that is meaningful.

Consider that we wanted to store the word cat and dog, the tree structure would look like this:

Screenshot 2024-03-12 at 3.31.25 PM.png

The structure will need nodes defined similar to how we have done with our binary search trees. Unlike our search trees, this will only be fined for English words. Besides a Character to store the character, the node will also have an int which will refer to the count of words from that node to root in the collection. We will also need to store the set of references to children. There are some options you can choose. One possibility is a linked list of references to nodes. This would be a sorted linked list. You could also do an array of references. It would be of size 26, one for each potential Character in the alphabet.

The interface for your structure should have the following methods:

// returns true if the word is in the tree
public boolean search(String x);

// returns the number of instances of the word x in the tree
public int count(String x);

// creates the necessary nodes to store the word or increments the count if it exists.
public boolean insert(String x);

// decrements the count of words in the tree, it does not remove nodes
public boolean remove(String x);

// toString will create a string representation of the trie.
// The method should indent at each level in the tree, the number of
// spaces should be the depth in the tree.
// It should print the character and the count

// So for the cat dog tree above we would get the String

root
C (0)
A (0)
T (1)
D (0)
O (0)
G (1)

public String toString();
Notes
Test your functions. You should test each of the above functions. Feel free to use the toString method as needed.
You will likely need helper functions, feel free to include additional functions as needed.
Comment/document your code! We expect JavadocLinks to an external site. comments for this assignment. These comments should follow Javadoc conventions/formatting and include a description of the method's functionality, parameters, and return values.
Use the Maven zip plugin to zip your project!

Java version 21

Generated at 2024-03-13 17:22:50
