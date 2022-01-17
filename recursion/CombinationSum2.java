package work;
//https://leetcode.com/problems/combination-sum-ii/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] in = new int[]{10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(in);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(in, temp, 8, res, 0);
        System.out.println(res);
    }

    static void find(int[] in, List<Integer> temp, int target, List<List<Integer>> res, int start) {
        if (target == 0) {
            List<Integer> li = new ArrayList<Integer>(temp);
            res.add(li);
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < in.length; i++) {
            if (i > start && in[i] == in[i - 1]) continue;
            temp.add(in[i]);
            find(in, temp, target - in[i], res, i + 1);
            temp.remove(temp.size() - 1);
        }

    }
}
