import test.Addtion;

public class Oops extends Addtion{

    //global variables
    int num2 = 200;
    String name;
    String city;


    // default constructor
//    public Oops(){}


    // no- arug constructor
    public Oops(){
        this.num2 = 3000;
        this.name = "test";
        this.city = "test";
    }


    // argument  constructor
    public Oops(int x, String y, String z){
        this.num2 = x;
        this.name= y;
        this.city = z;
    }


    // main method
    public static void main(String[] args) {

        // objects using argument  constructor
        Oops obj = new Oops(1213236, "hari", "coim");
        Oops obj1 = new Oops(234892, "selva","salem");

        // objects using no- argument  constructor
        Oops obj3 = new Oops();
        Oops obj4 = new Oops();

//        obj.getAllPerime();

        System.out.println(obj.num2);
        obj.test();
        int num = 100;


    }

    public void test() {
        System.out.println("This is test method..");
    }


}


// access
    // public
    //private
    //protected
    //default

// non-access
    //static
    //final
