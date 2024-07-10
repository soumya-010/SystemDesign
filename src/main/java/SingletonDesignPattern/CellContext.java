package SingletonDesignPattern;

public class CellContext {
    private static volatile CellContext cellInstance;
    private static volatile int count;
    private CellContext () {
        System.out.println("Calling Private Constructor for CellContext");
        count = 0;
    }

    public static CellContext getCellInstance() {
        if (cellInstance == null) {
            synchronized (CellContext.class) {
                if (cellInstance == null) {
                    cellInstance = new CellContext();
                }
            }
        }
        return cellInstance;
    }

    public synchronized int getCount() {
        return count;
    }

    public synchronized void setCount() {
        this.count = getCount()+1;
    }
}
