public class FirstThread extends Thread {
    @Override
    public void run() {
        int index = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("FirstThread running " + index++ + '\n');

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("-----> FirstThread stopped");
    }
}
