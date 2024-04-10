import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static final int MAX=200000;
	static Queue<Integer> queue=new LinkedList<>();
	static int visited[]=new int[MAX+4];
	static int cnt[]=new int[MAX+4];
	
	static void bfs(int here){
		visited[here]=1;
		cnt[here]=1;
		queue.add(here);
		
		while(!queue.isEmpty()){
			int now=queue.poll();
			for(int next: new int[]{now-1,now+1,now*2}){
				if(0<=next && next<=MAX){
					if(visited[next]==0){
						queue.add(next);
						visited[next]=visited[now]+1;
						cnt[next]+=cnt[now];
					}
					else if(visited[next]==visited[now]+1){
						cnt[next]+=cnt[now];
					}
				}
			}
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n,k;
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		//반례
		if(n==k){
			System.out.println("0");
			System.out.println("1");
			return;
		}
		bfs(n);
		System.out.println(visited[k]-1);
		System.out.println(cnt[k]);
	}
}