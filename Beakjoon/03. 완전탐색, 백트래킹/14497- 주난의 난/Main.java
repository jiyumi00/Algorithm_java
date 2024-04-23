import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static int n,m;
	static int x1,y1,x2,y2;
	static char [][]map;
	static int [][]visited;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	
	public static class Pair{
		int x,y;
		public Pair(int y,int x){
			this.y=y;
			this.x=x;
		}
	}
	static void bfs(int y2,int x2){
		visited[y2][x2]=1;
		Queue<Pair> queue=new LinkedList<>();
		queue.add(new Pair(y2,x2));
		
		while(!queue.isEmpty()){
			Pair now=queue.poll();
			int nowY=now.y;
			int nowX=now.x;
			
			for(int i=0;i<4;i++){
				int ny=nowY+dy[i];
				int nx=nowX+dx[i];
				
				if(ny<0 ||ny>=n || nx<0 || nx>=m) continue;
				if(visited[ny][nx]!=0 &&map[ny][nx]=='0'){
					visited[ny][nx]=visited[nowY][nowX]+1;
					queue.add(new Pair(ny,nx));
				}
			}
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		st=new StringTokenizer(br.readLine());
		x1=Integer.parseInt(st.nextToken());
		y1=Integer.parseInt(st.nextToken());
		x2=Integer.parseInt(st.nextToken());
		y2=Integer.parseInt(st.nextToken());
		
		map=new char[n][m];
		visited=new int[n][m];
		
		for(int i=0;i<n;i++){
			String input=br.readLine();
			for(int j=0;j<m;j++){
				map[i][j]=input.charAt(j);
			}
		}
		bfs(y2,x2);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(visited[i][j]);
			}
			System.out.println();
		}
	}
}