import java.util.*;
class MyStack{
    int top=-1;
    int[] st = new int[5];

    void push(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be pushed: ");
        int ele = sc.nextInt();
        if(top>=4){
            System.out.println("Stack is full");
        }
        else{
            top++;
            st[top] = ele;
            
        }
    }

    void peep(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("The top element is: "+st[top]);
        }
    }

    void change(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to be changed: ");
        int ele = sc.nextInt();
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            for(int i=0;i<=top;i++){
                if(st[i]==ele){
                    System.out.print("Enter the new element: ");
                }

            }

        }
    }

    void display(){
        System.out.println("Stack is : ");
        for(int i=0;i<=top;i++){
            System.out.println(st[i]);
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
        else{
            top--;
        }
    }
}

public class fxns {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 to push, 2 to pop, 3 to peep, 4 to change, 5 to display, 6 to stop");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                s.push();
                break;

                case 2:
                s.pop();
                break;

                case 3:
                s.peep();
                break;

                case 4:
                s.change();
                break;

                case 5:
                s.display();
                break;

                case 6:
                flag = false;
                s.display();
            }

        }
        // s.push();
        // s.display();
    }
}
