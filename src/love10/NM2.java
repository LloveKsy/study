package love10;

public class NM2 {
    public static void main(String[] args){
       NM2 n = new NM2();
       B b = n.getB("ksy");
       System.out.println(b.getLove());
    }

    public B getB(final String love){
        return new B() {
            {
                System.out.println("I love ksy!");
            }
            @Override
            public String getLove() {
                return love+"_";
            }
        };
    }
}
