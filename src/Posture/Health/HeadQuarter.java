package Posture.Health;

class MyThread implements Runnable {

    public void run() {

        new Hero();
        while (Hero.flag) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}


public class HeadQuarter {


    public static void main(String[] args) {

//        HeadQuarter hq = new HeadQuarter();
//        int i = 0;
        for (; ; ) {
//            System.out.println(++i);
            try {
                Thread.sleep(1800000);

            } catch (Exception e) {
                e.printStackTrace();
            }
            MyThread mt = new MyThread();
            Thread t1 = new Thread(mt);
            Hero.flag = true;
            t1.start();
            try {

                t1.join();

            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(t1.getState());
        }
    }
}
