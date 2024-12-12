class Node {
    int data;
    Node lptr;
    Node rptr;

    Node(int data) {
        this.data = data;
    }
}

class Tree {
 Node root;

    public Node create(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.lptr = create(node.lptr, data);
        }

        else if (data > node.data) {
            node.rptr = create(node.rptr, data);
        }

        return node;
    }

    public void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + "-");
        preOrder(node.lptr);
        preOrder(node.rptr);
    }

    public void inOrder(Node node){
        if (node == null) return ;
        
        inOrder(node.lptr);
        System.out.print(node.data + "-");
        inOrder(node.rptr);
    }

    public void postOrder(Node node){
        if (node == null) return ;
        postOrder(node.lptr);
        postOrder(node.rptr);
        System.out.print(node.data + "-");
    }

    public void  searching(Node root,int n){
        if(root==null){
            return ;
        }
        else if(root.lptr.data == n){
            System.out.println("element is in lptr:"+n);
        }
        else if(root.rptr.data == n){
            System.out.println("Element is in rptr:"+n);            
        }
    }

    public void deletet(Node root , int n){
        Node temp = root;
        if(temp == null){
            return ;
        }
        else if(temp.lptr == null){
            temp = null;
        }
        else if(temp.rptr == null){
            temp = null;
        }
        else{
            deletet(root.lptr,n);
        }
        
    }
    
}

public class BST {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = t.create(t.root,5);
        t.root = t.create(t.root,3);
        t.root = t.create(t.root,7); 
        // t.preOrder(t.root);
        t.searching(t.root, 7);
        // t.inOrder(t.root);
        // t.postOrder(t.root);
    }
}