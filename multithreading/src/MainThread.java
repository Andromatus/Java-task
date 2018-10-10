/*Задержка потока.
Необходимо создать 3 потока, каждых из этих потоков запустить (например: main, second, first),
и когда эти потоки успешно отработают – вывести на экран сообщение (завершение потом first, second и main).*/
public class MainThread {
    public static void main(String[] args) throws InterruptedException {
        int index = 1;
        FirstThread firstThread = new FirstThread();
        TwoThread twoThread = new TwoThread();
        firstThread.start();
        twoThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("MainThread running " + index++ + '\n');

            
            Thread.sleep(2000);
        }
        System.out.println("-----> MainThread stopped");

    }
}
