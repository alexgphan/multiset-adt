
public class TreeMultiSet extends MultiSet {
    private Tree tree;

    public TreeMultiSet() {
        this.tree = new Tree();
    }

    public <T> boolean add(T item) {
        tree.insert(item);
        return true;
    }

    public <T> void remove(T item) {
        tree.delete_item(item);
    }

    public <T> boolean contains(T item) {
        return tree.contains(item);
    }

    public boolean is_empty() {
        return tree.is_empty();
    }

    public <T> int count(T item) {
        return tree.count(item);
    }

    public int size() {
        return tree.length();
    }
}
