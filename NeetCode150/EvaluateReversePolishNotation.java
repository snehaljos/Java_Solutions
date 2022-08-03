package NeetCode150;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        Stack<Integer> post=new Stack();
        String[] tokens={"2","1","+","3","*"};
        for(String c: tokens){
            if(c.equals("+")){
                int a=post.pop(),b=post.pop();
                post.push(b+a);
            }
            else if(c.equals("-")){
                int a=post.pop(),b=post.pop();
                post.push(b-a);
            }
            else if(c.equals("*")){
                int a=post.pop(),b=post.pop();
                post.push(b*a);
            }
            else if(c.equals("/")){
                int a=post.pop(),b=post.pop();
                post.push(b/a);
            }
            else{
                post.push(Integer.parseInt(c));
            }
        }
        System.out.println(post.peek());
    }
}
