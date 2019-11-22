package Program_15.Graph;

import Program_14.Heap.Heap;
import Program_14.Heap.HeapGeneric;

import java.awt.font.FontRenderContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Graph {
    //we are creating hashmap here so that we can get the neighbour of any vertex in constant time
    //nbrs: neighbour
    private class Vertex{
        HashMap<String ,Integer> nbrs=new HashMap<>();
    }

    //either make it new here or inside the Graph function
//    HashMap<String ,Vertex> vtces=new HashMap<>();
      HashMap<String ,Vertex> vtces;
      public Graph(){
        vtces=new HashMap<>();
    }

    public int numVertex(){
        //all the vertex should must present in vtces ,so just simply return its size
        return this.vtces.size();
    }


    //to check the presence of a vertex
    public boolean containsVertex(String vname){
          return this.vtces.containsKey(vname);
    }

    //here we are an isolated vertex so return type is void
    public void addVertex(String vname){

          //we are making here an empty vertex and put it in graph
          Vertex vtx=new Vertex();
          vtces.put(vname,vtx);
    }

    public void removeVertex(String vname){
          //getting the address of vertex which we need to remove
        //in this address we have hashmap which contains the list of all neigbhour of the vertex which we want to remove
          Vertex vtx=vtces.get(vname);
          //getting all neighbour in the list
          ArrayList<String > keys=new ArrayList<>(vtx.nbrs.keySet());
          //now by using loop we are going to all neighbour one by one to remove the given vertex from their neighbour
          for (String key:keys){
              Vertex nbrVtx=vtces.get(key);
              nbrVtx.nbrs.remove(vname);
          }
          //also remove the vertex from hashmap
          vtces.remove(vname);

    }


    //to get the number of edges /sides in graph
    public int numEdges(){
          int count=0;
        ArrayList<String> keys=new ArrayList<>(vtces.keySet());
        for (String key :keys){
            Vertex vtx=vtces.get(key);   //address of hashmap of vertex
            count=count+ vtx.nbrs.size();
        }
        return count/2;
    }

    public boolean containsEdge(String vname1,String vname2){
          Vertex vtx1=vtces.get(vname1);
          Vertex vtx2=vtces.get(vname2);

          //if either of two return null which means that is isolated vertex
        //and the two vertex are not neighbour
        if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)){
            return false;
        }

        return true;
    }


    public void addEdge(String vname1,String vname2,int cost){

        Vertex vtx1=vtces.get(vname1);  //2k
        Vertex vtx2=vtces.get(vname2);  //4k

        //if either of two return null which means that is isolated vertex
        //and the two vertex are not neighbour than simply return
        if(vtx1==null || vtx2==null || vtx1.nbrs.containsKey(vname2)){
            return ;
        }
        vtx1.nbrs.put(vname2,cost);   //2k nbrs put C with a given cost
        vtx2.nbrs.put(vname1,cost);   //4k nbrs put A with a given cost

    }


    public void removeEdge(String vname1,String vname2){

          //if user passes any vertex that is not present in graph
        //then either of two will show null ,then return simply
        Vertex vtx1=vtces.get(vname1);  //2k
        Vertex vtx2=vtces.get(vname2);  //4k

        //if either of two return null which means that is isolated vertex
        //and the two vertex are not neighbour than simply return
        //if edges donot exist already then also just return simply
        if(vtx1==null || vtx2==null || !vtx1.nbrs.containsKey(vname2)){
            return ;
        }
        vtx1.nbrs.remove(vname2);   //2k nbrs remove C
        vtx2.nbrs.remove(vname1);   //4k nbrs remove A

    }


    public void display(){

        System.out.println("*******************************************");
          //apply loop to all vertices to get their corresponding hashmap
        ArrayList<String> keys=new ArrayList<>(vtces.keySet());
        for (String key:keys){
            Vertex vtx=vtces.get(key);
            System.out.println(key + " : " + vtx.nbrs);
        }
        System.out.println("*******************************************");

    }



    public boolean hasPath(String vname1,String vname2,HashMap<String,Boolean> processed){
          //checking for direct edge
        //means vname1 has direct edge with the vname2 or not

        //in above code we are using HAshmap for processed element so that our calling a
        //function donot get stuck

        processed.put(vname1,true);
        if(containsEdge(vname1,vname2)){
            return true;
        }

        //checking whether the neighbour of vname have direct edge with vname2 or not
        //here we are devoting the work to our neighbour
        Vertex vtx=vtces.get(vname1);
        //get all the neighbour of vname1 in arraylist
        ArrayList<String> nbrs=new ArrayList<>(vtx.nbrs.keySet());
        for (String nbr:nbrs){
            //now taking all neighbour 1 by 1 and checking whether they have direct edge with the vname2 or not
           //write the following code in given sequence
            if( !processed.containsKey(nbr)   && hasPath(nbr,vname2,processed)){
                return true;
            }
        }
        return false;

    }


    private class Pair{
          String vname;
          String psf;
    }

    public boolean bfs(String src,String dst){
          HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> queue=new LinkedList<>();
        //startin pair :sp
        Pair sp=new Pair();
        sp.vname=src;
        //psf =path so far
        sp.psf=src;

        //put new pair in queue
        queue.addLast(sp);

        //while queue is not empty keep on doing the work
        while (!queue.isEmpty()){
            //remove pair :rp from queue
            Pair rp=queue.removeFirst();

            //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
            //C will come twice in the the Vertex i.e ABC and ADC
            if(processed.containsKey(rp.vname)){
                continue;
            }

            //processed put
            processed.put(rp.vname,true);

            //direct edge check between given edge and destination
            if(containsEdge(rp.vname,dst)){
                System.out.println(rp.psf + dst);
                return true;
            }
            //if direct edge is not present then check for neighbour

            Vertex rpvtx =vtces.get(rp.vname);
            //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
            ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
            //now use loop to get all nbrs 1 by 1
            for (String nbr:nbrs){

                //process on unprocessed nbrs
                if (!processed.containsKey(nbr)){
                    //make a new pair of nbr and put it in queue
                    Pair np=new Pair();
                    np.vname=nbr;
                    //path so far:getting new path after traversal and putting it back to queue
                    np.psf=rp.psf +nbr;

                    queue.addLast(np);
                }

            }
        }

        return false;
    }





    //to change bfs into dfs jus make the following change
    //just change bfs => dfs
    //addLast() =>  addFirst()
    //queue =>stack

    public boolean dfs(String src,String dst){
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> stack=new LinkedList<>();
        //startin pair :sp
        Pair sp=new Pair();
        sp.vname=src;
        //psf =path so far
        sp.psf=src;

        //put new pair in stack
        stack.addFirst(sp);

        //while stack is not empty keep on doing the work
        while (!stack.isEmpty()){
            //remove pair :rp from stack
            Pair rp=stack.removeFirst();

            //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
            //C will come twice in the the Vertex i.e ABC and ADC
            if(processed.containsKey(rp.vname)){
                continue;
            }

            //processed put
            processed.put(rp.vname,true);

            //direct edge check between given edge and destination
            if(containsEdge(rp.vname,dst)){
                System.out.println(rp.psf + dst);
                return true;
            }
            //if direct edge is not present then check for neighbour

            Vertex rpvtx =vtces.get(rp.vname);
            //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
            ArrayList<String> nbrs=new ArrayList<>(rpvtx.nbrs.keySet());
            //now use loop to get all nbrs 1 by 1
            for (String nbr:nbrs){

                //process on unprocessed nbrs
                if (!processed.containsKey(nbr)){
                    //make a new pair of nbr and put it in stack
                    Pair np=new Pair();
                    np.vname=nbr;
                    //path so far:getting new path after traversal and putting it back to stack
                    np.psf=rp.psf +nbr;

                    stack.addFirst(np);
                }

            }
        }

        return false;
    }





    //Breadth First Traversal
    public void bft(){
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> queue=new LinkedList<>();

        ArrayList<String > keys=new ArrayList<>(vtces.keySet());
        //for every node repeat the process
        for (String key:keys) {

            if (processed.containsKey(key)){
                continue;
            }

            //startin pair :sp
            Pair sp = new Pair();
            sp.vname = key;
            //psf =path so far
            sp.psf = key;

            //put new pair in queue
            queue.addLast(sp);

            //while queue is not empty keep on doing the work
            while (!queue.isEmpty()) {
                //remove pair :rp from queue
                Pair rp = queue.removeFirst();

                //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
                //C will come twice in the the Vertex i.e ABC and ADC
                if (processed.containsKey(rp.vname)) {
                    continue;
                }

                //processed put
                processed.put(rp.vname, true);

                //here we are removing a pair pair and we are also printing the path via which we reach their
                System.out.println(rp.vname + " via " + rp.psf);


                Vertex rpvtx = vtces.get(rp.vname);
                //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
                //now use loop to get all nbrs 1 by 1
                for (String nbr : nbrs) {

                    //process on unprocessed nbrs
                    if (!processed.containsKey(nbr)) {
                        //make a new pair of nbr and put it in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        //path so far:getting new path after traversal and putting it back to queue
                        np.psf = rp.psf + nbr;

                        queue.addLast(np);
                    }

                }
            }

        }

    }






    public void dft(){
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> stack=new LinkedList<>();

        ArrayList<String > keys=new ArrayList<>(vtces.keySet());
        //for every node repeat the process
        for (String key:keys) {

            if (processed.containsKey(key)){
                continue;
            }

            //startin pair :sp
            Pair sp = new Pair();
            sp.vname = key;
            //psf =path so far
            sp.psf = key;

            //put new pair in stack
            stack.addFirst(sp);

            //while stack is not empty keep on doing the work
            while (!stack.isEmpty()) {
                //remove pair :rp from stack
                Pair rp = stack.removeFirst();

                //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
                //C will come twice in the the Vertex i.e ABC and ADC
                if (processed.containsKey(rp.vname)) {
                    continue;
                }

                //processed put
                processed.put(rp.vname, true);

                //here we are removing a pair pair and we are also printing the path via which we reach their
                System.out.println(rp.vname + " via " + rp.psf);


                Vertex rpvtx = vtces.get(rp.vname);
                //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
                //now use loop to get all nbrs 1 by 1
                for (String nbr : nbrs) {

                    //process on unprocessed nbrs
                    if (!processed.containsKey(nbr)) {
                        //make a new pair of nbr and put it in stack
                        Pair np = new Pair();
                        np.vname = nbr;
                        //path so far:getting new path after traversal and putting it back to stack
                        np.psf = rp.psf + nbr;

                        stack.addFirst(np);
                    }

                }
            }

        }

    }







    //iscylic
    public boolean isCyclic(){
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> queue=new LinkedList<>();

        ArrayList<String > keys=new ArrayList<>(vtces.keySet());
        //for every node repeat the process
        for (String key:keys) {

            if (processed.containsKey(key)){
                continue;
            }

            //startin pair :sp
            Pair sp = new Pair();
            sp.vname = key;
            //psf =path so far
            sp.psf = key;

            //put new pair in queue
            queue.addLast(sp);

            //while queue is not empty keep on doing the work
            while (!queue.isEmpty()) {
                //remove pair :rp from queue
                Pair rp = queue.removeFirst();

                //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
                //C will come twice in the the Vertex i.e ABC and ADC
                if (processed.containsKey(rp.vname)) {
                    return true;
                }

                //processed put
                processed.put(rp.vname, true);


                Vertex rpvtx = vtces.get(rp.vname);
                //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
                //now use loop to get all nbrs 1 by 1
                for (String nbr : nbrs) {

                    //process on unprocessed nbrs
                    if (!processed.containsKey(nbr)) {
                        //make a new pair of nbr and put it in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        //path so far:getting new path after traversal and putting it back to queue
                        np.psf = rp.psf + nbr;

                        queue.addLast(np);
                    }

                }
            }

        }
        return false;

    }





    //isconnected graph
    public boolean isConnected(){
          int flag=0;
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> queue=new LinkedList<>();

        ArrayList<String > keys=new ArrayList<>(vtces.keySet());
        //for every node repeat the process
        for (String key:keys) {

            if (processed.containsKey(key)){
                continue;
            }

            flag++;

            //startin pair :sp
            Pair sp = new Pair();
            sp.vname = key;
            //psf =path so far
            sp.psf = key;

            //put new pair in queue
            queue.addLast(sp);

            //while queue is not empty keep on doing the work
            while (!queue.isEmpty()) {
                //remove pair :rp from queue
                Pair rp = queue.removeFirst();

                //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
                //C will come twice in the the Vertex i.e ABC and ADC
                if (processed.containsKey(rp.vname)) {
                    continue;
                }

                //processed put
                processed.put(rp.vname, true);

                Vertex rpvtx = vtces.get(rp.vname);
                //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
                //now use loop to get all nbrs 1 by 1
                for (String nbr : nbrs) {

                    //process on unprocessed nbrs
                    if (!processed.containsKey(nbr)) {
                        //make a new pair of nbr and put it in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        //path so far:getting new path after traversal and putting it back to queue
                        np.psf = rp.psf + nbr;

                        queue.addLast(np);
                    }

                }
            }

        }
        if (flag>=2){
            return false;
        }else{
            return true;
        }

    }




    //isTree
    public boolean isTree(){
          return !isCyclic() && isConnected();
    }





    //get connected component
    public ArrayList<ArrayList<String>> getCC(){
          ArrayList<ArrayList<String>> ans=new ArrayList<>();
        HashMap<String,Boolean> processed=new HashMap<>();
        LinkedList<Pair> queue=new LinkedList<>();

        ArrayList<String > keys=new ArrayList<>(vtces.keySet());
        //for every node repeat the process
        for (String key:keys) {

            if (processed.containsKey(key)){
                continue;
            }

            //for new component create a new ArrayList
            ArrayList<String > subans=new ArrayList<>();
            //startin pair :sp
            Pair sp = new Pair();
            sp.vname = key;
            //psf =path so far
            sp.psf = key;

            //put new pair in queue
            queue.addLast(sp);

            //while queue is not empty keep on doing the work
            while (!queue.isEmpty()) {
                //remove pair :rp from queue
                Pair rp = queue.removeFirst();

                //if we get the same removed Pair again then ignore all that pair and again start from while loop i.e. C  in this case forming a closed graph
                //C will come twice in the the Vertex i.e ABC and ADC
                if (processed.containsKey(rp.vname)) {
                    continue;
                }

                //processed put
                processed.put(rp.vname, true);

                //sout  or can say that put in subans ArrayList
                subans.add(rp.vname);


                Vertex rpvtx = vtces.get(rp.vname);
                //rpvtx:remove pair vertex : in this we are getting the address of removed pair so that we can reach out to its neighbour
                ArrayList<String> nbrs = new ArrayList<>(rpvtx.nbrs.keySet());
                //now use loop to get all nbrs 1 by 1
                for (String nbr : nbrs) {

                    //process on unprocessed nbrs
                    if (!processed.containsKey(nbr)) {
                        //make a new pair of nbr and put it in queue
                        Pair np = new Pair();
                        np.vname = nbr;
                        //path so far:getting new path after traversal and putting it back to queue
                        np.psf = rp.psf + nbr;

                        queue.addLast(np);
                    }

                }
            }
            //put subans in final ans
            ans.add(subans);

        }
        return ans;

    }




    private class PrimsPair implements Comparable<PrimsPair>{
          //vertex name
          String vname;
          //acquiring vertex name
          String acqvname;
          //cost of each edge
          int cost;

        @Override
        public int compareTo(PrimsPair o) {
            return o.cost-this.cost;
        }
    }


    public Graph prims(){
          Graph mst=new Graph();
          HashMap<String,PrimsPair>  map=new HashMap<>();
          //if get the error of bound set then implements the comparable
          HeapGeneric<PrimsPair> heap=new HeapGeneric<>();

          //make a pair a put in heap and in map
          for (String  key:vtces.keySet()){
              PrimsPair np=new PrimsPair();
              //making a new pair initially with acqvname= null and their initial cost as infinity or MAX_VALUE
              np.vname=key;
              np.acqvname=null;
              np.cost=Integer.MAX_VALUE;

              //now to insert them in heap and hashmap
              heap.add(np);
              //key value pair i.e. hashmap
              map.put(key,np);
          }
          //till the heap is not  empty keep on removing the pairs
        while(!heap.isEmpty()){

            //remove pair
            PrimsPair rp=heap.remove();
            map.remove(rp.vname);

            //removed pair will get added to MST
            //for a acquring vertex will be null

            if(rp.acqvname==null){
                mst.addVertex(rp.vname);
            }else{
                //and for all vertex we will write the vertex via which they are acquired
                mst.addVertex(rp.vname);
                //for other vertex ,they will have their vname,vertex via which they acquires and will also have the cost of the acquired vertex
                mst.addEdge(rp.vname,rp.acqvname,rp.cost);
            }

            //nbrs
            for (String nbr: vtces.get(rp.vname).nbrs.keySet()){

               //work for neighbour which are in heap
                if (map.containsKey(nbr)){
                    //old cost of a edge
                    int oc=map.get(nbr).cost;
                    //new cost of a edge
                    int nc=vtces.get(rp.vname).nbrs.get(nbr);

                    //if new cost is less than old than update the pair cost
                    if(nc<oc){
                        PrimsPair gp=map.get(nbr);
                        //acqvname and cost will change only
                        gp.acqvname=rp.vname;
                        gp.cost=nc;

                        //this function is present in the GenericHeap Problem
                        heap.updatePriority(gp);
                    }
                }
            }
        }



          return mst;
    }






    //Dijkstra Algorithm
    //this is dijkstra Pair
    private class DijkstraPair implements Comparable<DijkstraPair>{
        //vertex name
        String vname;
        //path so far
        String psf;
        //cost of each edge
        int cost;

        @Override
        public int compareTo(DijkstraPair o) {
            return o.cost-this.cost;
        }
    }


    public HashMap<String ,Integer>   dijkstra(String src){
          //to store ans in this hashmap
        HashMap<String,Integer>  ans=new HashMap<>();
        HashMap<String,DijkstraPair>  map=new HashMap<>();
        //if get the error of bound set then implements the comparable
        HeapGeneric<DijkstraPair> heap=new HeapGeneric<>();

        //make a pair a put in heap and in map
        for (String  key:vtces.keySet()){
            DijkstraPair np=new DijkstraPair();
            //making a new pair initially with acqvname= null and their initial cost as infinity or MAX_VALUE
            np.vname=key;
            np.psf="";
            np.cost=Integer.MAX_VALUE;

            //source vertex
            if (key.equals(src)){
                np.cost=0;
                np.psf=key;
            }

            //now to insert them in heap and hashmap
            heap.add(np);
            //key value pair i.e. hashmap
            map.put(key,np);
        }
        //till the heap is not  empty keep on removing the pairs
        while(!heap.isEmpty()){

            //remove pair
            DijkstraPair rp=heap.remove();
            map.remove(rp.vname);

            //removed pair will get added to ans hashmap
            //for a psf will be 0 for first vertex
            ans.put(rp.vname,rp.cost);



            //nbrs
            for (String nbr: vtces.get(rp.vname).nbrs.keySet()){

                //work for neighbour which are in heap
                if (map.containsKey(nbr)){
                    //old cost of a edge
                    int oc=map.get(nbr).cost;
                    //new cost of a edge
                    int nc= rp.cost +  vtces.get(rp.vname).nbrs.get(nbr);

                    //if new cost is less than old than update the pair cost
                    if(nc<oc){
                        DijkstraPair gp=map.get(nbr);
                        //acqvname and cost will change only
                        gp.psf=rp.psf + nbr;
                        gp.cost=nc;

                        //this function is present in the GenericHeap Problem
                        heap.updatePriority(gp);
                    }
                }
            }
        }



        return ans;
    }


}
