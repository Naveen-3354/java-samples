public class First {
    public static void main(String[] args) throws MyException {
        System.out.println("Before execution");
        String name = null;
        String[] arr = {"qw"};
//        try{
        test();
//            System.out.println(arr[7]);
//            System.out.println(name.length());
//        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
//        }catch (Exception e){
//            e.printStackTrace();
//        }


//        finally{
//            System.out.println("Finally block executed..");
//        }
        System.out.println("After execution");
    }

    static void test() throws MyException {
        throw new MyException("this is myexception..");
    }

}


class MyException extends Exception {
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
