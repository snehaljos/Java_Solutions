package work;
//https://leetcode.com/problems/combination-sum/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Target {
static List<List<Integer>> g= new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> res=new LinkedList<>();
		helper(new int[] {2,3,5},8,0,res);
		System.out.println(g);
	}
	
	static void helper(int[] nums,int target,int total,LinkedList<Integer> res) {
		if(total==target) {
			g.add((LinkedList<Integer>) res.clone());
			return;
		}
		if(nums.length==0 || total>target) {

			return;
		}

		//System.out.println(Arrays.toString(nums));
		res.push(nums[0]);
		helper(nums,target,total+nums[0],res);
		res.pop();
		helper(Arrays.copyOfRange(nums, 1, nums.length),target,total,res);

	}

}
