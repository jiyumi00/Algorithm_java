import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static final int MAX=1501;
	static int r,c;
	static char [][]map;
	static boolean [][] visited;
	static boolean [][]visitedSwan;
	static int swanY,swanX,day,y,x;
	static Queue<int[]> waterQ=new LinkedList<>();
	static Queue<int[]> waterTempQ=new LinkedList<>();
	static Queue<int[]> swanQ=new LinkedList<>();
	static Queue<int[]> swanTempQ=new LinkedList<>();
	static int dy[]={0,1,0,-1};
	static int dx[]={1,0,-1,0};
	
	public static void waterMelting(){
		while(!waterQ.isEmpty()){
			int []now=waterQ.poll();
			y=now[0];
			x=now[1];
			for(int i=0;i<4;i++){
				int ny=y+dy[i];
				int nx=x+dx[i];
				if(ny<0 || ny>=r || nx<0 || nx>=c || visited[ny][nx]) continue;
				if(map[ny][nx]=='X'){
					visited[ny][nx]=true;
					waterTempQ.offer(new int[]{ny,nx});
					map[ny][nx]='.';
				}
			}
			
		}
	}
	public static boolean findSwan(){
		while(!swanQ.isEmpty()){
			int []now=swanQ.poll();
			y=now[0];
			x=now[1];
			for(int i=0;i<4;i++){
				int ny=y+dy[i];
				int nx=x+dx[i];
				if(ny<0 || ny>=r || nx<0 ||nx>=c || visitedSwan[ny][nx]==true) continue;
				visitedSwan[ny][nx]=true;
				if(map[ny][nx]=='.'){
					swanQ.offer(new int[]{ny,nx});
				}else if(map[ny][nx]=='X'){
					swanTempQ.offer(new int[]{ny,nx});
				}else if(map[ny][nx]=='L'){
					return true;
				}
			}
			
		}
		return false;
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		
		map=new char[MAX][MAX];
		visited=new boolean[MAX][MAX];
		visitedSwan=new boolean[MAX][MAX];
		
		for(int i=0;i<r;i++){
			String input=br.readLine();
			for(int j=0;j<c;j++){
				map[i][j]=input.charAt(j);
				if(map[i][j]=='L'){ //하나의 swan 좌표
					swanY=i;
					swanX=j;
				}
				if(map[i][j]=='.' || map[i][j]=='L'){
					visited[i][j]=true;
					waterQ.offer(new int[]{i,j}); 
				}
			}
		}
		swanQ.offer(new int[]{swanY,swanX});
		visitedSwan[swanY][swanX]=true;
		
		while(true){
			if(findSwan()==true) break;
			waterMelting();
			waterQ=new LinkedList<>(waterTempQ);
			swanQ=new LinkedList<>(swanTempQ);
			waterTempQ.clear();
			swanTempQ.clear();
			day++;
		}		
		System.out.println(day);
	}
}