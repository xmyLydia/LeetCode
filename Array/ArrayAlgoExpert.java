package Array;

import java.util.ArrayList;
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
        for (int i = 0; i < array.length; i++) {
            if(array[i] > targetSum) {
                continue;
            }
            
        }
        return new ArrayList<Integer[]>();
    }

}
