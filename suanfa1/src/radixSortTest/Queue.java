package radixSortTest;

/**
 * Created by ln on 2017/5/9.
 */
public class Queue {
    private int maxSize;
    private int array[];
    private int start;
    private int last;
    private int length;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        start = 0;   //?
        last = -1;
        length = 0;
    }

    public void push(int i){
        if(last==maxSize-1){
            last = 0;
        }else {
            last++;
        }
        array[last] = i;
        length++;
    }

    public int pop(){

        int v = array[start];
        if(start==maxSize-1){
            start=0;
        }else {
            start++;
        }
        length--;
        return v;
    }

    public int peek(){
        return array[start];
    }

    public boolean isEmpty(){
        return length==0;
    }

    public boolean isFull(){
        return length==maxSize;
    }
}
