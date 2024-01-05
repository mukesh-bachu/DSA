package J_05_HashTable;
import java.util.*;
public class CharFinder {
    public char findFirstNonRepeatingChar(String s){
        var chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: chars){
            int count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count+1);
        }
        for(char ch: chars){
            if(map.get(ch) == 1)
                return ch;
        }
        return Character.MAX_VALUE;
    }
    public char findFirstRepeatingCharacter(String s){
        var chars = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for(char ch: chars){
            if(set.contains(ch))
                return ch;
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
