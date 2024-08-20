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

    public void copy() {
        LL l1 = new LL();
        Node save = first;
        while (save != null) {
            l1.ins_First(save.data);
            System.out.print(save.data + " ");
            save = save.link;
        }
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
public class CopyLL {
    public static void main(String[] args) {
        LL l1 = new LL();
        l1.ins_Last(10);
        l1.ins_Last(20);
        l1.ins_Last(30);
        l1.copy();
        // l1.display();
    }
}