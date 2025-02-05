package pack5;


class EvenThread extends Thread {
 public void run() {
     for (int i = 2; i <= 20; i += 2) {
         System.out.println("Even: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}


class OddThread extends Thread {
 public void run() {
     for (int i = 1; i <= 20; i += 2) {
         System.out.println("Odd: " + i);
         try {
             Thread.sleep(500); 
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}

public class EvenOddThreads {
 public static void main(String[] args) {
     
     EvenThread evenThread = new EvenThread();
     OddThread oddThread = new OddThread();

     
     evenThread.start();
     oddThread.start();
 }
}

