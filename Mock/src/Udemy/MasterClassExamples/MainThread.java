package Udemy.MasterClassExamples;

public class MainThread {

    public static void main(String[] args) {
        System.out.println("Hello from main thread.");

        Thread anotherThread = new AnotherThread();

        //JVM starts the thread with start.
        anotherThread.start();

        System.out.println("Hello again from the main thread.");
    }
}
