import java.util.ArrayList;
import java.util.Scanner;

public class Vehicle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Demo{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vehicle> list = new ArrayList<>();
        Vehicle vehicle = new Vehicle();
        System.out.print("Enter the name : ");
        String name = scan.next();
        vehicle.setName(name);
        list.add(vehicle);
        System.out.println(list);
        for(Vehicle x: list){
            System.out.print("The name is "+ x.getName());
        }
    }
}