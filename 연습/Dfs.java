import java.util.*;
public class Dfs{
	static ArrayList<Integer>[] adjList;
	static int visited[];
	public static void dfs(int u){
		visited[u]=1;
		System.out.print(u+" ");
		for(int v:adjList[u]){
			if(visited[v]==0){
				dfs(v);
			}
		}
		return;
	}
	public static void main(String[]args){
		int n=5;
		adjList=new ArrayList[n+1];
		visited=new int[n+1];
		
		for(int i=1;i<=n;i++){
			adjList[i]=new ArrayList<>();
		}
		
		adjList[1].add(2);
		adjList[1].add(3);
		adjList[2].add(1);
		adjList[2].add(4);
		adjList[2].add(5);
		adjList[3].add(1);
		adjList[4].add(2);
		adjList[5].add(2);
		
		dfs(1);
	}
}