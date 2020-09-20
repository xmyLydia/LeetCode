package Array;

public class Solution {
    public static void main(String[] args) {
        int[] arr =new int[]{1,0,1};
        Solution solution = new Solution();
        int a = solution.findMaxConsecutiveOnes(arr);
    }


    /**
     * Task: Given a binary array, find the maximum number of consecutive 1s in this array.
     * @param nums, which is an array of numbers
     * @return maximum number of consecutive 1
     */
    public int findMaxConsecutiveOnes(int[] nums) {

        int count = 0;
        int record = 0;

        for (int num : nums) {

            if (num == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > record) {
                record = count;
            }
        }

        return record;
    }
}
