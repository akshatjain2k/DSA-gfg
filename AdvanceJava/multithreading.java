package AdvanceJava;

// Extending Thread Class
// class multithreading extends Thread {
// public void run() {
// System.out.println("Inside Test Thread");
// }
// }

// class Main {
// public static void main(String[] args) { 
// multithreading t = new multithreading();
// t.start();
// System.out.println("Inside Main Thread");
// }
// }

// Implementing Runnable Interface
class multithreading implements Runnable {
    public void run() {
        System.out.println("Inside Test Thread");
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new multithreading());
        t.start();
        System.out.println("Inside Main Thread");
        Thread.sleep(1);
    }
}