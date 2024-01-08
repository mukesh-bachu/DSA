package J_14_Strings;

public class Main {
    public static void main(String[] args){
        //testing countVowels
        System.out.println(StringUtils.countVowels("hello world"));

        //testing reverse
        System.out.println(StringUtils.reverse("hello world"));

        //testing reverse
        System.out.println(StringUtils.reverseWords("hello world"));

        //testing areRotations

        System.out.println(StringUtils.areRotations("ABCD", "DABC"));

        //testing remove duplicates
        System.out.println(StringUtils.removeDuplicates("adbjskfnjjjjjjjj"));

        //testing max recurring char
        System.out.println(StringUtils.getMaxRecurringChar("wrbkrjjjjjjjjaek,ame"));

        //testing capitalize first letter of word

        System.out.println(StringUtils.capitalize("a great faY to day"));

        //testing are Anagrams
        System.out.println(StringUtils.areAnagrams("abcd", "dcba"));

        //testing isPalindrome
        System.out.println(StringUtils.isPalindrome("abcddcba"));






    }
}
