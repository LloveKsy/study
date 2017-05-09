package mergeSortTest;

/**
 * Created by ln on 2017/5/9.
 */
public class mergeSortTest2 {

    public static void main(String[] args){
        int a1[] = {2,4,5,7};
        int a2[] = {1,3,5,8};
        int a[] = new int[a1.length+a2.length];
        mergeSort(a,a1,a2);
        mergeSortTest.showArray(a);
    }

    public static void mergeSort(int a[],int a1[],int a2[]){
        int i = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1<a1.length&&i2<a2.length){
            if(a1[i1]<a2[i2]){
                a[i]=a1[i1];
                i1++;
            }else {
                a[i]=a2[i2];
                i2++;
            }
            i++;
        }
        while (i1<a1.length){
            a[i]=a1[i1];
            i++;
            i1++;
        }
        while (i2<a2.length){
            a[i]=a2[i2];
            i++;
            i2++;
        }
    }

}
