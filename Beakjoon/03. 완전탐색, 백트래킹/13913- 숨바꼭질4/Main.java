import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static final int MAX=200000;
	static int visited[]=new int[MAX+4];
	static int prev[]=new int[MAX+4];
	static ArrayList<Integer> trace=new ArrayList<>();
	static int n,k;
	static void bfs(int here){
		visited[here]=1;
		Queue<Integer>queue=new LinkedList<>();
		queue.add(here);
		int cnt=0;
		int ret=0;
		while(!queue.isEmpty()){
			cnt++;
			int now=queue.poll();
			
			for(int next:new int[]{now-1,now+1,now*2}){
				if(next>=0 && next<=MAX){
					if(visited[next]==0){
						cnt++;                                                                                                           
						visited[next]=visited[now]+1;
						queue.add(next);
						prev[next]=now;
					}
				}
			}
		}
		for(int i=k;i!=n;i=prev[i]){
			trace.add(i);
		}
		trace.add(n);
		Collections.reverse(trace);
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		k=Integer.parseInt(st.nextToken());
		
		bfs(n);
		
		System.out.println(visited[k]-1);
		for(int item:trace){
			System.out.print(item+" ");
		}
		
	}
}