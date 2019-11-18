import java.util.*;
public class binarytree {
    class Node {
        int data;
        Node left, right;
        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    Node root;
    binarytree(){
        root=null;
    }
    void insert(int data){
        root=insertFunction(root,data);
    }
    Node insertFunction(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(data<root.data){
            root.left=insertFunction(root.left, data);
        }
        else if(data>root.data){
            root.right=insertFunction(root.right, data);
        }
        return root;
    }
    void inorder(){
        inOrder(root);
    }
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print( " -> "+root.data);
            inOrder(root.right);
        }
    }
    void perorder(){
        preOrder(root);
    }
    public static void preOrder(Node root){
        if(root!=null){
            System.out.print( " -> "+root.data);
            inOrder(root.left);
            inOrder(root.right);
        }
    }
    void postorder(){
        postOrder(root);
    }
    public static void postOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            inOrder(root.right);
            System.out.print( " -> "+root.data);
        }
    }
    public static void main(String args[]){
        binarytree obj =new binarytree();
        obj.insert(60);
        obj.insert(20);
        obj.insert(10);
        obj.insert(40);
        obj.insert(70);
        obj.insert(60);
        obj.insert(80);
        System.out.println("inorder");
        obj.inorder();
        System.out.println("preorder"+"\n");
        obj.perorder();
        System.out.println("postorder"+"\n");
        obj.postorder();
    }
}