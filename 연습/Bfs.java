import java.util.*;
public class Bfs{
	static ArrayList<Integer>[] adjList;
	static int visited[];
	public static void bfs(int u){
		Queue<Integer> queue=new LinkedList<>();
		visited[u]=1;
		queue.add(u);
		while(queue.size()!=0){
			u=queue.poll(); //첫번 째 값 반환하고 제거
			System.out.print(u+" ");
			for(int v:adjList[u]){
				if(visited[v]==0){
					visited[v]=visited[u]+1;
					queue.add(v);
				}
			}
		}
		System.out.println();
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
		
		bfs(1);
		
		System.out.println("1번 부터 5번까지 최단거리 : "+(visited[5]-1));
	}
}