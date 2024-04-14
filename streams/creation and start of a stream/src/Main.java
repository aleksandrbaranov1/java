public class Main {
    public static void main(String[] args) {

       System.out.println("Hello, world " + Thread.currentThread().getName());

       myThread myThread = new myThread();
       myThread.start();

       Thread t2 = new Thread(new myThreadRunnable());
       t2.start();
    }
}
// 1 способ создания потока
class myThread extends Thread {
    @Override
    public void run(){
        System.out.println("поток myThread " + Thread.currentThread().getName());
    }
}

// 2 способ создания потока
class myThreadRunnable implements Runnable {
    @Override
    public void run(){
        System.out.println("поток myThread2" + Thread.currentThread().getName());
    }
}