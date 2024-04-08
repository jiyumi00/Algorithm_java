import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static int n;
	static int scv[]=new int[3];
	static int visited[][][]=new int[64][64][64];
	static Queue<Pair> queue=new LinkedList<>();
	static int [][] dn={
		{9,3,1},
		{9,1,3},
		{3,1,9},
		{3,9,1},
		{1,3,9},
		{1,9,3}
	};
	static class Pair{
		int a,b,c;
		Pair(int a,int b,int c){
			this.a=a;
			this.b=b;
			this.c=c;
		}
	}
	static int solve(int a,int b,int c){
		visited[a][b][c]=1;
		queue.add(new Pair(a,b,c));
		
		while(!queue.isEmpty()){
			Pair front=queue.poll();
			if(visited[0][0][0]!=0) break;
			for(int i=0;i<6;i++){
				int na=Math.max(0,front.a-dn[i][0]);
				int nb=Math.max(0,front.b-dn[i][1]);
				int nc=Math.max(0,front.c-dn[i][2]);
				
				if(visited[na][nb][nc]!=0) continue;
				visited[na][nb][nc]=visited[front.a][front.b][front.c]+1;
				queue.add(new Pair(na,nb,nc));
			}
		}
		return visited[0][0][0]-1;
	} 

    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		String[] input=br.readLine().split(" ");
		for(int i=0;i<n;i++){
			scv[i]=Integer.parseInt(input[i]);
		}
		
		System.out.println(solve(scv[0],scv[1],scv[2]));
	}
}