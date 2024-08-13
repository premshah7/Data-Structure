//NODE CLASS........
class Node{
    int data;
    Node lptr;
    Node rptr;

    Node(int data){
        this.data = data;
        lptr = null;
        rptr = null;
    }
}

//Doubly LL CLASS........
class Dll{
    Node head = null;
    Node tail = null;


    public void ins_First(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            tail = n;
        }
        else{
            n.rptr = head;
            head.lptr = n;
            head = n;
        }
    }

    public void ins_Last(int data) {
        Node n = new Node(data);
        if (tail == null) {
            tail = n;
            head = n;
        }
        else{
            n.lptr = tail;
            tail.rptr = n;
            tail = n;
        }
    }

    public void delete(int data){
        if(head.data == data){
            if(head == tail){
                head = tail = null;
                return;
            }
            head.rptr.lptr = null;
            head = head.rptr;
            return;
        }
        
        Node save = head;
        Node pred = null;
        while(save.data != data && save != null){
            pred = save;
            save = save.rptr;
            if(save.data == data){
                
                if(save == tail){
                    pred.rptr = null;
                    tail = pred;
                    return;
                }
                save.rptr.lptr = pred;
                pred.rptr = save.rptr;
                return;
            }
            
        }
    }

    public void display(){
        if(head == null){
            System.out.println("LIst is empty");
        }
        Node temp = head;
        System.out.println("DLL is :");
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.rptr;
        }
    }

    
}


//main method......
public class doublyLinkedList{
    public static void main(String[] args) {
        Dll dll = new Dll();
        dll.ins_First(10);
        dll.ins_First(20);
        dll.ins_First(30);
        dll.ins_Last(40);
        dll.ins_Last(50);
        dll.ins_Last(60);
        dll.delete(60);
        dll.delete(30);
        dll.display();
    }
}