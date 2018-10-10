import java.util.Scanner;
public class Premium {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите заработную плату: ");
        int zar = in.nextInt();
        Scanner en = new Scanner(System.in);
        System.out.println("Введите выслуги лет: ");
        int vis = en.nextInt();
        int pr;
        switch (vis){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: pr = (int)(zar * 0.10);
                    zar += pr;
                    System.out.println("Заработная плата от 10%: "+ zar);
                    break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: pr = (int)(zar * 0.15);
                     zar += pr;
                     System.out.println("Заработная плата от 15%: "+ zar);
                     break;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: pr = (int)(zar * 0.25);
                     zar += pr;
                     System.out.println("Заработная плата от 25%: "+ zar);
                     break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20: pr = (int)(zar * 0.35);
                     zar += pr;
                     System.out.println("Заработная плата от 35%: "+ zar);
                     break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25: pr = (int)(zar * 0.45);
                     zar += pr;
                     System.out.println("Заработная плата от 45%: "+ zar);
                     break;
            default: pr = (int)(zar * 0.50);
                     zar += pr;
                     System.out.println("Заработная плата от 50%: "+ zar);
                     break;

        }

    }

}
