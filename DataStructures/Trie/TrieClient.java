package Program_14.Trie;

public class TrieClient {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.addWord("arts");
        trie.addWord("art");
        trie.addWord("bug");
        trie.addWord("bug");
        trie.addWord("boy");
        trie.addWord("sea");
        trie.addWord("seen");
        trie.addWord("see");
        trie.addWord("amit");


        trie.display();

//        System.out.println(trie.search("art"));
//        System.out.println(trie.search("arts"));
//        System.out.println(trie.search("arms"));

        System.out.println("================");
        trie.remove("arts");
        trie.display();

        System.out.println("================");
        trie.remove("art");
        trie.display();

        System.out.println("================");
        System.out.println(trie.numWords());
    }
}
