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

    public Node reverse(){
        Node prev = null;
        Node temp = first;
        Node next = null;
        while(temp != null){
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
public class Reverse {
    public static void main(String[] args) {
        LL l = new LL();
        l.ins_First(1);
        l.ins_First(2);
        l.ins_First(3);
        l.ins_First(4);
        // l.rev(l.first);
        l.display();
    }
}
