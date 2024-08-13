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

    public Node sor(){
        Node save = first;
        Node temp = null;
        while(save != null){
            temp = save.link;
            while(temp != null){
                if(save.data > temp.data){
                    int td = save.data;
                    save.data = temp.data;
                    temp.data = td;
                }
                temp = temp.link;
            }
            save = save.link;
        }
        return first;
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
public class SortLL {
    public static void main(String[] args) {
        LL l = new LL();
        l.ins_First(5);
        l.ins_First(3);
        l.ins_First(2);
        l.ins_First(6);
        l.ins_First(1);
        l.sor();
        l.display();
    }
}
