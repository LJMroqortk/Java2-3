
public class BinarySearchTreeTest {
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertBST('G'); bst.insertBST('I');
		bst.insertBST('H'); bst.insertBST('D');
		bst.insertBST('B'); bst.insertBST('M');
		bst.insertBST('N'); bst.insertBST('A');
		bst.insertBST('J'); bst.insertBST('E');
		bst.insertBST('Q');
		
		System.out.printf("\nBinary Search Tree >>> ");
		bst.printBST();
		System.out.printf("Is There \"A\"? >>> ");
		TreeNode p1 = bst.searchBST('A');
		if(p1 != null)
			System.out.printf("Searching Success! Searched key : %c\n",p1.data);
		else
			System.out.printf("Searching Fail");
		
		System.out.printf("Is There \"Z\"? >>> ");
		TreeNode p2 = bst.searchBST('Z');
		if(p2 != null)
			System.out.printf("Searching Success! Searched key : %c\n",p2.data);
		else
			System.out.printf("Searching Fail \n");
	}
}
