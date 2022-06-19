import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;


class Node implements Comparable<Node> {
	int start;
	int end;
	int weight;
	
	public Node(int start, int end, int weight) {
		this.start = start;
		this.end = end;
		this.weight = weight;
	}

	@Override
	public int compareTo(Node o) {
		return 	weight - o.weight;
	}
	
	
}

public class Back1647Test {
	static int[] parent;
	static ArrayList<Node> Nodelist;
	
	public static void main(String[] args) throws NumberFormatException , IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		Nodelist = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(bf.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			
			Nodelist.add(new Node(start,end,weight));
		}
		
		parent = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		Collections.sort(Nodelist);
		
		int small = 0;
		int big = 0;
		for(int i = 0; i < Nodelist.size(); i++) {
			Node node = Nodelist.get(i);
			
			if(finds(node.start) != finds(node.end)) {
				small += node.weight;
				unions(node.start, node.end);
				
				big = node.weight;
			}
		}
		bw.write((small - big) + "\n");
		bw.flush();
		bf.close();
		bw.close();
	}
	
	public static int finds(int x) {
		if(x == parent[x])
			return x;
		return parent[x] = finds(parent[x]);
	}
	
	public static void unions(int x, int y) {
		x = finds(x);
		y = finds(y);
		
		if(x != y)
			parent[y] = x;
	}
}