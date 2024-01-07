package J_09_Tries;

public class Main {
    public static void main(String[] args) {
        //testing trie
        var trie = new Trie();
        trie.insert("cat");
        trie.insert("can");
        trie.insert("dog");
        System.out.println("done");
        System.out.println(trie.lookUp("dog"));
        trie.traverse();
        trie.remove("dog");
        trie.insert("car");
        trie.insert("care");
        trie.insert("careful");

        var words = trie.findWords(null);
        System.out.println(words);
        trie.remove(null);
        trie.traverse();

        //testing containRecursive
        System.out.println(trie.containsRecursive("cat"));

        //testing countWords
        System.out.println(trie.countWords());






    }
}
