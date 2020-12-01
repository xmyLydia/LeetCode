package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author mingyux
 */
public class ArrayAlgoExpert {


    /**
     * challenge 1
     *
     * @param array
     * @param targetSum
     * @return
     */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        int[] result = new int[2];

        for (int i = 0; i < array.length - 1; i++) {
            int elementI = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int elementJ = array[j];
                if (elementI + elementJ == targetSum) {
                    result[0] = elementI;
                    result[1] = elementJ;
                    return result;
                }
            }
        }
        return new int[0];
    }

    /**
     * challenge 2
     *
     * @param array
     * @param sequence
     * @return
     */
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int prevIndex = -1;
        int currentIndex = -1;
        for (int i = 0; i < sequence.size(); i++) {
            int element = sequence.get(i);
            currentIndex = array.indexOf(element);
            if (prevIndex >= currentIndex) {
                return false;
            }
            prevIndex = currentIndex;
            array.remove(currentIndex);
        }
        return true;
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        int minArrayLength = 3;
        if (array.length < minArrayLength) {
            return new ArrayList<>();
        }
        List<Integer[]> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > targetSum) {
                continue;
            }
            Arrays.sort(array);
            Integer[] yDimArray = new Integer[3];
            int twoSumTarget = targetSum - array[i];
            int left = i + 1;
            int right = array.length - 1;
            while (left < right) {
                int elementsSum = array[left] + array[right];
                if (elementsSum == twoSumTarget) {
                    yDimArray[0] = array[i];
                    yDimArray[1] = array[left];
                    yDimArray[2] = array[right];
                    list.add(yDimArray);
                    left++;
                    right--;
                }else if(elementsSum < twoSumTarget) {
                    left ++;
                }else {
                    right --;
                }
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {12, 3, 1, 2, -6, 5, -8, 6};
        int targetSum = 0;
        List<Integer[]> result = threeNumberSum(arr, targetSum);
        System.out.println(result);
    }

}
