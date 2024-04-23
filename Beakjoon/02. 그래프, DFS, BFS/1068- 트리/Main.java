import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	static ArrayList<Integer>[] adjList;
	static int n,deleteNum;
	static int root=-1;
	static int dfs(int u){
		int ret=0;
		int child=0;

		for(int v:adjList[u]){
			if(v==deleteNum) continue;
			ret+=dfs(v);
			child++;
		}
		if(child==0) return 1;
		return ret;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n=Integer.parseInt(br.readLine());
		adjList=new ArrayList[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			adjList[i]=new ArrayList<>();
		}
		for(int i=0;i<n;i++){
			int num=Integer.parseInt(st.nextToken());
			if(num==-1){
				root=i;
			}
			else{
				adjList[num].add(i);
			}
		}
		deleteNum=Integer.parseInt(br.readLine());
		
		if(root==deleteNum){
			System.out.println(0);
			return;
		}
		System.out.println(dfs(root));
	}
}