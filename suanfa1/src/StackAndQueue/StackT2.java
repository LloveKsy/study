package StackAndQueue;

import java.util.Scanner;

/**
 * Created by ln on 2017/5/7.
 */
public class StackT2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String value = s.nextLine();
        check(value);
    }

    private static void check(String s){
        Stack stack = new Stack(s.length());
        for(int i=0;i<s.length();i++){
            int c = s.charAt(i);
            boolean flag = isBoss(c,stack);
            if(!flag){
                System.out.println("第"+(i+1)+"处输入的值有错误，"+(char)c);
                break;
            }
        }
    }

    private static boolean isBoss(int c,Stack stack){
        if(c=='{'||c=='['||c=='('){
            stack.push(c);
        }else if(c=='}'){
            int v = stack.pop();
            if(v!='{'){
                return false;
            }
        }else if(c==')'){
            int v = stack.pop();
            if(v!='('){
                return false;
            }
        }else if(c==']'){
            int v = stack.pop();
            if(v!='['){
                return false;
            }
        }
        return true;

    }
}
