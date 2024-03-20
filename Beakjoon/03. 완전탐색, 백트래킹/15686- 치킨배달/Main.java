import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static int n,m;
	static int map[][];
	static int cnt=0,minCnt=1000000;
	static ArrayList<Pair> list=new ArrayList<>();
	static ArrayList<Pair> selectList=new ArrayList<>();
	static int visited[];
	
	public static class Pair{
		int x,y;
		Pair(int x,int y){
			this.x=x;
			this.y=y;
		}
	}
	static void caculation(){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				if(map[i][j]==1){
					int minDistance=1000000;
					for(int k=0;k<selectList.size();k++){
						int distance= Math.abs(selectList.get(k).x-i)+Math.abs(selectList.get(k).y-j);
						if(minDistance>distance){
							minDistance=distance;
						}
					}
					cnt+=minDistance;
				}
				//원복
				if(map[i][j]==2){
					map[i][j]=0;
				}
			}
		}
	}
	static void combination(ArrayList<Pair> list,int[] visited,int start,int size,int r){
		if(r==0){
			for(int i=0;i<size;i++){
				if(visited[i]==1){
					map[list.get(i).x][list.get(i).y]=2;
					selectList.add(new Pair(list.get(i).x,list.get(i).y));
				}
			}
			//치킨거리구하기
			caculation();
			if(minCnt>cnt){
				minCnt=cnt;
			}
			//값 초기화
			selectList.clear();
			cnt=0;
			return;
		}
		for(int i=start;i<size;i++){
			visited[i]=1;
			combination(list,visited,i+1,size,r-1);
			visited[i]=0;
		}
	}
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		map=new int[n+1][n+1];
		visited=new int[n*n];
		
		
		for(int i=1;i<=n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=1;j<=n;j++){
				map[i][j]=Integer.parseInt(st.nextToken());
				if(map[i][j]==2){
					list.add(new Pair(i,j));
					map[i][j]=0;
				}
			}
		}
		//list중 m개 뽑기
		combination(list,visited,0,list.size(),m);
		System.out.println(minCnt);
		
    }
}

