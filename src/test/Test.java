package test;

import java.util.ArrayList;
import java.util.HashMap;

class Testing<T,A>{
    T x;
    A y;


}
public class Test {

    // constructor overloading
    public Test(){}
    public Test(int x){}
    public Test(int x, String y){}
    public Test(String x){}


   public static void main(String[] args) {
        // creating objects using generics
        Testing<Integer, Integer> obj1 = new Testing();
        Testing<String, String> obj2 = new Testing<>();

        ArrayList<String > arr = new ArrayList<>();
        arr.add("qwe");
        ArrayList<Integer> arr1 = new ArrayList<>();
        HashMap<String ,String > map = new HashMap<>();


        Test test = new Test();
        Test test1 = new Test(123421);
        Test test2 = new Test(1234123,"sdcd");
        Test test3 = new Test("asf");
        Test test4 = new Test();
        test.demo();
//        String result = test.res();
//        System.out.println(result);\

        res();
        res(3242);
        res(12312,3242);
        res("cbjka");
    }

    // main method overloading
    public static void main(String a){}

    // void method
    public <T> void demo(){
        Test test = new Test();

        System.out.println("void method");
    }

    // return type
    public String retu(){
        return "Return type method...";
    }

    // method overloading
    public static void res(){}
    public static void res(int x){}
    public static void res(int x, int y){}
    public static void res(String x){}
}
