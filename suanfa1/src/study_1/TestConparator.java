package study_1;

import java.util.Comparator;

/**
 * Created by ln on 2017/4/29.
 */
public class TestConparator implements Comparator<Zoo>{

    public static void main(String[] args){
        Zoo z[] = new Zoo[5];
        z[0] = new Zoo("suyan",15);
        z[1] = new Zoo("shuyun",12);
        z[2] = new Zoo("zhihua",17);
        z[3] = new Zoo("zhishui",10);
        z[4] = new Zoo("jiejie",16);
        insertSort(z);
        showArray(z);
    }

    private static void insertSort(Zoo[] p){
        TestConparator t1 = new TestConparator();
        for(int i=1;i<p.length;i++){
            int j = i;
            Zoo zoo = p[j];
            while(j>0&&t1.compare(zoo,p[j-1])==-1) {
                p[j] = p[j-1];
                j--;
            }
            p[j] = zoo;

        }
    }

    private static void showArray(Zoo[] p){
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
    }

    @Override
    public int compare(Zoo o1, Zoo o2) {
        if(o1.getAge()>o2.getAge()){
            return 1;
        }else if(o1.getAge()==o2.getAge()){
            return 0;
        }else{
            return -1;
        }
    }
}
