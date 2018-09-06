/*Вывод на экран элементов List:
 *Создать список, заполнить его на 10 элементов и вывести на экран содержимое используя iterator.  */
import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);
        arrayList.add(9);

        Iterator iterator = arrayList.iterator();
        //есть ли в коллекции следующий элемент
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }
        }
}
