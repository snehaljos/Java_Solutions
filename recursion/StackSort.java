package work;
//https://www.geeksforgeeks.org/sort-a-stack-using-recursion/
import java.util.Stack;

public class StackSort {
    public static void main(String[] args) {
        Stack<Integer> in=new Stack<>();
        in.push(-10);
        in.push(9);
        in.push(8);
        System.out.println(in);
        sort(in);
        System.out.println(in);
    }
    static void sort(Stack<Integer> in){
        if(in.isEmpty()){
            return;
        }
        else{
            int temp=in.pop();
            sort(in);
            sortHelper(in,temp);
        }
    }
    static void sortHelper(Stack<Integer> in,int element){
        if(in.isEmpty() || element>in.peek()){
            in.add(element);
        }
        else{
            int temp=in.pop();
            sortHelper(in,element);
            in.add(temp);
        }
    }
}
