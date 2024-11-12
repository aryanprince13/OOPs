class ChildThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println("Child Thread - Count: " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread();

        childThread.start();
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000); 
                System.out.println("Main Thread - Count: " + i);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        try {
            childThread.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Main thread execution completed.");
    }
}
