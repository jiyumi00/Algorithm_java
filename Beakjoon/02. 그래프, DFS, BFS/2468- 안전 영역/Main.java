import java.util.*;
import java.io.*;

public class Main{
	static int map[][];
	static int visited[][];
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	static int ret=0,maxRet=0;
	static int n,input,maxInput=0;
	
	static void dfs(int y,int x,int t){
		visited[y][x]=1;
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 || ny>=n || nx<0 || nx>=n) continue;
			if(map[ny][nx]>t && visited[ny][nx]==0){
				dfs(ny,nx,t);
			}
		}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		n=Integer.parseInt(br.readLine());
		map=new int[n+1][n+1];
		visited=new int[n+1][n+1];
		
		for(int i=0;i<n;i++){
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++){
				int input=Integer.parseInt(st.nextToken());
				map[i][j]=input;
				if(input>maxInput){
					maxInput=input;
				}
			}
		}
		//아무것도 안잠겼을 때 -> 0초과 -> 모두 1
		for(int t=0;t<=maxInput;t++){
			ret=0;
			for(int i=0;i<n;i++){
				Arrays.fill(visited[i],0);
			}
			for (int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					if(map[i][j]>t && visited[i][j]==0){
						dfs(i,j,t);
						ret++;
					}
				}
			}
			if(ret>maxRet){
				maxRet=ret;
			}
		}
		System.out.println(maxRet);
	}
}