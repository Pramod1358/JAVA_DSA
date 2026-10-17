package Queue;

public class CircularQueueArray {
    static class queue{
        static int arr[];
        static int size;
        static int front ;
        static int rear ;
        queue(int size){
            this.size=size;
            arr = new int[size];
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size ==  front;
        }
        public void add(int data){
            if(isFull()){
                System.out.print("Queue is full");
                return;
            }
            if(front == -1){
              front=0;   
            }
            rear = (rear+1) % size;
            arr[rear]=data;
        } 
        public void remove(){
            if(isEmpty()){
                System.out.print("Empty");
                return;
            }
             if(front == rear) {
               front=rear = -1;
           } else {
               front=(front+1)%size;
           }
        }

    }
    public static void main(String[] args) {
        queue q=new queue(2);
        q.add(5);
        q.add(4);
        
    }
}
