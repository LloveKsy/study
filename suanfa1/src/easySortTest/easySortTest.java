package easySortTest;

/**
 * Created by ln on 2017/4/30.
 */
public class easySortTest {
    public static void main(String[] args){
        //1.冒泡排序
        int a1[] = {3,2,1,6,5,4,9,8,7};
        bubbleSort(a1);
        showArray(a1);
        //2.选择排序
        int a2[] = {3,2,1,6,5,4,9,8,7};
        selectSort(a2);
        showArray(a2);
        //3.插入排序
        int a3[] = {3,2,1,6,5,4,9,8,7};
        insertSort(a3);
        showArray(a3);
    }

    private static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }

    private static void selectSort(int a[]){

        for (int i=0;i<a.length-1;i++){
            int minIndex = i;
            for(int j=i;j<a.length;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                swap(a,i,minIndex);
            }
        }
    }

    private static void insertSort(int a[]){
        //1.插得次数
        for (int i=1;i<a.length;i++){
            int value = a[i];
            int j = i;
            while (j>0&&value<a[j-1]){
                a[j]=a[j-1];
                j--;
            }
            a[j]=value;
        }
    }

    public static void showArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void swap(int a[],int i,int j){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
