public interface IQueue {
    int size();
    boolean isEmpty();
    Object first();
    void add(Object item) throws QueueFullException;
    Object remove();
}
