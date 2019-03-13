package Stack;

import java.util.Collections;
import java.util.Stack;

public class MinStack {
	   Stack<Integer> stack ;
	   
	   public MinStack() {
	       stack = new Stack<>();
	    }
	    
	    public void push(int x) {
	       stack.push(x);
	    }
	    
	    public void pop() {
	        stack.pop();
	    }
	    
	    public int top(){ 
	    	int top_val = stack.pop();
	    	stack.push(top_val);
	    	return top_val;
	    }
	    
	    public int getMin() {
			int result = Collections.min(stack);
			
	        return result;
	    }
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
	           MinStack minstack = new MinStack();
	           minstack.push(-2);
	           minstack.push(0);
	           minstack.push(-3);
	           int val =  minstack.getMin();
	           System.out.println(val);
		}
}
