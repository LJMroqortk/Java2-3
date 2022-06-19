import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
 
public class back1922Test {
    static int n,m;
    static int[] parent;
    static PriorityQueue<edge> pq = new PriorityQueue<edge>();
    static int result = 0;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());
        
        parent = new int[n+1];
        //1번 과정 : 처음에 parent는 자기 자신으로 정한다.
        for(int i=0; i<n+1; i++) {
            parent[i] = i;
        }
        
        //2번 과정: edge 객체를 만들어 우선순위 큐에 넣어준다.
        for(int i=0; i<m; i++) {
            String[] str = br.readLine().split(" ");
            pq.add(new edge(Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2])));
        }
                
        for(int i=0; i<m; i++) {
            //3번 과정: 하나씩 꺼내서 쓴다. 우선순위 큐가 빌 때 까지 반복한다.
            edge tmp = pq.poll();
            
            //4번 과정: 시작점과 끝점의 최상위 노드를 찾는다.
            int a = find(tmp.s);
            int b = find(tmp.e);
            
            if(a==b) continue;
            //5번 과정    
            union(a,b);
            result += tmp.v;
        }
        
        System.out.println(result);
        
    }
    
    //4번 과정: a == parent[a]라면 어디에도 이어지지 않은 것이므로 바로 return a
    //그렇지 않다면 parent[a]를 다시 find함수로 재귀적으로 하며 최상위 노드를 찾아준다.
    public static int find(int a) {
        if(a == parent[a]) return a;
        parent[a] = find(parent[a]);
        return parent[a];
    }
    //5번 과정: 두 노드를 이어주는 간선을 채택한다.
    public static void union(int a,int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        
        if(aRoot != bRoot) {
            parent[aRoot] = b;
        } else {
            return;
        }
    }
}
//1번 과정: 간선 class를 만들어준다.
class edge implements Comparable<edge>{
    int s;
    int e;
    int v;
    
    public edge(int s,int e,int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }
 
    @Override
    public int compareTo(edge arg0) {
        return arg0.v>=this.v?-1:1;
    }
}
