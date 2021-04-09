package Array;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, -1,0,0,0};
        Solution solution = new Solution();

        solution.removeDuplicates(arr);
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
        Arrays.sort(A);
        return A;
    }

    /**
     * Given a fixed length array arr of integers, duplicate each occurrence of zero,
     * shifting the remaining elements to the right.
     *
     * @param arr
     */
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp == 0) {
                shiftToNext(i, arr);
                arr[i] = 0;
                i++;
            }
        }
    }

    private void shiftToNext(int index, int[] arr) {
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
    }

    /**
     * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
     *
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        Arrays.sort(nums1);
    }

    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public int removeDuplicates(int[] nums) {
        int currentIndex = 0;
        int uniqueLength = nums.length;
        int pivotIndex = currentIndex + 1;

        if (nums.length == 1) {
            return 1;
        }
        int currentVal = nums[currentIndex];
        int pivotVal = nums[pivotIndex];
        while (pivotIndex < uniqueLength) {
            currentVal = nums[currentIndex];
            pivotVal = nums[pivotIndex];
            if (currentVal == pivotVal) {
                pivotIndex++;
                uniqueLength --;
                continue;
            }
            //until the value is different, move those value to the next position of current value
            int offset = pivotIndex - currentIndex - 1;

            for (int i = pivotIndex; i < nums.length; i++) {
                nums[i - offset] = nums[i];
            }
            currentIndex++;
            pivotIndex = currentIndex + 1;
        }

        return uniqueLength;
    }
}
