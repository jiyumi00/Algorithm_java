package project;

import java.util.*;
import java.io.*;

public class Main {
	
	static int cnt;
	static boolean check(int[]result) {
		for(int i=0;i<result.length;i++) {
			for(int j=i+1;j<result.length;j++) {
				if(Math.abs(i-j)==Math.abs(result[i]-result[j])) {
					return false;
				}
			}
		}
		return true;
	}
	static void permutation(int[]a,boolean[]visited,int[]output,int depth,int n,int r) {
		if(depth==r) {
			int[]result=new int[n];
			for(int i=0;i<n;i++) {
				result[i]=output[i];
			}
			
			if(check(result)) {
				cnt++;
			}
	
		}
		
		for(int i=0;i<n;i++) {
			if(visited[i]==false) {
				visited[i]=true;
				output[depth]=a[i];
				permutation(a,visited,output,depth+1,n,r);
				visited[i]=false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			cnt=0;
			int a[]=new int[n];
			for(int i=0;i<n;i++) {
				a[i]=i+1;
			}
			boolean visited[]=new boolean[n];
			int output[]=new int[n];
			int r=n;
			
			
			permutation(a,visited,output,0,n,r);
			
			System.out.println("#"+test_case+" "+cnt);
		}
	}
}
