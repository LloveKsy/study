package TreeTest;

/**
 * Created by ln on 2017/5/8.
 */
public class Huffman_Test {
    public static void main(String[] args){
        Code c1 = new Code(2,'A');
        Code c2 = new Code(2,'E');
        Code c3 = new Code(3,'I');
        Code c4 = new Code(6,'S');
        Code c5 = new Code(1,'T');
        Code c6 = new Code(1,'U');
        Code c7 = new Code(2,'Y');
        Code c8 = new Code(4,'_');   //空格符
        Code c9 = new Code(1,'%');   //换行符
        pTree p1 = new pTree();
        p1.root = c1;
        pTree p2 = new pTree();
        p2.root = c2;
        pTree p3 = new pTree();
        p3.root = c3;
        pTree p4 = new pTree();
        p4.root = c4;
        pTree p5 = new pTree();
        p5.root = c5;
        pTree p6 = new pTree();
        p6.root = c6;
        pTree p7 = new pTree();
        p7.root = c7;
        pTree p8 = new pTree();
        p8.root = c8;
        pTree p9 = new pTree();
        p9.root = c9;

        //2.
        priorityQueue queue = new priorityQueue(9);
        queue.push(p1);  //2 A
        queue.push(p8);  //4 _
        queue.push(p9);  //1 %
        queue.push(p3);  //3 I
        System.out.println(queue.pop());

    }


}
