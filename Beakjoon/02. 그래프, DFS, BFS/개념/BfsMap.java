import java.util.*;
import java.io.*;
public class BfsMap{
	static int n,m;
	static int[][]map;
	static int[][]visited;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	
	public static class Pair{
		int x,y;
		public Pair(int y,int x){
			this.y=y;
			this.x=x;
		}
	}
	public static void bfs(int y,int x){
		Queue<Pair>queue=new LinkedList<>();
		visited[y][x]=1;
		queue.add(new Pair(y,x));
		
		while(queue.size()!=0){
			Pair p=queue.poll();
			int nowY=p.y;
			int nowX=p.x;
			for(int i=0;i<4;i++){
				int ny=nowY+dy[i];
				int nx=nowX+dx[i];
				
				if(ny<0 || ny>=n || nx<0 || nx>=m) continue;
				if(visited[ny][nx]!=0 || map[ny][nx]==0) continue;
				visited[ny][nx]=visited[nowY][nowX]+1;
				queue.add(new Pair(ny,nx));
			}
		}
	}
	public static void main(String[]args)throws IOException{
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