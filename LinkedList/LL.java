package LinkedList;

public class LL {
    public class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;
        }
    }
    node head=null;
    int size=0;

    //addfirst
    void addatfirst(String data){
        node newnode=new node(data);
        size++;
        if(head == null){
            head=newnode;
            
            return;
        }
        newnode.next=head;
        head=newnode;
        
    }


    //printlist
    void printlist(){
        if(head == null){
            System.out.print("List is Empty");
            return;
        }
        node curr=head;
        while(curr!=null){
            System.out.print(curr.data + "->");
            curr=curr.next;
        }
        System.out.print("NULL");       
    }


    //addlast
    void addlast(String data){
        node newnode=new node(data);
        size++;
        if(head == null){
            head=newnode;
            return;
        }
        node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;
    }


    //deletefirst
    void deletefirst(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        size--;
        head=head.next;
    }


    //deletelast
    void deletelast(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node curr=head;
        node curr2=head.next;
        while(curr2.next!=null){
            curr=curr.next;
            curr2=curr.next;
        }
        curr.next=null;
    }

    //getindex
    void getindex(String data){
        node curr=head;
        int count=0;
        while(curr!=null){
            if(curr.data.equals(data)){
                System.out.println(data +" is at index :"+count);
                return;
            }
            count++;
            curr=curr.next;
        }
        System.out.println("Element not present in the list");
    }

    //search
    void search(String data){
        node curr=head;
        while(curr!=null){
        if(curr.data.equals(data)){
            System.out.println("Found");
            return;
        }
        curr=curr.next;
        }
        System.out.println("Not found");
    }
    //length
    void length(){
        if(head == null){
            System.out.print("list is empty");
        }
        node curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        System.out.println("Length of linked list is"+count);
        
    }
    //size without any suncion
    int getlength(){
        return size;
    }

    //delete particular
    void delete(String data){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        if(head.data.equals(data)){
            head=head.next;
            return;
        }
        node curr=head;
        while(curr.next!=null){
        if(curr.next.data.equals(data)){
            curr.next=curr.next.next;
            return;
        }
        curr=curr.next;
    }
    System.out.println("Data not found");
}

    // reversing a list
    void reverselist(){
        if(head == null|| head.next==null){
            return;
        }
        node prev=head;
        node curr=head.next;
        while(curr!=null){
            node nextnode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextnode;

        }
        head.next=null;
        head=prev;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addatfirst("apple");
        list.addlast("a");
        list.printlist();
        list.reverselist();
        System.out.println();
        list.printlist();
        System.out.println();
        System.out.println("Size is "+list.getlength()); 
        
}
}
