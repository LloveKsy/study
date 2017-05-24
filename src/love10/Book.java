package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class Book {
    public int price;
    public String name;

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }

    public String getLove(){
        return "no";
    }
}
