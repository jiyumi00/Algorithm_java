package project;

import java.util.*;
import java.io.*;


public class Main {
	static int n=9;
	static int aScore,bScore,aTotalScore,bTotalScore;
	static int aCard[]=new int[n];
	static void permutation(int []bCard,boolean[]visited,int[]output,int depth,int n,int r) {
		
		if(depth==r) {
			aScore=0;
			bScore=0;
			for(int i=0;i<n;i++) {
				if(aCard[i]>output[i]) {
					aScore+=aCard[i]+output[i];
				}
				else {
					bScore+=aCard[i]+output[i];
				}
			}
			if(aScore>bScore) {
				aTotalScore++;
			}else if(bScore>aScore) {
				bTotalScore++;
			}
			return;
		}
		for(int i=0;i<n;i++) {
			if(visited[i]!=true) {
				visited[i]=true;
				output[depth]=bCard[i];
				permutation(bCard,visited,output,depth+1,n,r);
				visited[i]=false;
			}
		}                            
	}
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int T;
		int r=9;
		
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int bCard[]=new int[n];
			int output[]=new int[n];
			boolean visited[]=new boolean[n];
			boolean check[]=new boolean[n*2+1];
			aTotalScore=0; bTotalScore=0;
			
			for(int i=0;i<n;i++) {
				aCard[i]=sc.nextInt();
				check[aCard[i]]=true;
			}
			
			int idx=0;
			for(int i=1;i<=n*2;i++) {
				if(check[i]==false) {
					bCard[idx]=i;
					idx++;
				}
			}
			
			
			permutation(bCard,visited,output,0,n,r);
			
			System.out.println("#"+test_case+" "+aTotalScore+" "+bTotalScore);
		}
	}
	
}
