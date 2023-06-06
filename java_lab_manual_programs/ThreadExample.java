public class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        t2.start();
    }
}

class MyThread extends Thread {
    private String name;
    public MyThread(String name) {
        this.name = name;
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}