/*Создать класс Tiles (кафель), который будет содержать поля с закрытым доступом: brand, size_h, size_w, price
* и метод класса getData(), setData().*/
public class Tiles {
    private String brand;
    private int size_h;
    private int size_w;
    double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize_h() {
        return size_h;
    }

    public void setSize_h(int size_h) {
        this.size_h = size_h;
    }

    public int getSize_w() {
        return size_w;
    }

    public void setSize_w(int size_w) {
        this.size_w = size_w;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Tiles() {};

}
