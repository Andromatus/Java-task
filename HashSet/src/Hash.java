import java.util.HashSet;
public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(5);
        hashSet.add(0);

        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Sedan");
        hashSet1.add("Hatchback");
        hashSet1.add("Wagon");
        hashSet1.add("Liftback");
        hashSet1.add("Coupe");
        hashSet1.add("Cabriolet");
        hashSet1.add("SUV");

        System.out.println(hashSet1);
    }
}
