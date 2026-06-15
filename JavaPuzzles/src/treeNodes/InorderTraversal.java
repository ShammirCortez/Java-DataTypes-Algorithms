package treeNodes;

import java.util.ArrayList;
import java.util.List;

import dataTypes.TreeNode;

public class InorderTraversal {

	public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        
        List<Integer> answer = new ArrayList<>();
        inorder(root,answer); 
        TreeNode.print(root);
        System.out.println(answer);
        
    }
	
	private static void inorder(TreeNode root, List<Integer> answer) {
		if (root == null) {return;}
		
		inorder(root.left,answer);
		answer.add(root.val);
		inorder(root.right,answer);
		
	}

}
