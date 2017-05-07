package StackAndQueue;

import java.util.Scanner;

/**
 * Created by ln on 2017/5/7.
 */
public class StackT1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String love = s.nextLine();
        String R = reverse(love);
        System.out.println(R);
    }

    public static String reverse(String str){
        Stack stack = new Stack(str.length());
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String R = "";
        while (!stack.isEmpty()){
            R = R + (char)stack.pop();
        }
        return R;
    }
}
