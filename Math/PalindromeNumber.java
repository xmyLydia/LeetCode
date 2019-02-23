package Math;

 

public class PalindromeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
      PalindromeNumber pal = new PalindromeNumber();
      int x = 10;
      boolean result = pal.isPalindrome(x);
      System.out.println(result);
	}
public boolean isPalindrome(int x) {
        if(x<0)return false;
        if(x==0) return true;
        String str = String.valueOf(x);
        StringBuilder builder = new StringBuilder(str);
        StringBuilder next = builder.reverse();
        if(str.equals(String.valueOf(next))) {
        	return true;
        }else return false;
        
    }
}
