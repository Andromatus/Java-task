public class Runner {
    public static void main(String[] args) {
        Directory directory = new Directory(985, "Брюс Эккель", "Thinking in Java",
                2017, "Питер");
        Encyclopedia encyclopedia = new Encyclopedia(616, "\tАнна Анисимова, В. Головина, Светлана Зверева",
                "Историческая энциклопедия", 2017, "Абрис");
        System.out.println("Шифр: " + directory.cipher + '\n' + "Автор: " + directory.author + '\n' +
        "Наименование книги: " + directory.name + '\n' + "Год издания: " + directory.year + '\n' +
        "Издательство: " + directory.pubr_house);
        System.out.println("Шифр: " + encyclopedia.cipher + '\n' + "Автор: " + encyclopedia.author + '\n' +
                "Наименование книги: " + encyclopedia.name + '\n' + "Год издания: " + encyclopedia.year + '\n' +
                "Издательство: " + encyclopedia.pubr_house);
    }


}
