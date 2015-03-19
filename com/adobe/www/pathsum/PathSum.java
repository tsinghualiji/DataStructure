package com.adobe.www.pathsum;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum){
		
		if(root == null) return false;
		if(root.left == null && root.right == null && sum - root.value ==0) return sum == root.value;
		return hasPathSum(root.left, sum - root.value) || hasPathSum(root.right, sum - root.value);
				
	}
}
