package J_03_Stack;

public class Main {
    public static void main(String[] args) {

// testing new Stack class
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        var top = stack.pop();
        System.out.println(top);
        System.out.println(stack);
        System.out.println(stack.peek());

//testing StringReverser
        String s1 = "abcd";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(s1);
        System.out.println(result);

//testing BalancedExpression
        String s2 = "()(";
        BalancedExpression exp = new BalancedExpression();
        System.out.println(exp.isBalanced(s2));

//testing TwoStacks
        TwoStacks stack2 = new TwoStacks(6);
        stack2.push1(10);
        stack2.push2(1);
        stack2.push1(20);
        stack2.push1(30);
        stack2.push2(2);
        stack2.push2(3);
        System.out.println(stack2.pop2());
        System.out.println(stack2.peek2());

// testing MinStack
        MinStack stack1 = new MinStack();
        stack1.push(3);
        System.out.println(stack1.getMin());
        stack1.push(2);
        System.out.println(stack1.getMin());
        stack1.push(1);
        System.out.println(stack1.getMin());
        stack1.pop();
        System.out.println(stack1.top());
        System.out.println(stack1.getMin());


    }
}
