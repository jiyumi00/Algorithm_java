import java.util.*;
import java.io.*;
import java.math.*;

public class Main2{
	static ArrayList<Integer> []adjList;
	static boolean visited[];
	static int n,m;
	static int max;
	static int cnts[];
	
	static void bfs(int u){
		
		Queue<Integer> queue=new LinkedList<>();
		queue.add(u);
		visited[u]=true;
		
		while(!queue.isEmpty()){
			int now=queue.poll();
			for(int v:adjList[now]){
				if(visited[v]) continue;
				cnts[v]++;
				visited[v]=true;
				queue.add(v);
			}
		}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		//n과 m입력받기
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		visited=new boolean[n+1];
		cnts=new int[n+1];
		adjList=new ArrayList[n+1];
		
		for(int i=0;i<=n;i++){
			adjList[i]=new ArrayList<>();
		}
		
		for(int i=0;i<m;i++){
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			
			adjList[a].add(b); //a를 해킹하기위한 컴퓨터 b
		}
		
		for(int i=1;i<=n;i++){
			visited=new boolean[n+1];
			bfs(i);
		}
		
		for(int i=1;i<=n;i++){
			if(max<cnts[i]) max=cnts[i];
		}
		for(int i=1;i<=n;i++){
			if(max==cnts[i]){
				System.out.print(i+" ");
			}
		}
	}
}