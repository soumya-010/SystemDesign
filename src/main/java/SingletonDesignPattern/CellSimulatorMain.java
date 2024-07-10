package SingletonDesignPattern;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;


    RunnableDemo( String name) {
        threadName = name;
        System.out.println("Creating " +  threadName );
    }

    public void run() {
        System.out.println("Running " +  threadName );
        try {
            for(int i = 100; i > 0; i--) {
                synchronized (CellContext.class) {
                    CellContext cellCtxt1 = CellContext.getCellInstance();
                    cellCtxt1.setCount();
                    System.out.println("Thread: " + threadName + ", " + cellCtxt1.getCount());
                }
                // Let the thread sleep for a while.
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );

        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}


public class CellSimulatorMain {
    public static void main (String args[]) {

        RunnableDemo R1 = new RunnableDemo( "cellCtxt1");
        R1.start();

        RunnableDemo R2 = new RunnableDemo( "cellCtxt2");
        R2.start();
    }
}
