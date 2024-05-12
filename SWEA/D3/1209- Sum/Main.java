package project;

import java.util.*;
import java.io.*;


public class Main {
	
	static int max=0;
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		int T=10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int testNum=sc.nextInt();
			int n=100;
			int map[][]=new int[n][n];
			int max=0;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					map[i][j]=sc.nextInt();
				}
			}
			int rightLine=0;
			int leftLine=0;
			for(int i=0;i<n;i++) {
				int columSum=0;
				int rowSum=0;
	
				for(int j=0;j<n;j++) {
					//행
					columSum+=map[i][j];
					rowSum+=map[j][i];
					
				}
				
				max=Math.max(max, Math.max(columSum, rowSum));
				rightLine+=map[i][i];
				leftLine+=map[i][n-1-i];
			}
			max=Math.max(max, Math.max(rightLine, leftLine));
			System.out.println("#"+test_case+" "+max);
		}
	}
	
}
