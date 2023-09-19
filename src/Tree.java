import org.w3c.dom.Node;
import java.util.*;
import java.util.TreeSet;


/*public class TreeSet <T> {

    private TreeSet tree;

    public TreeSet() {
        this.tree = new Treeset();
    }
}*/
public class Tree <T> {
    private Node root1;

    private T root;
    private List<T> subtree;

    public Tree() {
        this.root = null;
        this.subtree = null;
    }
    public Tree(T root, List<T> subtree) {
        this.root = root;
        this.subtree = subtree;
    }
    public T getRoot() {
        return root;
    }
    public List<T> getSubtree() {
        return subtree;
    }

    public boolean isEmpty() {
        // Filler code
        return root == null;
    }

    public int length() {
        // Filler code
        return 1;
    }

    public int count(T item) {
        return 3;
    }

    public boolean contains(T item) {
        return False;
    }

    public String toString() {
        return "Test";
    }

    public String indentedToString() {
        return "Test";
    }

    public double average() {
        /*
        This is going to work only on a tree of numbers by getting the sum of all the roots in the tree
        using recursion and then dividing by the number of nodes visited.
         */
        return 3.0;
    }

    @Override
    public boolean equals(Object obj) {
        /*
        This function needs to check the root of the object being compared and then the roots of all
        subtrees underneath as well.
         */
        // return super.equals(obj);
        return true;
    }

    public boolean contains(T item) {
        /* This function would have basecase of root equaling item and then returning true.
        Else it would go into all subtrees until is empty is triggered on all of them and then return
        false.
         */
        return true;
    }

    public List<T> leaves() {
        /*
        Returns a list of all the nodes with no subtrees.
         */
        return true;
    }

    public boolean deleteItem(T targetForDeletion) {
        /*
        Returns True if the item is within the tree and then removed.
         */
        return true;
    }

    public void deleteRoot() {
        /*
        This gets rid of the root and either becomes an empty tree or it replaces the root
        with the root values of the last tree in the subtrees.
         */
    }

    public T extractLeaf() {
        /*
        Remove the leftmost leaf inside the tree and return that root value.
         */
    }

    public void insert(T item) {

    }

    public boolean insertChild(T child, T parent) {
        /*
        Look for root that has same value as parent and add child in the subtrees of parent.
        If it finds parent then return True.
         */
    }

}
