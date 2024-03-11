import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	static int n,m;
	static int map[][];
	static int visited[][];
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	static int cnt=0,cnt2=0;
	static ArrayList<Pair> list=new ArrayList<>();
	
	static class Pair{
		int x,y;
		Pair(int y,int x){
			this.y=y;
			this.x=x;
		}
	}
	static void dfs(int y,int x){
		visited[y][x]=1;
		if(map[y][x]==1){
			list.add(new Pair(y,x));
			return;
		}
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 || ny>=n || nx<0 ||nx>=m ||visited[ny][nx]!=0) continue;
			dfs(ny,nx);
		}
	}
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n][m];
		visited=new int[n][m];
		
		//입력받기
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++){
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		
		while(true){
			
			for(int i=0;i<n;i++){
				Arrays.fill(visited[i],0);
			}
			list.clear();
			dfs(0,0);
			cnt2=list.size();
			
			for(Pair p:list){
				map[p.y][p.x]=0;
			}
			boolean flag=false;
			
			for(int i=0;i<n;i++){
				for(int j=0;j<m;j++){
					if(map[i][j]!=0){
						flag=true;
					}
				}
			}
			cnt++;
			if(!flag) break;
		}
		System.out.println(cnt+"\n"+cnt2);
	}
}