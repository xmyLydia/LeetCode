package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        Solution solution = new Solution();

        solution.findDisappearedNumbers(arr);
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
        //find the val bigger than current
        //set the val to pivot, use pivot to record the unique length
        int pivot = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (pivot == 0) {
                nums[pivot] = n;
                pivot++;
                continue;
            }
            if (n > nums[pivot - 1]) {
                nums[pivot] = n;
                pivot++;
            }
        }
        return pivot;
    }

    /**
     * @param nums Given an integer array nums,
     *             move all 0's to the end of it while maintaining
     *             the relative order of the non-zero elements.
     */
    public void moveZeroes(int[] nums) {
        int readPointer = 0;
        int writePointer = 0;
        for (; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }
        for (; writePointer < nums.length; writePointer++) {
            nums[writePointer] = 0;
        }
    }

    /**
     * @param A An array A of non-negative integers
     * @return an array consisting of all the even elements of A,
     * followed by all the odd elements of A.
     */
    public int[] sortArrayByParity(int[] A) {
        int readEvenPointer = 0;
        int writePointer = 0;
        List<Integer> odds = new ArrayList<>();
        for (; readEvenPointer < A.length; readEvenPointer++) {
            int value = A[readEvenPointer];
            if (value % 2 == 0) {
                //this is even number
                A[writePointer] = value;
                writePointer++;
            } else {
                odds.add(value);
            }
        }

        for (int i = 0; i < A.length - writePointer; i++) {
            A[i + writePointer] = odds.get(i);
        }
        return A;
    }

    /**
     * @param heights integer array, representing the current order that the students are standing in.
     *                Each heights[i] is the height of the ith student in line (0-indexed).
     * @return the number of indices where heights[i] != expected[i].
     */
    public int heightChecker(int[] heights) {
        int numberOfWrongIndex = 0;
        List<Integer> list = new ArrayList<>();
        for (int height : heights) {
            list.add(height);
        }
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        for (int i = 0; i < heights.length; i++) {
            int origin = heights[i];
            int sorted = sortedList.get(i);
            if (origin != sorted) {
                numberOfWrongIndex++;
            }
        }
        return numberOfWrongIndex;
    }

    /**
     * @param nums integer array
     * @return the third maximum number in this array.
     * If the third maximum does not exist, return the maximum number.
     */
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        List<Integer> sorted = set.stream().sorted().collect(Collectors.toList());
        if (sorted.size() < 3) {
            return sorted.get(sorted.size() - 1);
        } else {
            return sorted.get(sorted.size() - 3);
        }
    }

    /**
     * @param nums an array nums of n integers where nums[i] is in the range [1, n]
     * @return an array of all the integers in the range [1, n] that do not appear in nums.
     */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int num : nums) {
            if (num > 0) {
                num = num * -1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i< nums.length; i++){
            
        }
        return list;
    }
}
