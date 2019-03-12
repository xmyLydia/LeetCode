package String;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String[] arr = {"c","c" };
     String result = longestCommonPrefix(arr);
     System.out.println(result);
	}
public static String longestCommonPrefix(String[] strs) {
        String result = "";
        if(strs==null) {
        	return null;
        }
        int minLen = strs[0].length();
        for(int i=1;i<strs.length;i++) {
        	int tmpLen = strs[i].length();
        	if(minLen>tmpLen) {
        		minLen = tmpLen;
        	}
        }
        for(int i=minLen;i>0;i--) {
        	String prefix = strs[0].substring(0, i );
        	boolean flag = true;
        	for(int j=1;j<strs.length;j++) {
        		String tmp = strs[j].substring(0, i );
        		if(!tmp.equals(prefix)) {
        			flag = false;
        		}
        	}
        	if(flag==true)return prefix;
        }
        return result;
    }
}
