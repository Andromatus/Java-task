/*Создайте абстрактный класс AbstractHandler.
* В теле класса создать абстрактные void open(), void create(), void change(), void save().
* Создайте производные классы XMLHandler, TXTHandler, DOCHandler от базового класса AbstractHandler.
* Написать программу, которая будет выполнять определение документа и для каждого формата должны быть
* методы открытия, создания, редактирования, сохранения определенного формата документа. */
abstract class AbsrtactHandler {
   public abstract void open();
   public abstract void create();
   public abstract void change();
   public abstract void save();
}

class XMLHandler extends AbsrtactHandler{
     @Override
     public void open() {
         System.out.println("Открытие формата XML");
     }

     @Override
     public void create() {
         System.out.println("Создание формата XML");
     }

     @Override
     public void change() {
         System.out.println("Редактирование формата XML");
     }

     @Override
     public void save() {
         System.out.println("Сохранение формата XML");
     }
 }

class TXTHandler extends AbsrtactHandler{
    @Override
    public void open() {
        System.out.println("Открытие формата TXT");
    }

    @Override
    public void create() {
        System.out.println("Создание формата TXT");
    }

    @Override
    public void change() {
        System.out.println("Редактирование формата TXT");
    }

    @Override
    public void save() {
        System.out.println("Сохранение формата TXT");
    }
}

class DOCHandler extends AbsrtactHandler{
    @Override
    public void open() {
        System.out.println("Открытие формата DOC");
    }

    @Override
    public void create() {
        System.out.println("Создание формата DOC");
    }

    @Override
    public void change() {
        System.out.println("Редактирование формата DOC");
    }

    @Override
    public void save() {
        System.out.println("Сохранение формата DOC");
    }
}


public class Main {
    public static void main(String[] args) {
        AbsrtactHandler txt = new TXTHandler();
        txt.open();
        txt.change();
        AbsrtactHandler doc = new DOCHandler();
        doc.open();
    }
}
