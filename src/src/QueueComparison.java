public class QueueComparison {
    static ArrayQueue aq = new ArrayQueue(10000);
    static LLQueue llq = new LLQueue();
    public static void main (String[] args) throws QueueFullException {

        //inputting 5000 elements to ArrayQueue
        for(int i = 0; i < 5000; i++){
            int c = (int) (Math.random() * 10);
            aq.add(c);
        }

        //number of runs
        int counter = 5000000;

        //Code to run ArrayList TimeStamps
        double beginA =  System.currentTimeMillis();
        for (int i = 0; i < counter; i++){
            deQueue();
            enQueue();
        }
        double afterA = System.currentTimeMillis();
        double elapsedA = afterA - beginA;

        System.out.println("The time needed to complete ArrayQueue is " + elapsedA + " ms.");

        //Code to run LinkedList TimeStamps
        double beginLL =  System.currentTimeMillis();
        for (int i = 0; i < counter; i++){
            deQueueLL();
            enQueueLL();
        }
        double afterLL = System.currentTimeMillis();
        double elapsedLL = afterLL - beginLL;

        //Print Statements to show to console
        System.out.println("The time needed to complete LinkedListQueue is " + elapsedLL + " ms.");

        if (elapsedA == elapsedLL)System.out.println("Their efficiency is the same through " + counter + " operations.");
        else if (elapsedA > elapsedLL){
            System.out.println("The LinkedListQueue is faster by " + (elapsedA - elapsedLL)+ " ms through " + counter + " operations.");
        }
        else {
            System.out.println("The ArrayQueue is faster by " + (elapsedLL - elapsedA)+ " ms through " + counter + " operations.");
        }

    }

    //enQueue and DeQueue Runs for ArrayQueue
    public static void enQueue() throws QueueFullException {
        int c = (int) (Math.random() * 10);
        aq.add(c);
    }
    public static void deQueue() {
        aq.remove();
    }
    //enQueue and DeQueue for LLQueue
    public static void enQueueLL(){
        int c = (int) (Math.random() * 10);
        llq.add(c);
    }
    public static void deQueueLL(){
        llq.remove();
    }
}


