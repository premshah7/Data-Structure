
class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}
class LinkedList{
    Node first=null;
    Node tail=null;

    public void insert(int data){
        Node newNode = new Node(data);
        if(first==null){
            first = newNode;
            tail = newNode;
        }
        else{
            tail.link=newNode;
            tail = newNode;
        }
    }

    public void display(){
        Node n=first;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.link;
        }
        System.out.println();
    }

    public void removeDuplicate(){
        if(first == null) return;
        Node current = first;
        Node n=null , m=null;

        while(current != null){
            n = first;
            m = current.link;
            while(m != null){
                if(current.data == m.data){
                    n.link = m.link;
                }
                else{
                    n = m;
                }
                m = m.link;
            }
            current = current.link;
        }
    }

}

public class RemoveDuplicates {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(2);
        list.insert(4);
        list.insert(1);
    
        list.display();

        list.removeDuplicate();
        list.display();
    }
}
