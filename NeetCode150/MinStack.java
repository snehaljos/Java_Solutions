package NeetCode150;

import java.util.Stack;

public class MinStack {
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(-1);
        s.push(0);
        System.out.println(s.getMin());
    }

}
class stack{
    Stack<Integer> st=new Stack<>();
    Stack<Integer> stMin=new Stack<>();
    public stack() {
        st=new Stack<>();
         stMin=new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if(stMin.isEmpty()){
            stMin.push(val);
        }
        else{
            stMin.push(Math.min(stMin.peek(),val));
        }
    }

    public void pop() {
        st.pop();
        stMin.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return stMin.peek();
    }
}
