import java.util.Arrays;
public class Dequeue{
    int[] dequeue;
    int front;
    int rear;

     public Dequeue(int size){
         dequeue = new int[size];
         front = rear = 0;
     }

     public void add(int value){
        dequeue[rear] = value;
        rear++;
        if(checkRearOOB()) fixRear();
     }

     public int remove(){
        if(isEmpty()) throw new IllegalStateException();
        int temp = dequeue[front];
        front++;
        checkFrontOOB();
        return temp;
     }
    //checks if rear is and index out of bounds and places pointer at 0
     private boolean checkRearOOB(){
         if(rear == dequeue.length) return true;
         return false;
     }
    //checks if rear is and index out of bounds and places pointer at 0
     private void checkFrontOOB(){
         if(front == dequeue.length) front = 0;
     }
     private void fixRear(){
         if(front == 0) resizeQueue();
         else rear = 0;
     }

     private boolean isEmpty(){
         return front == rear;
     }
     //doubles length of queue
     private void resizeQueue(){
         int[] temp = new int[dequeue.length*2];

         int i = 0;
         while(front != rear){
             temp[i] = dequeue[front];
             front++;
             i++;
         }

         dequeue = temp;
         front = 0;
         rear = dequeue.length/2;
     }

     //FIX TO PRINT QUEUE RATHER THAN ARRAY
     public void printArray(){
         for(int i: dequeue){
             System.out.print(i + " ");
         }
         System.out.println("");
     }
     public void printQueue(){
         for(int i = front; i != rear; i++){
             if(i == dequeue.length && rear != 0) i = 0;
             else if(i == dequeue.length && rear == 0) break;
             System.out.print(dequeue[i] + " ");
         }
     }
}
