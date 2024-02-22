import java.util.*;
import java.io.*;

public class Main{
	static int [][]map;
	static int [][]visited;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	static StringTokenizer st;
	static int cnt=0;
	static int m,n;
	
	public static void dfs(int y,int x){
		visited[y][x]=1;
		
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 || ny >=n || nx<0 || nx>=m) continue;
			if(visited[ny][nx]!=0 || map[ny][nx]==0) continue;
			dfs(ny,nx);
		}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCase;
		int k;
		int x,y;
		
		testCase=Integer.parseInt(br.readLine());
		for(int i=0;i<testCase;i++){
			st=new StringTokenizer(br.readLine());
			m=Integer.parseInt(st.nextToken());
			n=Integer.parseInt(st.nextToken());
			k=Integer.parseInt(st.nextToken());
			
			map=new int[n+1][m+1];
			visited=new int[n+1][m+1];
			cnt=0;
			for(int j=0;j<n;j++){
				Arrays.fill(map[j],0);
				Arrays.fill(visited[j],0);
			}
			for(int j=0;j<k;j++){
				st=new StringTokenizer(br.readLine());
				x=Integer.parseInt(st.nextToken());
				y=Integer.parseInt(st.nextToken());
				map[y][x]=1;
			}
			
			for(int j=0;j<n;j++){
				for(int t=0;t<m;t++){
					if(map[j][t]==1 && visited[j][t]==0){
						dfs(j,t);
						cnt++;
					}
				}
			}
		
			System.out.println(cnt);
		}
		
	}
}