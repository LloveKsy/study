package Test10;

/**
 * Created by ln on 2017/5/16.
 */
public class Test2 {
    public static void main(String[] args){
        L l1 = new L(1,111);
        L l2 = new L(20,2011);
        L l3 = new L(23,2311);
        L l4 = new L(62,6211);
        L l5 = new L(12,1311);
        HashTable ht = new HashTable(50);
        ht.insert(l1);
        ht.insert(l2);
        ht.insert(l3);
        ht.insert(l4);
        ht.insert(l5);
        ht.show();
        ht.delete(62);
        if(ht.find(12)!=null){
            System.out.println(ht.find(12).value);
        }else {
            System.out.println("is error");
        }
        ht.show();
    }
}
