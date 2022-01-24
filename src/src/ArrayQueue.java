public class ArrayQueue implements IQueue {
    private Object[] data;
    private int CAP;
    private int head;
    private int tail;

    public ArrayQueue(){this(20);}

    public ArrayQueue(int capacity){
        this.CAP = capacity;
        data = new Object[capacity];
        head = 0;
        tail = 0;
    }

    public int size(){
        if(head == tail) return 0;
        else if(head < tail){
            return tail-head;
        }
        else{
            return tail+CAP-head;
        }
    }

    public boolean isEmpty(){return (size() == 0);}

    public void add (Object item) throws QueueFullException{
        if (size() == CAP - 1) throw new QueueFullException("No Space Left");
        data[tail] = item;
        tail = (++tail) % CAP;
    }

    public Object first(){
        if (isEmpty()) return null;
        return data[head];
    }

    public Object remove() {
        if(isEmpty()) return null;
        Object answer = data[head];
        data[head] = null;
        head = (++head)%CAP;
        return answer;
    }



}
