import java.util.function.Function;

public class Lambda{
    public static void main(String[] args) {


//        Addtions addtions = (x,y)->{
//            System.out.println(x+y);
//        };
//
//        addtions.add(12,34);

        Function<Integer, String > function = (x)->{
            System.out.println("parameter is :"+x);
            return "Function ";
        };
       String result =  function.apply(100);

        System.out.println(result);
    }

}


//()->{}


interface Addtions{
    void add(int x, int y);
}