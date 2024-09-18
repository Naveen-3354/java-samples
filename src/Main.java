import java.util.*;
import java.util.function.Function;


interface Addtition{
    void add(int x, int y);
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        int[] arr = {1,2,3,4,5,6,7,8,9032,32,21,3,4457,56,6,76,54,3,5,6,3,5,6,7,43,5667,43,56,98,633,78};
//        Main main = new Main();
//        System.out.println("Sum of array is "+main.sumOfArray(arr));
//
//
//        String num1 = Numbers.FOUR.toString();

        LinkedList<String > arrayList = new LinkedList<>();
        arrayList.add("Yellow");

    }

    int sumOfArray(int[] ary){
        int sum =0;
        for(int i : ary){
            sum+=i;
        }
        return sum;
    }
}