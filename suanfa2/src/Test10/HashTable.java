package Test10;

/**
 * Created by ln on 2017/5/16.
 */
public class HashTable {
    public L a[];
    public int length;

    public HashTable(int length) {
        this.length = length;
        a = new L[length];
    }

    //insert
    public void insert(L i){
        int key = i.key;
        int hashCode = HaXiMath(key);
        while (a[hashCode]!=null){
            hashCode++;
            hashCode = HaXiMath(hashCode);
        }
        a[hashCode]=i;
    }

    //find
    public L find(int key){
        int hashCode = HaXiMath(key);
        while (a[hashCode]!=null){
            if(a[hashCode].key==key){
                return a[hashCode];
            }
            hashCode++;
            hashCode = HaXiMath(hashCode);
        }
        return null;
    }

    //delete
    public L delete(int key){
        int hashCode = HaXiMath(key);
        while (a[hashCode]!=null){
            if(a[hashCode].key==key){
                L i = a[hashCode];
                a[hashCode]=null;
                return i;
            }
            hashCode++;
            hashCode = HaXiMath(hashCode);
        }
        return null;
    }

    //哈希函数
    public int HaXiMath(int key){
        int v = key%length;
        return v;
    }

    //遍历
    public void show(){
        for (int i=0;i<length;i++){
            if(a[i]!=null){
                System.out.println("i="+i+":::"+a[i].key+":"+a[i].value);
            }
        }
    }
}
