
public class LinkedTreeTest {
	public static void main(String[] args) {
		LinkedTree bttr = new LinkedTree();
		
		TreeNode n7 = bttr.makeBT(null, 'D', null);
		TreeNode n6 = bttr.makeBT(null, 'C', null);
		TreeNode n5 = bttr.makeBT(null, 'B', null);
		TreeNode n4 = bttr.makeBT(null, 'A', null);
		TreeNode n3 = bttr.makeBT(n6, '/', n7);
		TreeNode n2 = bttr.makeBT(n4, '*', n5);
		TreeNode n1 = bttr.makeBT(n2, '-', n3);
		
		System.out.printf("\nPreorder >>> ");
		bttr.preorder(n1);
		System.out.printf("\nInorder >>> ");
		bttr.inorder(n1);
		System.out.printf("\nPosorder >>> ");
		bttr.posorder(n1);
	}
}
