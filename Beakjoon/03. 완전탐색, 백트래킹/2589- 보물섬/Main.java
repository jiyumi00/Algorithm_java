import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	
	static int n,m;
	static char map[][];
	static int visited[][];
	static ArrayList<Pair> list=new ArrayList<>();
	static int maxCnt=0;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	
	static class Pair{
		int x,y;
		Pair(int y,int x){
			this.x=x;
			this.y=y;
		}
	}
	static void bfs(int y,int x){
		Queue<Pair> queue=new LinkedList<>();
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
				if(visited[ny][nx]!=0 || map[ny][nx]=='W') continue;
				visited[ny][nx]=visited[nowY][nowX]+1;
				
				queue.add(new Pair(ny,nx));
			}
			
		}
		
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new char[n][m];
		visited=new int[n][m];
		
		for(int i=0;i<n;i++){
			String input=br.readLine();
			for(int j=0;j<m;j++){
				map[i][j]=input.charAt(j);
				if(map[i][j]=='L'){
					list.add(new Pair(i,j));
				}
			}
		}
		
		for(Pair item:list){
			for(int i=0;i<n;i++){
				Arrays.fill(visited[i],0);
			}
			bfs(item.y,item.x);
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(maxCnt<visited[i][j]){
						maxCnt=visited[i][j];
					}
				}
			}
		}  
		System.out.println(maxCnt-1);
    }
}

