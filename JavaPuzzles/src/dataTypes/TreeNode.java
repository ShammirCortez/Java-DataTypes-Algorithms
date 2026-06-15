package dataTypes;

public class TreeNode {
	
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(){}
	
	public TreeNode(int val){
		this.val = val;
	}
	
	public TreeNode(int val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	public static void print(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        builder.append("( ");
        
        buildString(root, builder);
        
        if (builder.length() > 2) {
            builder.setLength(builder.length() - 2); 
        }
        
        builder.append(" )");
        System.out.println(builder.toString());
    }
    
    private static void buildString(TreeNode node, StringBuilder builder) {
        if (node == null) {return;}
        
        buildString(node.left, builder);
        builder.append(node.val).append(", ");
        buildString(node.right, builder);
    }
	
}
