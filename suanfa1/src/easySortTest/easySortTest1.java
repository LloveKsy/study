package easySortTest;

/**
 * Created by ln on 2017/5/1.
 */
public class easySortTest1 {
    public static void main(String[] args){
        int a1[] = {3,2,1,6,5,4,9,8,7};
        insertSort(a1);
        easySortTest.showArray(a1);

        int a2[] = {3,2,1,6,5,4,9,8,7};
        bubbleSort(a2);
        easySortTest.showArray(a2);

        int a3[] = {3,2,1,6,5,4,9,8,7};
        selectSort(a3);
        easySortTest.showArray(a3);
    }

    private static void selectSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minIndex = i;
            for (int j=i;j<a.length;j++){
                if(a[minIndex]>a[j]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                easySortTest.swap(a,i,minIndex);
            }
        }
    }

    private static void bubbleSort(int a[]){
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-1-i;j++){
                if(a[j]>a[j+1]){
                    easySortTest.swap(a,j,j+1);
                }
            }
        }
    }

    private static void insertSort(int a[]){
        for(int i=1;i<a.length;i++){
            int value = a[i];
            int j;
            for(j=i;j>0&&value<a[j-1];j--){
                a[j]=a[j-1];
            }
            a[j]=value;
        }
    }
}
