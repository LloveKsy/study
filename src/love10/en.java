package love10;

/**
 * Created by ln on 2017/5/22.
 */
public class en {
    String love = "sy";
    public void show(){
        System.out.println(this);
    }
    class enen{
        int age = 10;
        public void display(){
            System.out.println(en.this);
        }
        @Override
        public String toString() {
            return "enen{" +
                    "age=" + age +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "en{" +
                "love='" + love + '\'' +
                '}';
    }

    public static void main(String[] args){
        en e = new en();
        e.show();
        en.enen e2 = e.new enen();
        e2.display();
    }
}
