package Program_14.BinaryTree;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTree {
    private class Node{
        int data;
        Node left;
        Node right;

        Node(int data,Node left,Node right){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }

    private Node root=null;
    private int size=0;

    BinaryTree(){
        Scanner s=new Scanner(System.in);
        //initially the root will take input from Scanner 's'
        //Root initially don't have any parent 'null'
        //Root is the child of any node so 'false'
        //and for other node we will set false for right child
        //and true for the left child
        this.root=takeInput(s,null,false);
    }
    private Node takeInput(Scanner s,Node parent,boolean isLeftOrRight){
        if(parent==null){
            System.out.println("Enter the data of Root Node");
        }else{
            if(isLeftOrRight){
                System.out.println("Enter the data for the left child of" + parent.data);
            }else{
                System.out.println("Enter the data for the right child of "+parent.data);

            }

        }
        int nodeData=s.nextInt();
        //take the input of Root node and set it parent and child initally null
        Node node=new Node(nodeData,null,null);
        this.size++;

        //taking the input of child
        boolean choice=false;
        System.out.println("do you have left child of " + node.data);
        choice=s.nextBoolean();
        if(choice){
            //true in below fn. for left child
            node.left=takeInput(s,node,true);
        }

        choice=false;
        System.out.println("do you have right child of " + node.data);
        choice=s.nextBoolean();
        if(choice){
            //false for right child here in following fn.
            node.right=takeInput(s,node,false);
        }
        return node;
    }
    public void display(){
        //it will available outside the fn.
        //this will use private display fn. to show data
        //because no outsider function can access the data of this tree

        this.display(this.root);

    }
    private void display(Node node){
        String str=" ";
        //if left node if is not empty than print the
        //output in following form
        if (node.left!=null){
            str=str+node.left.data + "=>" ;
        }else {
            //if no left child than print "END => "
            str=str+ "END => ";
        }
        // to take output in form of "left=>node<=right"
        str=str + node.data;

        //if left node if is not empty than print the
        //output in following form
        if (node.right!=null){
            str=str+node.right.data + " <= " ;
        }else {
            //if no right child than print " <= END "
            str=str+ " <= END ";
        }
        System.out.println(str);

        //now recursively calling all other data to follow above code
        if(node.left!=null){
            this.display(node.left);
        }

        if(node.right!=null){
            this.display(node.right);
        }
    }

    public int height(){
        return this.height(this.root);
    }

    private int height(Node node){
        if(node==null){
            return -1;
        }
        int lheight=this.height(node.left);
        int rheight=this.height(node.right);

        int height=Math.max(lheight,rheight)+1;
        return height;
    }

    //preOrder-traversal (Node,left,right)

    public void preOrder(){
        this.preOrder(this.root);
        System.out.print("END");
        System.out.println();
    }
    private void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" , ");
        preOrder(node.left);
        preOrder(node.right);
    }


    //postOrder-traversal (left,right,Node)

    public void postOrder(){
        this.postOrder(this.root);
        System.out.print("END");
        System.out.println();
    }
    private void postOrder(Node node){
        if(node==null){
            return;

        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" , ");

    }


    //inOrder-traversal (left,Node,right)

    public void inOrder(){
        this.inOrder(this.root);
        System.out.print("END");
        System.out.println();
    }
    private void inOrder(Node node){
        if(node==null){
            return;
        }

        inOrder(node.left);
        System.out.print(node.data+" , ");
        inOrder(node.right);

    }

//        //levelOrder Traversal
//    LinkedList<Node> queue=new LinkedList<>();
//    queue.add(this.root);
//    while(!queue.isEmpty()){
//        Node rv=queue.removeFirst();
//        System.out.println(rv.data+" , ");
//
//        if(rv.left !=null){
//            queue.addLast(rv.left);
//        }
//
//        if(rv.right !=null){
//            queue.addLast(rv.right);
//        }
//    }


    //is your Binary Tree is Binary Search Tree or Not
    //using compare of range method
    public boolean isBST(){
        return this.isBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }

    private boolean isBST(Node node,int min,int max){
            if(node==null){
                return true;
            }
        if(node.data>max || node.data<min){
            return false;
        }else if(this.isBST(node.left,min,node.data)){
            return false;
        }else if(this.isBST(node.right,node.data,max)){
            return false;
        }
        return false;
    }
}
