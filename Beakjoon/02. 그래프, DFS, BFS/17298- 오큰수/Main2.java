import java.util.*;
import java.io.*;
import java.math.*;

public class Main2{
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n;
		int nges[];
		int ret[];
		Stack<Integer> stack=new Stack<>();
		
		n=Integer.parseInt(br.readLine());
		
		nges=new int[n];
		ret=new int[n];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			ret[i]=-1;
		}
		for(int i=0;i<n;i++){
			nges[i]=Integer.parseInt(st.nextToken());
			
			while(!stack.isEmpty() && nges[stack.peek()]<nges[i]){
				ret[stack.pop()]=nges[i];
			}
			stack.push(i);
		}
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<n;i++){
			sb.append(ret[i]).append(' ');
		}
		
		System.out.println(sb);
	}
}