package Tree;

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
}
