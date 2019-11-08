import java.util.*;
public class BinarySearchTree {
    class Node
    {
    int data;
    Node left,right;
    
    public Node(int data)
    {
    this.data=data;
    left=right=null;
    }
    }
    Node root;
        BinarySearchTree() {  
            root = null;  
        }
       
        void insert(int data)
        {
         
       root=insertrec(root,data);
        }
        Node insertrec(Node root,int data){
            if(root==null)
            {
                root=new Node(data);
                return root;
            }
            if(data<root.data)
            {
                root.left=insertrec(root.left,data);
            }
            else if(data>root.data)
            {
                root.right=insertrec(root.right,data);
            }
            return root;
        }
        void inorder()
        {
          inorder1(root);
        }
        public static void inorder1(Node root)
       {
         if(root!=null)
           {
               inorder1(root.left);
                System.out.println(root.data);
                inorder1(root.right);
           }
      }
    
       public void preorder()
        {

        }

       public void postorder()
        {

        }
        public static void main(String args[])
        {
        BinarySearchTree b=new BinarySearchTree();
            b.insert(60);
            b.insert(20);
            b.insert(10);
            b.insert(40);
            b.insert(70);
            b.insert(60);
            b.insert(80);
            System.out.println("inorder");
            b.inorder();
            System.out.println("preorder");
            b.preorder();
            System.out.println("postorder");
            b.postorder();
           

        }
    
    }