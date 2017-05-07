package StackAndQueue;

/**
 * Created by ln on 2017/5/7.
 */
public class Queue2 {
    private int maxSize;
    private int queArraY[];
    private int front;
    private int rear;
    private int nItems;

    public Queue2(int s){
        maxSize = s;
        queArraY = new int[s];
        front =0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int v){
        if(rear==maxSize-1){
            rear = -1;
        }
        queArraY[++rear]=v;
        nItems++;
    }

    public int remove(){
        int v = queArraY[front++];
        if(front==maxSize){
            front=0;
        }
        nItems--;
        return v;
    }

    public int peekFront(){
        return queArraY[front];
    }

    public boolean isEmpty(){
        return nItems==0;
    }

    public boolean isFull(){
        return nItems==maxSize;
    }

    public int size(){
        return nItems;
    }
}
