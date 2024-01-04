package J_03_Stack;

import java.util.Arrays;

public class TwoStacks {
    private int[] items;

    private int count1;
    private int count2;
    public TwoStacks(int length) {
        items = new int[length];
        count1 = 0;
        count2 = length -1;
    }

    public void push1(int item){
        if(count1 > count2)
            throw new StackOverflowError();
        items[count1++] = item;
    }

    public void push2(int item){
        if(count2 < count1)
            throw new StackOverflowError();
        items[count2--] = item;
    }

    public int pop1(){
        if(empty1())
            throw new IllegalStateException();
        return items[--count1];
    }

    public int pop2(){
        if(empty2())
            throw new IllegalStateException();
        return items[++count2];
    }

    public int peek1(){
        if(empty1())
            throw new IllegalStateException();
        return items[count1-1];
    }

    public int peek2(){
        if(empty2())
            throw new IllegalStateException();
        return items[count2+1];
    }

    public boolean empty1(){
        return count1 == 0;
    }

    public boolean empty2(){
        return count2 == items.length-1;
    }

//
//    @Override
//    public String toString(){
//        return Arrays.toString(items);
//    }

}
