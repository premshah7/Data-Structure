
public class Insertion {
    class Node{
        int data;
        Node link;
        
            Node(int data){
                this.data = data;
                this.link = null;
            }
    }  
    
    //adding at firstPosition
    public void addFirst(int data){
        Node newN = new Node(data);
        if(head == null){
            head = newN;
            return;
        }
        newN.link = head;
        head = newN;
    }

    public static void main(String[] args) {
        Insertion i = new Insertion();
        i.addFirst(5);
        i.addFirst(3);
    }
}
