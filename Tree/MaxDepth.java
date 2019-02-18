package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

public class MaxDepth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeNode t4 = new TreeNode(4);
      t4.left = null; t4.right=null;
      TreeNode t2 = new TreeNode(2);
      t2.left = t4; t2.right = null;
      TreeNode t5 = new TreeNode(5);
      t5.left = null; t5.right = null;
      TreeNode t3 = new TreeNode(3);
      t3.left = t5; t3.right = null;
      TreeNode t1 = new TreeNode(1);
      t1.left = t2; t1.right = t3;//构建一棵树，从叶子节点到根节点
      MaxDepth mxdepth = new MaxDepth();
      int result = mxdepth.maxDepth(t1);
      System.out.println(result);
	}
public int maxDepth(TreeNode root) {
        HashMap<TreeNode,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> treeStack= new Stack();
        if(root==null) {
        	return 0;
        }
        treeStack.push(root);
        map.put(root,1);
        while(!treeStack.isEmpty()) {
        	TreeNode popNode = treeStack.pop();
        	if(popNode!=null) {
        		TreeNode left = popNode.left;
        		TreeNode right = popNode.right;
        		if(left==null&&right==null) {
        			int depth = map.get(popNode);
        			list.add(depth);
        			continue;
        		}else if(left==null&&right!=null) {
        			int depth = map.get(popNode);
        			treeStack.push(right);
        			map.put(right,depth+1);
        			continue;
        		}else if(left!=null && right==null) {
        			int depth = map.get(popNode);
        			treeStack.push(left);
        			map.put(left,depth+1);
        			continue;
        		}
        		treeStack.push(right);
        		treeStack.push(left);
        		int depth = map.get(popNode);
        		map.put(left,depth+1);
        		map.put(right,depth+1);
        	}
        }
        return Collections.max(list);
    }
}
