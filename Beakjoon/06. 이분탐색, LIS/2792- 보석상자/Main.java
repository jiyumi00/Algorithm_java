import java.util.*;
import java.io.*;

public class Main{
	static long n,m;
	static long []a;
	static long ret=Long.MAX_VALUE;
	static boolean check(long mid){
		long num=0;
		for(int i=0;i<m;i++){
			num+=a[i]/mid;
			if(a[i]%mid!=0) num++;
		}
		return n>=num;
	}
	public static void main(String[]args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextLong();
		m=sc.nextLong();
		a=new long[(int)m];
		
		long l=1,r=0,mid;
		for(int i=0;i<m;i++){
			a[i]=sc.nextLong();
			r=Math.max(r,a[i]);
		}
		
		while(l<=r){
			mid=(l+r)/2;
			if(check(mid)){
				ret=Math.min(ret,mid);
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
		System.out.println(ret);
		
	}
	
}