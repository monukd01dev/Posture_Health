package Posture.Health;

class MyThread implements Runnable {
    public void run() {
        new Hero();
    }
}


public class HeadQuarter {


    public static void main(String[] args) {

//        HeadQuarter hq = new HeadQuarter();
        int i = 0;
        for (; ; ) {
            System.out.println(++i);
            try {
                Thread.sleep(5000);

            } catch (Exception e) {
                e.printStackTrace();
            }
            MyThread mt = new MyThread();
            Thread t1 = new Thread(mt);
            t1.start();
            try {

                t1.join();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
