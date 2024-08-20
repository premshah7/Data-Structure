import java.util.*;

class Node {
    int data;
    Node link;

    public Node(int data) {
        this.data = data;
    }
}

class LL {
    Node first;

    public void ins_First(int data) {
        Node n = new Node(data);
        if (first == null) {
            first = n;
        } else {
            n.link = first;
            first = n;
        }
    }

    public void ins_Last(int data) {
        Node n = new Node(data);
        Node save = first;
        if (first == null) {
            first = n;
        } else {
            while (save.link != null) {
                save = save.link;
            }
            save.link = n;
        }
    }

    public void delete(int data) {
        if (first == null) {
            System.out.println("Linked List is empty");
        } else {
            Node save = first;
            Node temp = save;
            if (data == first.data) {
                first = first.link;
                return;
            }
            while ((save.link != null) && (save.data != data)) {
                temp = save;
                save = save.link;
            }
            if ((save.link == null) && (save.data != data)) {
                System.out.println("Node not found !");
            } else {
                temp.link = save.link;
            }
        }
    }

    public void deleteFirst(){
        if(first==null){
            System.out.println("Linked List is empty");
        }
        else{
            Node save=first;
            Node temp=save;
            if(first.data==first.data){
                first=first.link;
            }
        }
    }

    public LL copyLinkedList(Node first, LL l) {
        LL l1 = new LL();
        Node save = first;
        while (save != null) {
            l1.ins_Last(save.data);
            save = save.link;
        }
        return l1;
    }

    public void countNodes() {
        int count = 0;
        if (first == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.link;
        }
        System.out.println("Total no. of nodes in linked list are : " + count);
    }

    public Node reverse(){
        Node prev = null;
        Node temp = first;
        Node next = null;
        while(temp!=null){
            next = temp.link;
            temp.link = prev;
            prev = temp;
            temp = next;
        }
        first = prev;
        return prev;
    }

    public void display() {
        if (first == null) {
            System.out.println("Linked List is empty");
        }
        System.out.println("list is : ");
        Node temp = first;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }
}

// main class
public class LinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL l1 = new LL();
        boolean flag = true;
        // while (flag) {
        //     System.out.print(
        //             "\nEnter:- \n1 to insert at start :\n2 at end :\n3 to delete :\n4 to display :\n5 to count nodes :\n6 to exit : \n");
        //     int n = sc.nextInt();

        //     switch (n) {
        //         case 1:
        //             int f = sc.nextInt();
        //             l1.ins_First(f);
        //             break;

        //         case 2:
        //             int e = sc.nextInt();
        //             l1.ins_Last(e);
        //             break;

        //         case 3:
        //             int d = sc.nextInt();
        //             l1.delete(d);
        //             break;

        //         case 4:
        //             l1.display();
        //             break;

        //         case 5:
        //             l1.countNodes();
        //             break;

        //         case 6:
        //             flag = false;
        //             l1.display();

        //     }
        // }

        l1.ins_First(5);
        l1.ins_First(4);
        l1.ins_First(0);
        l1.display();
        l1.reverse();
    }
}
