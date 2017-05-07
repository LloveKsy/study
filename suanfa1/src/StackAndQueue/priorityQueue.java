package StackAndQueue;

/**
 * Created by ln on 2017/5/7.
 */
public class priorityQueue {
    private int maxSize;
    private int queueArray[];
    private int nItems;

    public priorityQueue(int s){
        maxSize = s;
        queueArray = new int[maxSize];
        nItems=0;
    }

    public void push(int v){
        int i = nItems-1;
        while (i>=0&&v>queueArray[i]){
            queueArray[i+1]=queueArray[i];
            i--;
        }
        queueArray[i+1]=v;
        nItems++;
    }

    public int remove(){
        return queueArray[--nItems];
    }

    public int peek(){
        return queueArray[nItems-1];
    }

    public boolean isEmpty(){
        return nItems==0;
    }

    public boolean isFull(){
        return nItems==maxSize;
    }
}
