import java.util.LinkedList;
public class Linked_list {
    public static void main(String[] args) {
        LinkedList<String> arrayList = new LinkedList<String>();
        arrayList.add("List1");
        arrayList.add("List2");
        arrayList.add("List3");

        arrayList.addLast("List4"); //добавление элемента в конец
        arrayList.addFirst("List5"); //добавление элемента в первую позицию

        System.out.println(arrayList);

        arrayList.removeFirst(); // удаление первого элемента
        arrayList.removeLast();

        System.out.println(arrayList);

    }



}
