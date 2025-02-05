package pack5;


class MyThread extends Thread {
 public void run() {
     System.out.println("Hello, Java!");
 }
}

public class BasicThreadExample {
 public static void main(String[] args) {
     
     MyThread thread = new MyThread();
     thread.start(); 
 }
}

