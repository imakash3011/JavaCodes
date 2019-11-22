package Program_14.HuffmanEncoder;
import java.util.ArrayList;

//here we will get problem in comparing the element if we don't extend comparable
//bound set
class HeapGeneric<T extends Comparable<T>> {
    ArrayList<T> data=new ArrayList<>();
    public void add(T item){
        data.add(item);
        upheapify(data.size()-1);
    }

    //don't allow it to be accessible from outside
    //ci -child index
    private void upheapify(int ci){
        //pi-parent index  :formula to get parent index
        int pi=(ci-1)/2;

        //we donot require any base case because we are strictly checking the ci and pi value (< only , not <= in this case we require base case  )

        if(isLarger(data.get(ci),data.get(pi))>0){
            swap(pi,ci);
            upheapify(pi);
        }

    }
    private void swap(int i,int j){


        T ith=data.get(i);
        T jth=data.get(j);

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


    public T remove(){
        swap(0,this.data.size()-1);
        T rv=this.data.remove(this.data.size()-1);
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
        //if left pripority is more than swap
        if(lci<this.data.size() && isLarger(data.get(lci) , data.get(mini))>0){
            mini=lci;
        }

        //if right pripority is more than swap
        if( rci<this.data.size() && isLarger(data.get(lci) , data.get(mini))>0){
            mini=rci;
        }

        //downheapify will be called iff  mini!=pi
        if(mini !=pi){
            swap(mini,pi);
            downheapify(mini);
        }

    }

    //tell the first element with top most priority
    public T get(){
        return this.data.get(0);
    }

    //it will return +ve value if t>o otherwise -ve value
    public int isLarger(T t,T o){
        return t.compareTo(o);
    }
}
