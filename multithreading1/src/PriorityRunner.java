public class PriorityRunner {
    public static void main(String[] args) throws InterruptedException {
        PriorityThread min = new PriorityThread("min");
        PriorityThread norm = new PriorityThread("norm");
        PriorityThread max= new PriorityThread("max");
        min.setPriority(1);
        norm.setPriority(5);
        max.setPriority(10);
        min.start();
        norm.start();
        max.start();
    }
}

class PriorityThread extends Thread{
    private String name;
    PriorityThread(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread running " + name);
        for (int i = 1; i<=50; i++){
            try{
                Thread.sleep(1000);
                System.out.println("i = " + i + " name = " + name);
            }catch (InterruptedException e){
                System.err.println(e);
            }

        }
        System.out.println("name thread = " + name + " stopped");

    }
}
