package work;


//https://leetcode.com/problems/perfect-squares/submissions/
public class PerfectSqure {
    public static void main(String[] args) {

        System.out.println(find(4,0,1,1));
    }
    static int find(int target,int carry,int curr,int count){

        if(target==1 ) return 1;
        if(target==2 ) return 2;
        int sum=carry+(int)Math.pow(curr,2);
        if(sum==target){
            return count;
        }

        if(sum>target){
            return Integer.MAX_VALUE;
        }

        int count1=find(target,sum,curr,count+1);
        int count2=find(target,carry,curr+1,count);
        return (count1>count2 ? count2 : count1);
    }
}
