public class Main {
    public static void main(String[] args){
        Dequeue queue = new Dequeue(3);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.printArray();
        queue.add(4);
        queue.add(4);
        queue.add(4);
        queue.printArray();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(4);
        queue.add(4);
        queue.add(4);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(4);
        queue.add(4);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        System.out.println(queue.front);
        System.out.println(queue.rear);
        queue.printArray();
        queue.printQueue();
    }
}
