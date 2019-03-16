package DP;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindromeString {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s = "abcda";
       String result = longestPalindrome(  s) ;
       System.out.println(result);
	}
	 
	 
	 public static String longestPalindrome( String s) {
		 /*
		  * Given a string s, 
		  * find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
		  */
		if(s==null)return s;
		if(s.length()==0||s.length()==1)return s;
	    String result = "";
	    int length = s.length();
	    int record_i=-1;int record_j = -1;
	    boolean dp[][] = new boolean[length][length];
	    for(int i=0;i<length;i++) {
	    	dp[i][i]=true;
	    }
	    char start = s.charAt(0);char end = s.charAt(s.length()-1);
	    if(s.length()==2) {
	       if(start==end) {
	    	   return s;
	       }else {
	    	   return s.substring(s.length()-1, s.length());
	       }
	    }
	    for(int n=2;n<=s.length();n++) {
	    	for(int i = 0;i<=length-n;i++) {
	    		int j = i+n-1;
	    		start = s.charAt(i);end = s.charAt(j);
	    		if(n==2) {
	    			if(start==end) {
	    				dp[i][j]=true;record_i = i;record_j = j;
	    			}else {
	    				dp[i][j]=false;
	    			}
	    		}else {
	    			if(start==end&&dp[i+1][j-1]==true) {
	    				dp[i][j]=true;record_i = i;record_j = j;
	    			}else {
	    				dp[i][j]=false;
	    			}
	    		}
	    	}
	    }
	    if(record_i==-1&&record_j==-1)return ""; 
	    result = s.substring(record_i,record_j+1);
	    return result;
	 }
	  
}
