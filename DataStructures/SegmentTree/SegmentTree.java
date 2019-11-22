package Program_15.SegmentTree;

public class SegmentTree {
    private class Node{
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;
    }

    Node root;

    public SegmentTree(int[]  arr){
        //this constructTree will be called further when we need it 
        this.root=constructTree(arr,0,arr.length-1);
    }

    private Node constructTree(int[] arr,int si,int ei){
        if(si==ei){
            Node leafNode=new Node();
            leafNode.data=arr[si];
            leafNode.startInterval=si;
            leafNode.endInterval=ei;
            return leafNode;
        }


        Node node=new Node();
        node.startInterval=si;
        node.endInterval=ei;


        int mid=(si+ei)/2;
        node.left=this.constructTree(arr,si,mid);
        node.right=this.constructTree(arr,mid+1,ei);

        node.data=node.left.data + node.right.data;

        return node;
    }

    public void  display(){
        this.display(this.root);
    }

    private void display(Node node){
        String str="";
        if(node.left!=null){
            str=str+"Interval=[" +node.left.startInterval+"-"+node.left.endInterval+"] and data=" + node.left.data+"=>";

        }else {
            str=str+"No left child => ";
        }
       str= str+"Interval=[" +node.startInterval+"-"+node.endInterval+"] and data=" + node.data;
        if(node.left!=null){
            str=str+ "<= data is = " + node.right.data + "and Interval is [" +node.right.startInterval+"-"+node.right.endInterval+"]";
        }else {
            str=str+"<= No Right CHild";
        }

        System.out.println(str);
        if (node.left!=null){
            this.display(node.left);
        }
        if (node.right!=null){
            this.display(node.right);
        }

    }


    public int query(int qsi,int qei){
        //query start interval :qsi
        //query end interval :qei
        return this.query(this.root,qsi,qei);
    }

    private int query(Node node,int qsi,int qei){
        //node is completely inside the qery interval than
        //simply return its actual value i.e its node data and go further in tree
        if(node.startInterval>=qsi && node.endInterval<=qei){
            return node.data;
        }else if(node.startInterval>qei || node.endInterval<qsi){
            //this is completely outside case
            //in this case return default value i.e zero and don't go further for ans
            return 0;
        }else {
            //overlapping case
            //you have to go further to its left and right node for ans
            //and finally return the sum of leftans and rightans
            int leftans=this.query(node.left,qsi,qei);
            int rightans=this.query(node.right,qsi,qei);
            return leftans + rightans;
        }

    }

    public void update(int index,int newValue){
        this.root.data=this.update(this.root,index,newValue);
    }

    private int update(Node node,int index,int newValue){
        if(index>=node.startInterval && index<=node.endInterval){
            if(index==node.startInterval && index==node.endInterval){
                node.data=newValue;
            }else {
                int leftValue=this.update(node.left,index,newValue);
                int rightValue=this.update(node.right,index,newValue);
                node.data=leftValue+rightValue;
            }
        }
        return node.data;
    }

}
