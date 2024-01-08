package J_14_Strings;

import java.util.*;


public class StringUtils {
    public static int countVowels(String str){
        if(str == null)
            return 0;
        int count = 0;
        String vowels = "aeiou";
        for(char ch: str.toLowerCase().toCharArray()){
            if(vowels.indexOf(ch) != -1)
                count++;
        }
        return count;
    }

    public static String reverse(String s){
        if(s == null)
            return "";
        StringBuilder result = new StringBuilder();
        for(int i = s.length()-1; i>-1;i--){
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static String reverseWords(String s){
        if(s == null)
            return "";
        String[] words = s.trim().split(" ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static boolean areRotations(String s1, String s2){
        if(s1 == null || s2 == null)
            return false;
        return (s1.length() == s2.length()) && ((s1+s1).contains(s2));
    }

    public static String removeDuplicates(String str){
        if(str == null)
            return "";
        StringBuilder output = new StringBuilder();
        Set<Character> set = new HashSet<>();
        for(var ch: str.toCharArray()){
            if(!set.contains(ch)) {
                set.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

    public static char getMaxRecurringChar(String s){
        if(s == null || s== "")
            throw new IllegalArgumentException();
        int ASCII_SIZE = 256;
        int[] freq = new int[ASCII_SIZE];
        for(var ch: s.toCharArray())
            freq[ch]++;

        char res = ' ';
        int max = 0;
        for(int i = 0; i < freq.length; i++)
            if(freq[i] > max){
                max = freq[i];
                res = (char)i;
            }
        return res;
    }

    public static String capitalize(String sentence){
        if(sentence.trim().isEmpty())
            return "";
        String[] words = sentence
                .trim()
                .replaceAll(" +"," ")
                .split(" ");

        for(int i = 0; i< words.length; i++){
            words[i] = words[i].substring(0,1).toUpperCase() +
                    words[i].substring(1).toLowerCase();
        }
        return String.join(" ",words);
    }

    public static boolean areAnagrams(String first, String second){
        if(first == null || second == null || first.length() != second.length())
            return false;
        var array1 = first.toLowerCase().toCharArray();
        Arrays.sort(array1);
        var array2 = second.toLowerCase().toCharArray();
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);

    }




    public static boolean isPalindrome(String s){
        if(s == null)
            return false;

        var left = 0;
        var right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }


}
