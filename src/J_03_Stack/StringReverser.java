package J_03_Stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String s){
        if(s == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            stack.push(ch);
        }
        StringBuffer result = new StringBuffer();
        while(!stack.empty()){
            result.append(stack.pop());
        }
        return result.toString();
    }
}
