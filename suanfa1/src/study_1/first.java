package study_1;

/**
 * Created by ln on 2017/4/29.
 */
public class first {

    public static void main(String[] args){
        //冒泡排序
        int a1[] = {1,3,5,7,6,4,2,9,8};
        bubbleSort(a1);
        System.out.print("冒泡排序:");
        showArray(a1);
        //选择排序
        int a2[] = {1,3,5,7,6,4,2,9,8};
        selectSort(a2);
        System.out.print("选择排序:");
        showArray(a2);
        //插入排序
        int a3[] = {10,3,5,7,6,4,2,9,8};
        insertSort(a3);
        System.out.print("插入排序:");
        showArray(a3);
        //对象排序
        Person p[] = new Person[5];
        p[0] = new Person("suyan",15);
        p[1] = new Person("shuyun",12);
        p[2] = new Person("zhihua",17);
        p[3] = new Person("zhishui",10);
        p[4] = new Person("jiejie",16);
    }

    //bubbleSort
    private static void bubbleSort(int a[]){
        int t;
        for(int i = 0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }

    //selectSort
    private static void selectSort(int a[]){
        int minIndex;
        for(int i=0;i<a.length-1;i++){
            minIndex = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                swap(a,i,minIndex);
            }
        }
    }

    //insertSort
    private static void insertSort(int a[]){
        for(int i=1;i<a.length;i++){
            int j = i;
            int value = a[j];
            while(j>0&&value<a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = value;
        }
    }

    private static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    private static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
