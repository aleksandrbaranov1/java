public class Main {
    public static void main(String[] args) {

        myThread myThread = new myThread();
        myThread.start();

        myThreadRaunnable r1 = new myThreadRaunnable();
        Thread t1 = new Thread(r1); // создание потока на основе объекта r1
        t1.start();

        System.out.println("Поток Main завершен");
    }
}

class myThread extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 100; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
    }
}

class myThreadRaunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++)
            System.out.println(i + " " + Thread.currentThread().getName());
    }
}