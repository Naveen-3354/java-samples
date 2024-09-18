package test;

public class Addtion<T extends Number> {

    private void getPerime(T num) {
        int count = 0;
        for (int i = 2; i <= num.intValue(); i++) {
            if (num.intValue() % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("Its a prime number.");
        } else {
            System.out.println("Its not a prime number.");
        }
    }

     void getAllPerime(int num) {
        for (int x = 2; x <= num; x++) {
            int count = 0;
            for (int i = 2; i <= x; i++) {
                if (x%i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(x +" Its a prime number.");
            }
        }
    }


}
