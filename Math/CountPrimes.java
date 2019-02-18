package Math;

import java.util.ArrayList;
import java.util.List;

public class CountPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num = countPrimes(10);
   System.out.println(num);
	}
public static int countPrimes(int n) {
        int num=0;
        List<Integer> list_ori = new ArrayList<>();
        if(n==0) {
        	return 0;
        }
        List<Integer> list_prim = new ArrayList<>();
        for(int i=2;i<n;i++) {
        	list_ori.add(i);
        }
        list_prim.add(2);
        for(int i=1;i<n-2;i++) {
        	int val = list_ori.get(i);//3
        	boolean flag = true;
        	for(int j=0;j< i ;j++) {
        		int temp = list_ori.get(j);//2
        		if(val%temp==0) {
        			flag=false;//means no prime
        			
        		}
        	}
        	if(flag) {
        		//prime value
        		list_prim.add(val);
        	}
        }
        return list_prim.size();
    }
}
