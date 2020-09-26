package Array;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 1};
        Solution solution = new Solution();
        //int a = solution.findMaxConsecutiveOnes(arr);
        System.out.println(solution.countDigit(262));
    }


    /**
     * Task: Given a binary array, find the maximum number of consecutive 1s in this array.
     *
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

    /**
     * Task: Given an array nums of integers, return how many of them contain an even number of digits.
     *
     * @param nums, which is an array of numbers
     * @return how many of them contain an even number of digits.
     */
    public int findNumbers(int[] nums) {

        int countEven = 0;
        int countDigitNumber = 0;
        if (nums != null) {
            for (int num : nums) {
                countDigitNumber = countDigit(num);
                if (countDigitNumber % 2 == 0) {
                    countEven++;
                }
            }

        }
        return countEven;
    }

    private int countDigit(int num) {
        int countDigit = 0;

        int remainder = num;
        while (remainder > 0) {
            remainder = remainder / 10;
            countDigit++;
        }
        return countDigit;
    }

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        placeNumberIntoArray(A);
        return A;
    }

    private void placeNumberIntoArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            for (int j = 0; j < array.length; j++) {
                if (num > array[j]) {
                    int temp = array[j];
                    array[j] = num;
                    array[i] = temp;
                    j--;
                }
            }
        }
    }
}
