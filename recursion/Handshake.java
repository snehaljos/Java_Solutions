package work;
//https://practice.geeksforgeeks.org/problems/handshakes1303/1/


public class Handshake {
    public static void main(String[] args) {

            System.out.println(find(6/2));

    }
    static int find(int n){
        if(n<=1) return 1;


        int count=0;

        for(int i=0;i<n;i++){
            count+=find(i)*find(n-i-1);

        }

        return count;

    }
}
