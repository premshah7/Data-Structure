import java.util.*;
class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
    }
}

class Cir{
    Node first;
    Node last;

    public void ins_first(int data) {
        Node n = new Node(data);
        if (first == null) {
            n.link = n;
            first = last = n;
        } else {
            n.link = first;
            last.link = n;
            first = n;
        }
    }

    public void ins_Last(int data){
        Node n = new Node(data);
        if (first == null) {
            n.link = n;
            first = last = n;
        } else{
            n.link = first;
            last.link = n;
            last = n;
        }
    }

    public void ins_ord(int data){
        Node n = new Node(data);
        if (first == null) {
            n.link = n;
            first = last = n;
        }
        if(n.data < first.data){
            n.link = first;
            last.link = n;
            first = n;
        }   
        else{
            Node save = first;
            while(save != last && n.data >= save.link.data){
                save = save.link;
            }
            n.link = save.link;
            save.link = n;
            if(save == last){
                last = n;
            }
        }
    }

    public void del_first(){
        if(first==null){
            return;
        }
        else{
            if(first!=last){
                first=first.link;
                last.link=first;
            }
            else{
                first=null;
                last=null;
            }
        }
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("list is : ");
        Node temp = first;
        while (temp.link != first) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
        System.out.print(temp.data + " ");
    }
}


public class CirLL{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cir l1 = new Cir();
        // boolean flag = true;
        // while (flag) {
        //     System.out.print("\nEnter:- \n1 to insert at start :\n2 at end :\n3 to delete :\n4 to display :\n5 to count nodes :\n6 to exit : \n");
        //     int n = sc.nextInt();
        //     switch (n) {
        //         case 1:
        //             int f = sc.nextInt();
        //             l1.ins_first(f);
        //             break;

        //         case 2:
        //             int e = sc.nextInt();
        //             l1.ins_last(e);
        //             break;

        //         // case 3:
        //         //     int d = sc.nextInt();
        //         //     l1.delete(d);
        //         //     break;

        //         case 4:
        //             l1.display();
        //             break;

        //         // case 5:
        //         //     l1.countNodes();
        //         //     break;

        //         case 6:
        //             flag = false;
        //             l1.display();

        //     }
        // }

        l1.ins_Last(5);
        l1.ins_Last(7);
        l1.ins_ord(4);
        l1.ins_ord(6);
        // l1.del_first();
        l1.display();
    }
}