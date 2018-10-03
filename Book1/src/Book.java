/*Абстрактный класс Книга (Шифр, Автор, Название, Год, Издатель-ство). Подклассы Справочник и Энциклопедия.*/
public abstract class Book {
    int cipher;
    String author;
    String name;
    int year;
    String pubr_house;

    public Book(int cipher, String author, String name, int year, String pubr_house) {
        this.cipher = cipher;
        this.author = author;
        this.name = name;
        this.year = year;
        this.pubr_house = pubr_house;
    }

    abstract int getCipher();
    abstract public String getAuthor();
    abstract public String getName();
    abstract public int getYear();
    abstract public String getPubr_house();
}
