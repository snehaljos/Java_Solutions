package work;
//https://leetcode.com/problems/combination-sum-iii/
import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
        int[] in = new int[44];
        for (int i = 0; i < 44; i++) {
            in[i] = i + 1;
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        find(temp, 45, 9, res, 1);
        System.out.println(res);
    }

    static void find(List<Integer> temp, int n, int k, List<List<Integer>> res, int start) {
        if (temp.size() == k && n == 0) {
            List<Integer> li = new ArrayList<Integer>(temp);
            res.add(li);
            return;
        }
        if (k == 0 && n < 0) {
            return;
        }

        if (temp.size() == k) return;
        for (int i = start; i <= 9; i++) {
            temp.add(i);
            find(temp, n - i, k, res, i + 1);
            temp.remove(temp.size() - 1);

        }
    }
}
