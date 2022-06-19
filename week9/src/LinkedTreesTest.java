
public class LinkedTreesTest {
	public static void main(String[] args) {
		LinkedTrees T = new LinkedTrees();
		
		TreeNodes n7 = T.makeBT(null,'D', null);
		TreeNodes n6 = T.makeBT(null,'C', null);
		TreeNodes n5 = T.makeBT(null,'B', null);
		TreeNodes n4 = T.makeBT(null,'A', null);
		TreeNodes n3 = T.makeBT(n6,'/', n7);
		TreeNodes n2 = T.makeBT(n4,'*', n5);
		TreeNodes n1 = T.makeBT(n2,'-', n3);
	
		System.out.println();
		
		System.out.printf("\n preOrder >>>>");
		T.preOrder(n1);
		System.out.printf("\n inOrder >>>>");
		T.inOrder(n1);
		System.out.printf("\n posOrder >>>>");
		T.posOrder(n1);
		
	}

}

