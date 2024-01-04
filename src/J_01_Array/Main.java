package J_01_Array;

public class Main {
    public static void main(String[] args){
        Array num = new Array(3);
        num.insert(1);
        num.insert(2);
        num.insert(3);
        num.insert(4);
        num.removeAt(1);
        num.interect(new int[]{10, 11, 12, 1});
        //num.removeAt(3);
        System.out.println(num.max());
        System.out.println(num.indexOf(1));
        System.out.println(num.indexOf(11));
        //num.removeAt(9);
        num.print();
        num.insertAt(8,0);
        num.print();
        num.reverse();
        num.print();
    }
}
