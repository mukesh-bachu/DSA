package J_03_Stack;
import java.util.*;
import java.util.Stack;
public class BalancedExpression {
    private List<Character> leftBrackets = Arrays.asList('(','{','<','[');
    private List<Character> rightBrackets = Arrays.asList(')','}','>',']');;

    public boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);
            if (isRightBracket(ch)) {
                if (stack.empty()) return false;
                var top = stack.pop();
                if (!isMatch(top,ch)) return false;
            }
        }
        return stack.empty();
    }
    private boolean isLeftBracket(char ch){
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean isMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
