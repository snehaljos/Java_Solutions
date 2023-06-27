package NeetCode150;

public class FindMinimuminRotatedSortedArray {
    public static void main(String args[]){
        int[] in={5,1,2,3,4};
        int index=0;
        if(in[0]>in[in.length-1]){
            index=findPivot(in);
        }
        else{
            System.out.println( in[0]);
        }
        System.out.println(in[index]);

    }
    static int findPivot(int[] in){
        int l=0,r=in.length-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)/2;

            if(mid-1>=0 && mid+1<in.length && in[mid]>in[mid-1] && in[mid]>in[mid+1]){
                return mid+1;
            }
            else if(mid-1>=0 && mid+1<in.length && in[mid]<in[mid-1] && in[mid]<in[mid+1]){
                return mid;
            }
            if(in[mid]>=in[l]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }
        return mid;
    }
}
