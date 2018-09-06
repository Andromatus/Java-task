import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int proKey = 321;
        int expKey = 445;
        System.out.print("Введите ключ: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(proKey == number){
            System.out.println("Pro version");
            DocumentWorker documentPro = new ProDocumentWorker();
            documentPro.saveDocument();
        }
        else if (expKey ==  number){
            System.out.println("Expert version");
            DocumentWorker documentExpert = new ExperDocumentWorker();
            documentExpert.saveDocument();
        }
        else {
            System.out.println("Free version");
            DocumentWorker documentFree = new DocumentWorker();
            documentFree.saveDocument();
        }
    }
}
