package Tree;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        iterateTree(root, list);
        return list;
    }

    private void iterateTree(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        iterateTree(node.left, list);
        list.add(node.val);
        iterateTree(node.right, list);
    }

    public String removeVowels(String s) {

        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            char tmp = s.charAt(i);
            if (tmp != 'a' && tmp != 'e' && tmp != 'i' && tmp != 'o' && tmp != 'u') {
                newString += tmp;
            }
        }
        return newString;
    }

    public boolean checkIfExist(int[] arr) {
        if (arr.length <= 1) {
            return false;
        }
        int[] arrDouble = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrDouble[i] = 2 * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            int checkVal = arr[i];
            for (int j = 0; j < arrDouble.length; j++) {
                int doubleVal = arrDouble[j];
                if (checkVal == doubleVal && i != j) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        if (arr.length == 3) {
            if (arr[1] > arr[0] && arr[1] < arr[2]) {
                return true;
            } else {
                return false;
            }
        }

        //find the max index
        int indexMax = 0;
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            if (maxVal < val) {
                maxVal = val;
                indexMax = i;
            }
        }
        if (indexMax == 0 || indexMax == arr.length - 1) {
            return false;
        }
        //partition them into two array
        //left array will increasing strictly
        boolean isMountain = true;
        for (int i = 0; i < indexMax - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        //right array will decreasing strictly
        for (int i = indexMax; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] replaceElements(int[] arr) {
        //loop each element in the array
        if (arr.length == 1) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {

            int maxForCurrentVal = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[j];
                if (temp > maxForCurrentVal) {
                    maxForCurrentVal = temp;
                }
            }
            arr[i] = maxForCurrentVal;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] array = new int[]{0, 3, 2, 1};
        solution.validMountainArray(array);
    }

}
