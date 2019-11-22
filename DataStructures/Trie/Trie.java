package Program_14.Trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Trie {

    private class Node{
        char data;
        //inbuild java Hashmap will be used
        HashMap<Character,Node> children;
        boolean isTerminal;

        //constructor
        Node(char data,boolean isTerminal){
            this.data=data;
            //initialise the hashmap
            this.children=new HashMap<>();
            this.isTerminal=isTerminal;
        }
    }

    private int numWords;
    private Node root;

    //Trie constructor
    Trie(){
        //create a root node int initial value is null character i.e '\0' and default boolean value false
        this.root=new Node('\0',false);
        this.numWords=0;
    }

    //it will return the number of word present in dictionary or can say in contact list of application
    public int numWords(){
        return this.numWords;
    }

    //if a word is not present already than add it to contact list
    public void addWord(String word){
        this.addWord(this.root,word);
    }

    private void addWord(Node parent,String word){
        //cc-current character    and ros-rest of string
        //ex: art   : taking out character cc='a'  and ros="rt"
       if(word.length()==0){
           if(parent.isTerminal){
               //word already exists
           }else{
               parent.isTerminal=true;
               this.numWords++;
           }
           return;
       }
        char cc=word.charAt(0);
        String ros=word.substring(1);
        //using hashmap to check the key of particular name
        Node child=parent.children.get(cc);
        //if child is not present already than make a new node and put the value
        if(child==null){
            child=new Node(cc,false);
            parent.children.put(cc,child);
        }
        //call this function recursively to add the word to contact list
        this.addWord(child,ros);
    }

    public void display(){
        this.display(this.root,"");
    }
     //osf-so far
    private void display(Node node,String osf){
        if(node.isTerminal){
            //make substring from index 1..to ignore null character and concatenate the last word to substring
            String todisplay=osf.substring(1)+node.data;
            System.out.println(todisplay);
        }
        //use set present in hashmap to get all the entry with starting character
        Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
        for (Map.Entry<Character, Node> entry:entries){
            //to get the word with particular starting character
            this.display(entry.getValue(),osf + node.data);

        }
    }

    //to search a word
    public boolean search(String word){
        return this.search(this.root,word);
    }

    private boolean search(Node parent,String word){
        if(word.length()==0){
            if(parent.isTerminal){
                return true;
            }else{
                return false;
            }
        }

        //same as above code...means getting the current character first
        char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.children.get(cc);
        if(child==null){
            return false;
        }
        //if the first word is found then pass child to search() to search all other word
        return this.search(child,ros);
    }


    public void remove(String word){
        this.remove(this.root,word);
    }

    private void remove(Node parent,String word){
        if(word.length()==0){
            if(parent.isTerminal){
                parent.isTerminal=false;
                this.numWords--;
            }else{
                //word is a part of some other word
            }
            return;
        }

        //same as above code...means getting the current character first
        char cc=word.charAt(0);
        String ros=word.substring(1);
        Node child=parent.children.get(cc);
        //if the word donot exist so we need not to return anything
        if(child==null){
            return ;
        }
        this.remove(child,ros);

        if(!child.isTerminal && child.children.size()==0){
            parent.children.remove(cc);
        }
    }
}
