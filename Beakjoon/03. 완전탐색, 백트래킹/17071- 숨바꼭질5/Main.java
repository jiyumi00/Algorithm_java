import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static final int MAX=500000;
	static int[][] visited=new int[2][MAX+4];
	static boolean check=false;
	static int n,k;
	static int turn;

	static void bfs(int here){
		visited[0][here]=1;
		Queue<Integer> queue=new LinkedList<>();
		queue.add(here);

		turn=1;
		while(!queue.isEmpty()){
			k+=turn;
			if(k>MAX) break;
			
			if(visited[turn%2][k]>0){//홀수면 visited[1][k] 짝수면 visited[0][k]
				check=true;
				break;
			}
			int qSize=queue.size();
			for(int i=0;i<qSize;i++){
				int now=queue.poll();
				for(int next:new int[]{now-1, now+1, 2*now}){
					if(next<0 || next>MAX || visited[turn%2][next]>0) continue;
					visited[turn%2][next]=visited[(turn+1)%2][now]+1;
					if(next==k){
						check=true;
						break;
					}
					queue.add(next);
				}
				if(check) break;
			}
			if(check) break;
			turn++;
		}
		
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		if(n==k){
			System.out.println(0);
			return;
		}
		bfs(n);
		
		if(check){
			System.out.println(turn);
		}
		else{
			System.out.println(-1);
		}
	}
}