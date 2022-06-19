import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Back1260Test {
	public static int arr[][] = new int[1001][1001];
	public static boolean visited[] = new boolean[10001];
	static int Size; 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Size = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		for (int i = 1; i <= m; i++) {
			st = new StringTokenizer(br.readLine());
			int left = Integer.parseInt(st.nextToken());
			int right = Integer.parseInt(st.nextToken());
			
			arr[left][right] = 1;
			arr[right][left] = 1;
		}
		
		DFS(v);
		
		System.out.println();
		visited = new boolean[10001];
		BFS(v);
	}
	public static void DFS(int start) {

		visited[start] = true;
		System.out.print(start + " ");
		
		for(int i = 1; i <=Size;i++) {
			if(arr[start][i] == 1 && !visited[i])
				DFS(i);
		}
	}
	public static void BFS(int start) {
		Queue<Integer> que = new LinkedList<Integer>();
		
		visited[start] = true;
		que.offer(start);
		
		while (!que.isEmpty()) {
			int tmp = que.poll();
			System.out.print(tmp + " ");
			for(int i = 1; i <= Size; i++) {
				if(arr[tmp][i] == 1 && !visited[i]) {
					visited[i] = true;
					que.add(i);	
				}
					
			}
			
		}
	}
}
