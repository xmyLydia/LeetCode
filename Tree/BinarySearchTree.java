package Tree;

public class BinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeNode t3 = new TreeNode(3);
	      t3.left = null; t3.right=null;
	      TreeNode t6 = new TreeNode(1);
	      t6.left = null; t6.right = null;
	      TreeNode t4 = new TreeNode(6);
	      t4.left = t3; t4.right = t6;
	      TreeNode t1 = new TreeNode(1);
	      t3.left = null; t1.right = null;
	      TreeNode t5 = new TreeNode(5);
	      t5.left = t1; t5.right = t4;//构建一棵树，从叶子节点到根节点
	      BinarySearchTree bst = new BinarySearchTree();
	      boolean result = bst.isValidBST(t5);
	      System.out.println(result);
	}
	 public boolean isValidBST(TreeNode root) {
	       
	        TreeNode left = root.left;
	        TreeNode right = root.right;
	         if(left==null&&right==null) {
	        	return true;//leaf node
	        }  
	        	if(left==null&&right!=null) {
	        		if(right.val>root.val) {
	        			return true;
	        		}else {
	        			return false;
	        		}
	        	} if(left!=null&&right==null){//left not null, right is null
	        		return false;
	        	} if(left!=null&&right!=null) {//both not null
	        		if(left.val<root.val && right.val>root.val) {
	        			 return  (isValidBST(root.left))&&(isValidBST(root.right));
	        		}else {
	        			return false;
	        		}
	        	}
	      return true;
	         
	        
	    }
}
