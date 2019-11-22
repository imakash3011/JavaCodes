package Program_14.Heap;

import java.util.ArrayList;

public class Heap {
    ArrayList<Integer> data=new ArrayList<>();
    public void add(int item){
        data.add(item);
        upheapify(data.size()-1);
    }

    //don't allow it to be accessible from outside
    //ci -child index
    private void upheapify(int ci){
        //pi-parent index  :formula to get parent index
        int pi=(ci-1)/2;

        //we donot require any base case because we are strictly checking the ci and pi value (< only , not <= in this case we require base case  )

        if(data.get(ci)< data.get(pi)){
            swap(pi,ci);
            upheapify(pi);
        }

    }
    private void swap(int i,int j){


        int ith=data.get(i);
        int jth=data.get(j);

        data.set(i,jth);
        data.set(j,ith);
    }

    public void display(){

        System.out.println(data);
    }

    public int size(){
        return this.data.size();
    }

    public boolean isEmpty(){
        return this.size()==0;
    }


    public int remove(){
        swap(0,this.data.size()-1);
        int rv=this.data.remove(this.data.size()-1);
        downheapify(0);

        return rv;
    }

    //capture the value that we get from above heapify into pi
    private void downheapify(int pi){
        //lci=left child index   rci=right child index
        int lci=2*pi+1;
        int rci=2*pi+2;

        //compare every value
        int mini=pi;
        if(lci<this.data.size() && data.get(lci) < data.get(mini)){
            mini=lci;
        }

        if( rci<this.data.size() && data.get(rci) < data.get(mini)){
            mini=rci;
        }

        //downheapify will be called iff  mini!=pi
        if(mini !=pi){
            swap(mini,pi);
            downheapify(mini);
        }

    }

    //tell the first element with top most priority
       public int get(){
        return this.data.get(0);
       }
}
