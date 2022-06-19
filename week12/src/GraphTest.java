
class AdjMatrix {
	private int matrix[][] = new int[10][10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	}
	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV)
			System.out.println("그래프에 없는 정점입니다.");
		else {
			matrix[v1][v2] = 1;
			matrix[v2][v1] = 1;
		}
	}
	public void printMatrix() {
		for(int i = 0; i < totalV;i++) {
			System.out.printf("\n\t\t");
			for(int j = 0; j < totalV;j++)
				System.out.printf("%2d",matrix[i][j]);
		}
	}
}
class GraphNode {
	int vertex;
	GraphNode link;
}

class AdjList {
	private GraphNode head[] = new GraphNode[10];
	private int totalV = 0;
	
	public void insertVertex(int v) {
		totalV++;
	}

	public void insertEdge(int v1, int v2) {
		if(v1 >= totalV || v2 >= totalV) {
			System.out.println("그래프에 없는 정점입니다.");
		}
		else {
			GraphNode gNode = new GraphNode();
			gNode.vertex = v2;
			gNode.link = head[v1];
			head[v1] = gNode;
		}
	}
	public void printAdjList() {
		GraphNode gNode = new GraphNode();
		for(int i = 0; i < totalV; i++) {
			System.out.printf("\n정점 %c의 인접리스트", i+65);
			gNode = head[i];
			while(gNode != null) {
				System.out.printf("-> %c", gNode.vertex + 65);
				gNode = gNode.link;
				}
			}
		}
 }

public class GraphTest {
	public static void main(String[] args) {
		AdjMatrix adj = new AdjMatrix();
		for(int i = 0; i < 4; i++) 
				adj.insertVertex(i);
			adj.insertEdge(0, 3);
			adj.insertEdge(0, 1);
			adj.insertEdge(1, 3);
			adj.insertEdge(1, 2);
			adj.insertEdge(1, 0);
			adj.insertEdge(2, 3);
			adj.insertEdge(2, 1);
			adj.insertEdge(3, 2);
			adj.insertEdge(3, 1);
			adj.insertEdge(3, 0);
			System.out.printf("\n 그래프 adj의 인접행렬 : ");
			adj.printMatrix();
			System.out.println();
			
			AdjList adjlist = new AdjList();
			for(int i = 0; i < 4; i++)
				adjlist.insertVertex(i);
			adjlist.insertEdge(0, 3);
			adjlist.insertEdge(0, 1);
			adjlist.insertEdge(1, 3);
			adjlist.insertEdge(1, 2);
			adjlist.insertEdge(1, 0);
			adjlist.insertEdge(2, 3);
			adjlist.insertEdge(2, 1);
			adjlist.insertEdge(3, 2);
			adjlist.insertEdge(3, 1);
			adjlist.insertEdge(3, 0);
			System.out.printf("\n 그래프 adjlist의 인접리스트 : ");
			adjlist.printAdjList();
			System.out.println();
	}
}