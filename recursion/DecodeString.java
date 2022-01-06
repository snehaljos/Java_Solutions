package work;

import java.util.LinkedList;
//https://leetcode.com/problems/decode-string/submissions/
public class DecodeString {
    public static void main(String[] args) {
        String res="";
        LinkedList<String> stack=new LinkedList<>();
        find("3[a2[bc]]",0,stack);
       while(!stack.isEmpty()){
            res=stack.pop()+res;
       }
       System.out.println(res);
    }
    static void find(String in,int index,LinkedList<String> stack){
        if(in.length()==0)return;
        if(index<in.length() && Character.isDigit(in.charAt(index))){
            if(stack.isEmpty()){
                stack.push(Character.toString(in.charAt(index)));
            }
            else if(Character.isDigit(stack.peek().charAt(0))){
                int s=Integer.parseInt(stack.pop()) *10;
                s+=Character.getNumericValue(in.charAt(index));
                stack.push(Integer.toString(s));
            }
            else{
                stack.push(Character.toString(in.charAt(index)));
            }
            find(in.substring(index+1,in.length()),index,stack);
        }
         else if(index<in.length()&&in.charAt(index)==']'){
String s="";
            int i=0;
            while (stack.peek()!="["){
                s=stack.pop()+s;
            }
            stack.pop();
           s= s.repeat(Integer.parseInt(stack.pop()));
            stack.push(s);
            find(in.substring(index+1,in.length()),index,stack);
        }
        else if(index<in.length() && in.charAt(index)=='[') {
            stack.push("[");
            find(in.substring(index+1,in.length()),index,stack);
        }
        else if(index<in.length()){
            stack.push(Character.toString(in.charAt(index)));
            find(in.substring(index+1,in.length()),index,stack);
        }

    }

}
