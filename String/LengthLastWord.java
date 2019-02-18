package String;

public class LengthLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LengthLastWord lengthWord = new LengthLastWord();
        String s = " ";
        int length = lengthWord.lengthOfLastWord(s);
        System.out.println(length);
        
	}
    public int lengthOfLastWord(String s) {
    	s=" ";
        if(s!=null&&s!=" "&&s!=""&&s.trim()!=null) { 
        String[] arr = s.split(" ");
        String last = arr[arr.length-1];
        return last.length();
        }
        return 0;
    }
}
