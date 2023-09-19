import java.util.TreeSet;

public class Tree <T> {
    private TreeSet<T> tree;

    public boolean isEmpty() {
        return tree.isEmpty();
    }

    public int length() {
        return tree.size();
    }

    public int count(T item) {
        int count = 0;
        for (T thing : tree) {
            if (thing == item) {
                count ++;
            }
        }
        return count;
    }

    public boolean contains(T item) {
        return tree.contains(item);
    }

    public String toString() {
        return tree.toString();
    }