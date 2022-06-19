import java.util.*;

public class Main {
	public static int[][] arr;
	public static boolean[] visited;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
		int point = scan.nextInt(); // 범위 설정 10 100 1000 10000 설정 크기 설정
		int line = scan.nextInt(); // 간선 만큼 정점 개수
		int start = scan.nextInt(); // 최상위 노드
		
		arr = new int[point+1][point+1]; // 10으로 할 경우 arr[11][11] : 10 / 10
		
		for(int i=1;i<=line;i++) {
			int a = scan.nextInt(); // a > x 
			int b = scan.nextInt(); // b > y
			arr[a][b] = 1; // left x y = 1 > true 정점이 들어 있는 포인트의 위치에 정점
			arr[b][a] = 1; // right x y   > true
		}
		
//		for(int i=1; i<arr.length;i++) { //행렬보기
//			for(int j=1;j<arr.length;j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		
        // 깊이우선탐색
		visited = new boolean[point+1]; // boolean으로 시작과 끝을 판단
		dfs(start);  // dfs로 탐색
		
		System.out.println();
        
        // 너비우선탐색
		visited = new boolean[point+1]; // boolean으로 시작과 끝을 판단 
		bfs(start); 

		
	}
	public static void dfs(int start) {
		visited[start] = true; // 전역 visited[10]
		System.out.print(start+ " "); // 3을 start 할 경우 3부터 시작해서 검색
		
		if(start == arr.length) {
			return;
		}

		for(int a=1;a<arr.length;a++) {
			if(arr[start][a] == 1 && visited[a] == false) {
				//arr[3][11] 중에 1이 들어있는 위치가 있고  vistend[3] false
				dfs(a); 
			}
		}
			
	}
	public static void bfs(int start) {
		Queue<Integer> que = new LinkedList<Integer>(); 
		
		que.add(start);
		visited[start] = true;
 		System.out.print(start+ " ");
		
		while(!que.isEmpty()) {
			
			int temp = que.peek();
			que.poll();
			for(int i=1; i<arr.length;i++) {
				if(arr[temp][i] ==1 && visited[i] == false) {
					que.add(i);
					visited[i] = true;
					System.out.print(i+ " ");
				}
			}
		}
	}
	
	
	
}