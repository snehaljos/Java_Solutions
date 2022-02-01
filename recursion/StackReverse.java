package work;

import java.util.Stack;
//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> in=new Stack<>();
        in.push(1);
        in.push(2);
        in.push(3);
        System.out.println(in);
        reverse(in);
        System.out.println(in);
    }
    static void reverse(Stack<Integer> in){
        if(in.isEmpty()){
            return;
        }
        else{
            int temp=in.pop();
            reverse(in);
            reverseHelper(in,temp);
        }
    }
    static void reverseHelper(Stack<Integer> in,int element){
        if(in.isEmpty() ){
            in.add(element);
        }
        else{
            int temp=in.pop();
            reverseHelper(in,element);
            in.add(temp);
        }
    }
}
