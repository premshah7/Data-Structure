import java.util.*;
class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

class Queue{
    Node top;

    public void enqueue(int x){
        
        Node newNode = new Node(x);
        if(top==null){
            top = newNode;
        }
        else{
            Node n = top;
            while(n.link!=null){
                n = n.link;
            }
            n.link = newNode;
        }      
    }

    public void dequeue(){
        if (top == null){
            System.out.println("stack Underflow");
        }
        top = top.link;
    }

    public int peek(){
        return top.data;
    }

    public void display(){
        Node n = top;
        System.out.print("Queue is :");
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.link;
        }
        System.out.println();
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q =new Queue();
        boolean flag = true;
        while (flag) {
            System.out.print("Enter 1 to add, \n2 to delete, \n3 to peek, \n4 to display, \n5 to stop : ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    int f = sc.nextInt();
                    q.enqueue(f);
                    break;

                case 2:
                    int e = sc.nextInt();
                    q.dequeue();
                    break;

                case 3:
                    int d = sc.nextInt();
                    q.peek();
                    break;

                case 4:
                    q.display();
                    break;

                case 5:
                    flag = false;
                    q.display();

            }
        }
    }
}
