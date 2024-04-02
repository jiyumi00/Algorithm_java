import java.util.Scanner;
import java.io.*;
import java.util.*;


public class Main{
	static int n,l,r;
	static int map[][];
	static int visited[][];
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	static int sum=0;
	static ArrayList<Pair> list=new ArrayList<>();
	
	public static class Pair{
		int y,x;
		Pair(int y,int x){
			this.y=y;
			this.x=x;
		}
	}
	public static void dfs(int y,int x){
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 || ny>=n || nx<0 || nx>=n) continue;
			
			if(visited[ny][nx]==0 && Math.abs(map[y][x] - map[ny][nx])>=l && Math.abs(map[y][x]- map[ny][nx])<=r ){
				visited[ny][nx]=1;
				list.add(new Pair(ny,nx));
				sum+=map[ny][nx];
				dfs(ny,nx);
			}
			
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		l=Integer.parseInt(st.nextToken());
		r=Integer.parseInt(st.nextToken());
		
		map=new int[n][n];
		visited=new int[n][n];
		
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++){
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		int cnt=0;
		
		while(true){
			boolean flag=false;
			//초기화
			for(int i=0;i<n;i++){
				Arrays.fill(visited[i],0);
			}
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(visited[i][j]==0){
						list.clear();
						visited[i][j]=1;
						list.add(new Pair(i,j));
						sum=map[i][j];
						dfs(i,j);
						if(list.size()==1) continue;
						for(Pair p :list){
							map[p.y][p.x]=sum/list.size();
							flag=true;
						}
					}
				}
			}
			if(flag==false) break;
			cnt++;
			
			
		}
		System.out.println(cnt);
    }
}