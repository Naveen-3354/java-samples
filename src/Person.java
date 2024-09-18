import java.io.*;

public class Person implements Serializable {
    private String name;
    public int age;
    private String number;
    private transient String place;

    public Person(String name, int age, String number, String place) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}


class Store{

    public static void main(String[] args) {

//        Person person1 = new Person("Hari", 12, "1203204", "Coimbatore");
//
//        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person.ser"));){
//            out.writeObject(person1);
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        Person person1 = null;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.ser"))){

            person1 =(Person) in.readObject();

            System.out.println(person1.getName());
            System.out.println(person1.getAge());
            System.out.println(person1.getNumber());
            System.out.println(person1.getPlace());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
