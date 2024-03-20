import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Combination{
	
	static void print(int[]arr,int[]visited,int n){
		for(int i=0;i<n;i++){
			if(visited[i]==1){
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	static void combination(int[]arr,int[]visited,int start,int n,int r){
		if(r==0){
			print(arr,visited,n);
			return;
		}
		for(int i=start;i<n;i++){
			visited[i]=1;
			combination(arr,visited,i+1,n,r-1);
			visited[i]=0;
		}
	}
    public static void main(String[] args) throws IOException{
		int n=4;
		int[]arr={1,2,3,4};
		int [] visited=new int[n];
		
		System.out.println(n+"개 중에서 2개뽑기");
		combination(arr,visited,0,n,2);
    }
}

