public class ThreadClass extends Thread{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
//        for(int i = 0; i<10; i++){
//            ThreadClass thread = new ThreadClass();
//            thread.start();
//        }

        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }


    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}


class FirstThread extends Thread{
    public void run(){
        System.out.println("First thread started..");
        System.out.println(Thread.currentThread().getName());
    }
}