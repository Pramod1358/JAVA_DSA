package Stack;

public class StackLL {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
        }
    }
    static class Stack{
        public static node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            node nn=new node(data);
            if(isEmpty()){
                head=nn;
                return;
            }
            nn.next=head;
            head=nn;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }

}
