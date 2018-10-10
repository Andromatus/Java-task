public class TwoThread extends Thread{
    @Override
    public void run() {
        int index = 1;

        for (int i = 0; i < 10; i++) {
            System.out.println("TwoThread running " + index++ + '\n');

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
        System.out.println("-----> TwoThread stopped");
    }
}
