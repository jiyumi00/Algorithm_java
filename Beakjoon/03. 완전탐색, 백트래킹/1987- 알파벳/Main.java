import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static int r,c,ret=0;
	static char [][]map;
	static int []visited=new int[30];
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	
	static void dfs(int y,int x,int cnt){
		ret=Math.max(ret,cnt);
		//System.out.println("("+y+","+x+"), "+map[y][x]+", cnt: "+cnt);
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			if(ny<0 || ny>=r || nx<0 || nx>=c) continue;
			int next=(int)map[ny][nx]-'A';
			if(visited[next]==0){
				visited[next]=1;
				dfs(ny,nx,cnt+1);
				visited[next]=0;
			}
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st=new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		
		map=new char[r][c];
		for(int i=0;i<r;i++){
			String input=br.readLine();
			for(int j=0;j<c;j++){
				map[i][j]=input.charAt(j);
			}
		}
		visited[(int)map[0][0]-'A']=1; //visited[2]=1 
		dfs(0,0,1); //dfs(y,x,cnt)
		System.out.println(ret);
	}
}