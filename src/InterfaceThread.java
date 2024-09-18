public class InterfaceThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            try {

                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName());
        });
        thread.start();
    }

}
