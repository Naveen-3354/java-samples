import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bitstream {
    public static void main(String[] args) throws IOException{


        try( FileInputStream in = new FileInputStream("after.png");
             FileOutputStream out= new FileOutputStream("byteImage.jpg");){
            int temp;

            while ((temp=in.read())!= -1){
                out.write(temp);
                System.out.println(temp);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
