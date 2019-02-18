package String;

import java.util.ArrayList;
import java.util.List;

public class UniqueCharacterIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s = "leetcode";
    int index = firstUniqChar(s);
    System.out.println(index);
	}
  public static int firstUniqChar(String s) {
        int index = -1;
        List<Character> charlist = new ArrayList<>();
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++) {
        	char temp = arr[i];
        	charlist.add(temp);
        }
        for(int i=0;i<arr.length;i++) {
        	char char_a = arr[i];
        	 for(int j=0;j<arr.length;j++) {
        		 char char_b = arr[j];
        		 if(i!=j){
        			if(char_a==char_b){
        				continue;
        			}
        		 }
        	 }
        }
        return index;
    }

}
