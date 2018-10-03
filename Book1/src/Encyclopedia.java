public class Encyclopedia extends Book{
    public Encyclopedia(int cipher, String author, String name, int year, String pubr_house) {
        super(cipher, author, name, year, pubr_house);
    }

    @Override
    int getCipher() {
        return cipher;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getPubr_house() {
        return pubr_house;
    }
}
