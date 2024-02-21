import java.util.*;
import java.io.*;

public class Main{
	static int [][]map;
	static int n,m;
	static int [][]visited;
	static int[] dy={-1,0,1,0};
	static int[] dx={0,1,0,-1};
	
	public static class Pair{
	int x,y;
	Pair(int y,int x){
		this.y=y;
		this.x=x;
	}
}
	public static void bfs(int y,int x){
		Queue<Pair> queue=new LinkedList<>();
		visited[y][x]=1;
		queue.add(new Pair(y,x));
		
		while(queue.size()!=0){
			Pair p=queue.poll();
			int nowX=p.x;
			int nowY=p.y;
			for(int i=0;i<4;i++){//좌표 이동하면서 
				int ny=nowY+dy[i];
				int nx=nowX+dx[i];
				//좌표 벗어나거나 방문했거나 map이 0이면 continue
				if(ny<0 || ny>=n || nx<0 || nx>=m) continue;
				if(visited[ny][nx]!=0 || map[ny][nx]==0) continue;
				visited[ny][nx]=visited[nowY][nowX]+1;
				queue.add(new Pair(ny,nx));
			}
		}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		StringTokenizer st=new StringTokenizer(input);
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n+1][m+1];
		visited=new int[n+1][m+1];
		
		for(int i=0;i<n;i++){
			String s=br.readLine();
			for(int j=0;j<m;j++){
				map[i][j]=s.charAt(j)-'0';
			}
		}
		bfs(0,0);
		System.out.println(visited[n-1][m-1]);
	}
}