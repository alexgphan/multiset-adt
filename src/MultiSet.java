public abstract class MultiSet {
    public abstract <T> boolean add(T item);

    public abstract <T> void remove(T item);

    public abstract <T> boolean contains(T item);

    public abstract <T> boolean is_empty(T item);

    public abstract <T> int count(T item);

    public abstract <T> int size();

}
