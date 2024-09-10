import java.util.*;
class Node{
    int info;
    Node left;
    Node right;

    Node(int x){
        info = x;
    }
}

class Tree{
    public Node constrTree(int[] arr ,int i){
        if(i >= arr.length){
            return null;
        }
        Node temp = new Node(arr[i]);
        temp.left = constrTree(arr, (i*2)+1);
        temp.right = constrTree(arr, (i*2)+2);
        return temp;
    }

    //PREORDER
    public void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.info + "-");
        preOrder(node.left);
        preOrder(node.right);
      }

    //INORDER
    public void inOrder(Node node){
        if (node == null) return ;
        inOrder(node.left);
        System.out.print(node.info + "-");
        inOrder(node.right);
    }

    
    //POSTORDER  
    public void postOrder(Node node){
        if (node == null) return ;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.info + "-");
    }

    
}

public class TreeConst{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Tree tree = new Tree();
        Node root = tree.constrTree(arr, 0);
        boolean b = true;
        while(b){
            System.out.print("Enter 1 to Pre, 2 to In , 3 to Post and 4 to break: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch(n){
                case 1:
                tree.preOrder(root);
                break;

                case 2:
                tree.inOrder(root);
                break;

                case 3:
                tree.postOrder(root);
                break;

                case 4:
                b = false;

            }
        }
        // tree.preOrder(root);
        // tree.postOrder(root);
        // tree.inOrder(root);
    }
}