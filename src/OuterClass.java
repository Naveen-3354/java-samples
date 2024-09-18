public class OuterClass {

    static class InnerClass{
       static void in(){
            System.out.println("Inner class void method..");
        }

    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        out.out();

//        OuterClass.InnerClass in = new OuterClass.InnerClass();
        OuterClass.InnerClass.in();
    }

    void out(){
        System.out.println("Outer class void method..");
    }
}
