public class SinglyLL {
    private class LLNode{
        private Object element; //data
        private LLNode next;

        public LLNode (Object e, LLNode n){
            element = e;
            next = n;
        }
        public Object getElement(){return element;}
        public LLNode getNext(){return next;}
        public void setNext(LLNode n){next = n;}
    }
    private LLNode head;
    private LLNode tail;
    private int size;

    public SinglyLL(){}

    public int size(){return size;}

    public boolean isEmpty(){return (size == 0);}

    public Object first(){
        if(isEmpty()) return null;
        return head.getElement();
    }

    public Object last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }

    public void addFirst(Object e){
        head = new LLNode(e, head);
        if (isEmpty()) tail = head;
        size++;
    }

    public void addLast(Object e){
        LLNode newtail = new LLNode(e, null);
        if(isEmpty()) head = newtail;
        else tail.setNext(newtail);
        tail = newtail;
        size++;
    }

    public Object removeFirst(){
        if(isEmpty()) return null;
        Object answer = head.getElement();
        head = head.getNext();
        if(size == 1) tail=null;
        size--;
        return answer;
    }
}
