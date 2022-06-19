
public class LinkedTree {
	private TreeNode root;
	
	public TreeNode makeBT(TreeNode bt1,char data, TreeNode bt2) {
		TreeNode root = new TreeNode();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	public void preorder(TreeNode root) {
		if(root != null) {
			System.out.printf("%c", root.data);
			preorder(root.left);
			preorder(root.right);
		}
	}
	public void inorder(TreeNode root) {
		if(root != null) {
			inorder(root.left);
			System.out.printf("%c", root.data);
			inorder(root.right);
		}
	}
	public void posorder(TreeNode root) {
		if(root != null) {
			posorder(root.left);
			posorder(root.right);
			System.out.printf("%c", root.data);
		}
	}
}
