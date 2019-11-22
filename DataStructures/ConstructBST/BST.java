package Program_14.ConstructBST;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class BST {
    private class Node{
        int data;
        Node left;
        Node right;

    }

    private Node root;

    public BST(int[] arr) {
        //this statement will return the final node with its
        //left ,right and root node
        this.root = construct(arr, 0, arr.length - 1);

    }

        private Node construct(int[] arr,int lo,int hi){
            if(lo>hi){
                return null;
            }

            //Mid
            int mid=(lo+hi)/2;

            //create a new Node and set its Node value,left and right
            Node nn=new Node();
            nn.data=arr[mid];
            //it will make the left subtree
            nn.left=construct(arr,lo,mid-1);
            nn.right=construct(arr,mid+1,hi);
            return nn;
        }

        //this display will call the below display function
        public void display(){
            System.out.println("==========================");
        display(this.root);
            System.out.println("==========================");
        }


        //we will initially pass root node in display as starting point
    private void display(Node node){
        String str="";
        if(node==null){
            return;
        }

        if(node.left==null){
            str +=".";
        }else{
            str +=node.left.data;
        }

        str+="->" + node.data + "<-" ;

        if(node.right==null){
            str +=".";
        }else{
            str +=node.right.data;
        }

        System.out.println(str);
        display(node.left);
        display(node.right);
}


public boolean find(int item){
        return find(this.root,item);
}

private boolean find(Node node,int item){
        //base case ...if we traverse the whole node and get that the element is not present

        if(node == null){
            return false;
        }

        if(item> node.data){
            return find(node.right,item);
        }else if(item<node.data){
            return find(node.left,item);
    }else {
            return true;
        }
}

//to find max.
public int max(){
        return max(this.root);
    }

    private int max(Node node){
    //if somewhere we get the node with right child null then that will be return the max. value in BST
        //becz in BST element are arrange in such a way the we need not to traverse the left child-node

        if(node.right==null){
            return node.data;
        }
        return max(node.right);
    }


    public void add(int item){
        add(this.root,item);
    }

    private void add(Node node,int item){
        if(item>node.data){
            if(node.right==null){
                //if right is null then create new node and add the value to it
                //then attach it to original node
                Node nn=new Node();
                nn.data=item;
                //attaching the new node to existing node

                node.right=nn;
            }else{
                add(node.right,item);
            }
        }else{
            if(node.right==null){
                Node nn=new Node();
                nn.data=item;
                //attaching the new node to existing node

                node.left=nn;
            }else{
                add(node.left,item);
            }

        }
    }


    //removing from BST

    public void remove(int item){
 //initially the root node parent is null ,and we will consider it as left child i.e false
 //but it donot make any sense for the root node value
        remove(this.root,null, false,item);
    }
//ilc : is left child
    private void remove(Node node,Node parent,boolean ilc,int item){
        //if item is not present
        if(node==null){
            return;
        }

        if(item > node.data){
            //item is greater which means we are going towards the right child node
            remove(node.right,node,false,item);
        }else if(item<node.data){
            remove(node.left,node,true,item);
        }else{
            if(node.left==null && node.right==null){
                if(ilc){
                    parent.left=null;
                }else {
                    parent.right=null;
                }
            }else if(node.left==null && node.right!= null){
                if(ilc){
                    parent.left=node.right;
                }else {
                    parent.right=node.right;
                }
            }else {
                int max=max(node.left);
                node.data=max;

                remove(node.left,node,true,max);
            }
        }
    }
}


