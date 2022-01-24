public class QueueFullException extends Exception{
    public QueueFullException () {
        System.out.println("The Queue is Full");
    }
    public QueueFullException (String x) {
        System.out.println(x);
    }
}
