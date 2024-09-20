package test;

public class SingleTon {
    private static SingleTon obj = null;
    private SingleTon(){

    }

    public static SingleTon getInstance(){
        if(SingleTon.obj == null){
            SingleTon.obj = new SingleTon();
        }
        return obj;
    }
}

class Main{
    public static void main(String[] args) {
        SingleTon obj = SingleTon.getInstance();
        SingleTon obj1 = SingleTon.getInstance();
        System.out.println(obj == obj1);
    }
}