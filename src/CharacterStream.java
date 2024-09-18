import java.io.*;
import java.security.spec.ECField;

public class CharacterStream {
    public static void main(String[] args) {
        try(BufferedReader in = new BufferedReader(new FileReader("demo.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter("bufferchar.txt"))
        ){

           String  temp;

            while ((temp = in.readLine()) != null){
                out.write(temp);
//                System.out.println(temp);
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
