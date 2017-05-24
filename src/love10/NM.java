package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class NM {
    public static void main(String[] args){
        NM n = new NM();
        Book b = n.getBook(20,"haha","ksy");
        System.out.println(b.getLove());
    }

    public Book getBook(int price,String name,final String love){
        {
            System.out.println(love+"----");
        }
        return new Book(price,name){
            public String getLove(){
                System.out.println(love);
                return love;
            }
        };
    }
}
