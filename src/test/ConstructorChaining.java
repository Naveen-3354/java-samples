package test;


class First{
    int num;
    public First(){
        System.out.println("Constructor chaining...");
    }
}

class Second extends First{
    public Second(){super();}
}

class Third extends Second{
    public Third(){super();}
}
public class ConstructorChaining extends Third{

    public ConstructorChaining(){
        super();
    }
    public static void main(String[] args) {
        ConstructorChaining obj = new ConstructorChaining();
    }
}
