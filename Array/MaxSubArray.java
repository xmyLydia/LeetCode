package Array;

import java.util.ArrayList;

/**
 * @author mingyux
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if (list.size() == 0) {
                list.add(temp);
                continue;
            }
            int currentSum = calculateSum(list);

            if (res < res + currentSum) {
                list.add(temp);
                res = res + currentSum;
            } else {
                i = i -1;
                list.clear();
            }

        }

        return res;
    }

    private int calculateSum(ArrayList<Integer> list) {
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            res += list.get(i);
        }
        return res;
    }
}
