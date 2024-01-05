package J_05_HashTable;

public class Main {
    public static void main(String[] args){
        CharFinder finder = new CharFinder();
        System.out.println(finder.findFirstNonRepeatingChar("qweradkjdkqekajsak"));
        System.out.println(finder.findFirstRepeatingCharacter("qweradkjdkqekajsak"));

        HashTable table = new HashTable();
        table.put(6,"A");
        table.put(8,"B");
        table.put(11,"C");
        table.put(6,"A+");
        table.remove(6);
        System.out.println(table.get(10));

    }
}
