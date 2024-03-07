import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	
	static int ret=0;
	static int result=0,maxResult=0;
	static int wallCnt=0;
	static int visited[][];
	static int map[][];
	static int n,m;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	public static class Pair{
		int x,y;
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	static void dfs(int y,int x){
		visited[y][x]=1;
		ret++; 
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			
			if(ny<0 ||ny>=n || nx<0 || nx>=m) continue;
			if(visited[ny][nx]==0 &&map[ny][nx]==0){
				dfs(ny,nx);
			}
		}
	}
	
	public static void search(){
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(visited[i][j]==0 && map[i][j]==2){
					dfs(i,j);
				}
			}
		}
		result=n*m-(wallCnt+3)-ret;
		if(result>maxResult){
			maxResult=result;
		}
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<Pair> list=new ArrayList<>();
	
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n][m];
		visited=new int[n][m];
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<m;j++){
				map[i][j]=Integer.parseInt(st.nextToken());
			}
		}
		//벽세우기 (모든경우의수)
		//바이러스 퍼뜨리기
		//안전영역 개수 구하기
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(map[i][j]==0){
					list.add(new Pair(i,j));
				}
				if(map[i][j]==1){
					wallCnt++;
				}
			}
		}

		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				for(int k=j+1;k<list.size();k++){
					ret=0;
					result=0;
					map[list.get(i).x][list.get(i).y]=1;
					map[list.get(j).x][list.get(j).y]=1;
					map[list.get(k).x][list.get(k).y]=1;
					//dfs
					search();
					
					//원복,visited 초기화
					map[list.get(i).x][list.get(i).y]=0;
					map[list.get(j).x][list.get(j).y]=0;
					map[list.get(k).x][list.get(k).y]=0;
					
					for(int t=0;t<n;t++){
						Arrays.fill(visited[t],0);
					}
				}
			}
		}
		System.out.println(maxResult);
	}
}