package BookExamples;

//'Improved' Version of MytThread.
public class ImprovedMT implements Runnable {
   // String threadName;
    Thread mt;

    //Thread is named when it is created.
    ImprovedMT(String name){
        mt = new Thread(this,name);

        //Starting thread when created.
        mt.start();
    }

    @Override
    public void run() {
        System.out.println(mt.getName()+" Starting.");
        try {
            for(int i=0; i<10;i++){
                Thread.sleep(400);
                System.out.println("In "+ mt.getName() + ", count is "+ i);
            }
        }
        catch (InterruptedException Ie){
            System.out.println("Error. Interrupted Exception");
        }
        System.out.println(mt.getName()+ " Terminating.");
    }
}

class ImprovedUse {
    public static void main(String[]args){
        System.out.println("Main Thread Starting");

        //Create runnable object
        ImprovedMT Imt = new ImprovedMT("Child #1");

        for(int i=0; i < 60; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
                //System.out.println("Main Thread.");
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Interrupted");
            }
        }
        System.out.println("Main Thread ending.");
    }
}
