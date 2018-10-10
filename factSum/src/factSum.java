public class factSum {
    public static void main(String[] args) {
        int a = 5;
        int factSum = 1;
        do
        {
            factSum = factSum * a;
            a--;
        }
        while (a > 0);
        System.out.println(factSum);
    }
}
