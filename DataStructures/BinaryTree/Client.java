package Program_14.BinaryTree;

import Program_13.LinkedListProgram.LL_As_Queue;
import Program_13.LinkedListProgram.LinkedList;

import java.util.Queue;

public class Client {
    public static void main(String[] args) {
        BinaryTree tree=new BinaryTree();
        tree.display();
        //run the program and paste the following code
        //50 true 25 true 38 false false true 48 true 18 false false false true 45 true 85 false false true 60 false false


        System.out.println("Height of tree is "+ tree.height());

        tree.preOrder();
        tree.postOrder();
        tree.inOrder();

        System.out.println(tree.isBST());
    }



}
