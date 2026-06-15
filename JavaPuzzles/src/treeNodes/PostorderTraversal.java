package treeNodes;

import java.util.ArrayList;
import java.util.List;

import dataTypes.TreeNode;

public class PostorderTraversal {

	public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        List<Integer> answer = new ArrayList<>();
        postorder(root,answer); 
        System.out.println(answer);
        
    }
	
	private static void postorder(TreeNode root, List<Integer> answer) {
		if (root == null) {return;}
		
		postorder(root.left,answer);
		postorder(root.right,answer);
		answer.add(root.val);
	}

}
