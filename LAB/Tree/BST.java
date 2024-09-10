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
    
}

public class BST {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = t.create(t.root,5);
        t.root = t.create(t.root,3);
        t.root = t.create(t.root,7); 
        t.preOrder(t.root);
        // t.inOrder(t.root);
        // t.postOrder(t.root);
    }
}