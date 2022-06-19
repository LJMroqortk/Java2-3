public class LinkedTrees {
	
	private TreeNodes root;
	
	public TreeNodes makeBT(TreeNodes bt1, char data,TreeNodes bt2) {
		TreeNodes root = new TreeNodes();
		root.data = data;
		root.left = bt1;
		root.right = bt2;
		
		return root;
	}
	
	public void preOrder(TreeNodes root) {
		if(root != null) {
			System.out.printf("%c",root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void inOrder(TreeNodes root) {
		if(root != null) {
			inOrder(root.left);
			System.out.printf("%c",root.data);
			inOrder(root.right);
		}
	}
	public void posOrder(TreeNodes root) {
		if(root != null) {
			posOrder(root.left);
			posOrder(root.right);
			System.out.printf("%c",root.data);
		}
	}
}