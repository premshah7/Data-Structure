import java.util.*;
class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

class Stack{
    Node top;

    public void push(int x){
        Node newNode = new Node(x);
        newNode.link = top;
        top = newNode;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack Underflow");
            return;
        }
        top = top.link;
    }

    public int peek(){
        return top.data;
    }

    public void display(){
        Node n=top;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.link;
        }
        System.out.println();
    }
}

public class StackUsingLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Stack st = new Stack();
        
        while (flag) {  
            System.out.print("Enter 1 to add, \n2 to delete, \n3 to peek, \n4 to display, \n5 to stop : ");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    int f = sc.nextInt();
                    st.push(f);
                    break;

                case 2:
                    int e = sc.nextInt();
                    st.pop();
                    break;

                case 3:
                    int d = sc.nextInt();
                    st.peek();
                    break;

                case 4:
                    st.display();
                    break;

                case 5:
                    flag = false;
                    st.display();

            }
        }
    }
}
