package work;

import java.util.Stack;
//https://leetcode.com/problems/basic-calculator
public class BasicCalculator {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        cal("1+2+3+4+(1-1)", stack, 1,true);
        //stack.push(0);
        System.out.println(stack.peek());
    }

    static void cal(String n, Stack<Integer> stack, int sign,boolean flag) {
        if(n.isEmpty()){
            return;
        }
            if(Character.isDigit(n.charAt(0))){
                    int digit=n.charAt(0)-'0';
                    int i=1;
                    for( i=1;i<n.length();i++){
                        if(Character.isDigit(n.charAt(i))){
                            digit=digit*10+n.charAt(i)-'0';
                        }
                        else{
                            break;
                        }
                    }

                    stack.push(digit * sign + stack.pop() );


                cal(n.substring(i),stack,sign,true);
            }
            else if(n.charAt(0)=='('){
                stack.push(sign);
                stack.push(0);
                cal(n.substring(1),stack,1,false);
            }
            else if(n.charAt(0)==')'){
                stack.push(stack.pop()*stack.pop()+stack.pop());
                cal(n.substring(1),stack,sign,false);
            }
            else if(n.charAt(0)=='+'){
                sign=1;
                cal(n.substring(1),stack,sign,false);
            }
            else if(n.charAt(0)=='-'){
                sign=-1;
                cal(n.substring(1),stack,sign,false);
            }
            else{
                cal(n.substring(1),stack,sign,false);
            }
    }
}
