import java.util.*;
import java.io.*;
public class Main{
	public static long c;
	public static void main(String[]args)throws IOException{
		long a,b;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		a=Long.parseLong(st.nextToken());
		b=Long.parseLong(st.nextToken());
		c=Long.parseLong(st.nextToken());
		
		System.out.println(pow(a,b));
	}
	
	public static long pow(long a,long b){
		if(b==1){//지수가 1이면
			return a%c; 
		}			
		long ret=pow(a,b/2); //지수법칙 적용
		
		//모듈러 법칙 적용
		if(b%2==1) return (ret*ret%c)*a%c; //지수가 홀수라면 a를 더 곱해준다
		return (ret*ret)%c; 
	}
}