import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int []a=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=scanner.nextInt();
		}
		int x=scanner.nextInt();
		
		Arrays.sort(a);
		
		int l=0, r=n-1;
		int ret=0;
		
		while(l<r){
			if(a[l]+a[r]==x){
				ret++;
				l++;
				r--;
			}
			else if(a[l]+a[r]>x){
				r--;
			}else if(a[l]+a[r]<x){
				l++;
			}
		}
		System.out.println(ret);
		scanner.close();
	}
}
