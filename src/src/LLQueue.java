public class LLQueue implements IQueue {
    private SinglyLL data;

    public LLQueue() {
        data = new SinglyLL();
    }

    public int size() {
        return data.size();
    }
    public boolean isEmpty() {
        return data.size() == 0;
    }

    public void add(Object item) {
        data.addLast(item);
    }

    public Object first() {
        return data.first();
    }

    public Object remove() {
        return data.removeFirst();
    }
}