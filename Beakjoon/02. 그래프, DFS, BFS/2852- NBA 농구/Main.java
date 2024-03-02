import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n,teamNum,minute,second,teamTime;
		String teamTime;
		
		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			String input=br.readLine();
			st=new StringTokenizer(input);
			teamNum=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(st.nextToken(),":");
			minute=Integer.parseInt(st.nextToken());
			second=Integer.parseInt(st.nextToken());
			
			teamTime=minute*60+second;
		}
	}
}