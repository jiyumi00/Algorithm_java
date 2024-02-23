import java.util.*;
import java.io.*;

public class Main{
	static StringTokenizer st;
	static int map[][];
	static int visited[][];
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	static int m,n;
	static int cnt=0;
	
	static void dfs(int y,int x){
		visited[y][x]=1;
		cnt++;
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 || ny >=m || nx<0 || nx>=n) continue;
			if(visited[ny][nx]==0 && map[ny][nx]==1){
				dfs(ny,nx);
			}
		}
		
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int k;
		int x1,y1,x2,y2;
		int ret=0;
		ArrayList<Integer> cnts=new ArrayList<>();
		
		st=new StringTokenizer(br.readLine());
		m=Integer.parseInt(st.nextToken());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		map=new int[m+1][n+1];
		visited=new int[m+1][n+1];
		
		for(int i=0;i<m;i++){
			Arrays.fill(map[i],1);
		}
	
		for(int t=0;t<k;t++){
			st=new StringTokenizer(br.readLine());
			x1=Integer.parseInt(st.nextToken());
			y1=Integer.parseInt(st.nextToken());
			x2=Integer.parseInt(st.nextToken());
			y2=Integer.parseInt(st.nextToken());
			
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(j>=x1 && j<=x2-1 &&i>=y1 &&i<=y2-1){
						map[i][j]=0;
					}
				}
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(map[i][j]==1 && visited[i][j]==0){
					dfs(i,j);
					ret++;
					cnts.add(cnt);
					cnt=0;
					
				}
			}
		}
		
		System.out.println(ret);
		Collections.sort(cnts);
		for(int value:cnts){
			System.out.print(value+" ");
		}
	}
}