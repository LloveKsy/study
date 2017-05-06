package study_1;

/**
 * Created by ln on 2017/4/29.
 */
public class objectSort {
    public static void main(String[] args){
        //对象排序
        Person p[] = new Person[5];
        p[0] = new Person("suyan",15);
        p[1] = new Person("shuyun",12);
        p[2] = new Person("zhihua",17);
        p[3] = new Person("zhishui",10);
        p[4] = new Person("jiejie",16);
        insertSort(p);
        showArray(p);
    }

    private static void insertSort(Person[] p){
        for(int i=1;i<p.length;i++){
            int j = i;
            Person person = p[j];
            while(j>0&&person.compareTo(p[j-1])==-1) {
                p[j] = p[j-1];
                j--;
            }
            p[j] = person;
        }
    }

    private static void showArray(Person[] p){
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
    }

}
