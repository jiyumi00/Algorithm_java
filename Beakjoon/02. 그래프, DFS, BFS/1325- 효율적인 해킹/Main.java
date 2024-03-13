import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	static int n,m;
	static int a,b;
	static ArrayList<Integer> []adjList;
	static ArrayList<Integer> maxCnts;
	static int visited[];
	static int cnt,max=0;
	
	static int dfs(int u){
		visited[u]=1;
		
		for(int v:adjList[u]){
			if(visited[v]==0){
				dfs(v);
				cnt++;
			}
		}
		return cnt;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		adjList=new ArrayList[n+1];
		visited=new int[n+1];
		maxCnts=new ArrayList<>();
		
		for(int i=1;i<=n;i++){
			adjList[i]=new ArrayList<>();
		}
		for(int i=0;i<m;i++){
			st=new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());
			b=Integer.parseInt(st.nextToken());
			
			adjList[b].add(a);
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				visited[j]=0;
			}
			cnt=0;
			if(dfs(i)>=max){
				max=dfs(i);
				maxCnts.add(i);
			}
		}
		Collections.sort(maxCnts);
		for(int maxCnt:maxCnts){
			System.out.print(maxCnt+" ");
		}
	}
}