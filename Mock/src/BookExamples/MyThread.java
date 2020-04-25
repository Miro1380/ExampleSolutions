package BookExamples;

public class MyThread implements Runnable {
    String threadName;
    MyThread(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run() {
        System.out.println(threadName+" Starting.");
        try {
            for(int i=0; i<10;i++){
                Thread.sleep(400);
                System.out.println("In "+ threadName + ", count is "+ i);
            }
        }
        catch (InterruptedException Ie){
            System.out.println("Error. Interrupted Exception");
        }
        System.out.println(threadName + " Terminating.");
    }
}

class UseThreads{
    public static void main(String[]args){
        System.out.println("Main Thread Starting");

        //Create runnable object
        MyThread mt = new MyThread("Child #1");

        // Construct a thread from that object
        Thread child1 = new Thread(mt);

        //Start running the thread.
        child1.start();

        for(int i=0; i < 60; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
                //System.out.println("Main Thread.");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(child1.getName()+ "Interrupted");
            }
        }
        System.out.println("Main Thread ending.");
    }
}
