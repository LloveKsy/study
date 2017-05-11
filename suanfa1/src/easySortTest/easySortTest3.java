package easySortTest;

/**
 * Created by ln on 2017/5/11.
 */
public class easySortTest3 {

    public static void main(String[] args){
        //1.冒泡排序
        int a1[] = {3,2,1,6,5,4,9,8,7};
        bubbleSort(a1);
        easySortTest.showArray(a1);
        //2.选择排序
        int a2[] = {3,2,1,6,5,4,9,8,7};
        selectSort(a2);
        easySortTest.showArray(a2);
        //3.插入排序
        int a3[] = {3,2,1,6,5,4,9,8,7};
        insertSort(a3);
        easySortTest.showArray(a3);
    }
    //冒泡排序
    public static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]<a[j-1]){
                    int t =a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
            }
        }
    }

    //选择排序
    public static void selectSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min = i;
            for (int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int t = a[i];
            a[i]=a[min];
            a[min]= t;
        }
    }

    //插入排序
    public static void insertSort(int a[]){
        for (int i=1;i<a.length;i++){
            int value = a[i];
            int k;
            for (k=i;k>=1&&value<a[k-1];k--){
                a[k]=a[k-1];
            }
            a[k]=value;
        }
    }
}
