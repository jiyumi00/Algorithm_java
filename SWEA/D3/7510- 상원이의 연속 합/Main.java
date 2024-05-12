package project;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			int cnt=0;
			for(int i=1;i<=n;i++) {
				int sum=0;
				for(int j=i;j<=n;j++) {
					sum+=j;
					if(sum==n) {
						cnt++;
						break;
					}else if(sum>n) {
						break;
					}
				}
			}
			System.out.println("#"+test_case+" "+cnt);
		}
	}
	
}
