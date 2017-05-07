package StackAndQueue;

/**
 * Created by ln on 2017/5/7.
 */
public class Queue {
    private int maxSize;
    private int queArray[];
    private int front;
    private int last;
    private int length;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        queArray = new int[maxSize];
        front = 0;
        last = -1;
        length = 0;
    }

    public void push(int v){
        length++;
        if(++last==maxSize){
            last = 0;
        }
        queArray[last]=v;
    }

    public int remove(){
        int v = queArray[front++];
        length--;
        if(front==maxSize){
            front=0;
        }
        return v;
    }

    public int peek(){
        return queArray[front];
    }

}
