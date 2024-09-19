package test;

public class Chaining {
    public static void main(String[] args) {
        Chaining chaining = new Chaining();
        chaining.first(chaining);
    }

    public  void first(Chaining chaining){
//        Chaining chaining = new Chaining();
        chaining.second(chaining);
    }

    public void second(Chaining chaining){
//        Chaining chaining = new Chaining();
        chaining.third();
    }

    public  void third(){
        System.out.println("Method chaining....");
    }
}
