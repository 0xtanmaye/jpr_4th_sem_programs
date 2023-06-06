class MyThread extends Thread {
   public void run() {
      System.out.println("Starting " + Thread.currentThread().getName());
      try {
         Thread.sleep(500);
      } catch (InterruptedException e) {
         System.out.println("Thread interrupted: " + e.getMessage());
      }
      System.out.println("Finishing " + Thread.currentThread().getName());
   }
}

public class Main3 {
   public static void main(String[] args) {
      MyThread thread1 = new MyThread();
      thread1.setName("Thread 1");
      MyThread thread2 = new MyThread();
      thread2.setName("Thread 2");

      thread1.start();
      thread2.start();

      System.out.println("Main thread finished");
   }
}