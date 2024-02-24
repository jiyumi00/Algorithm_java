import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int m,n,j,cnt=0;
		int l=1,r,originL;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		m=Integer.parseInt(st.nextToken());
		
		j=Integer.parseInt(br.readLine());
		
		for(int i=0;i<j;i++){
			r=l+(m-1);
			int appleLocation=Integer.parseInt(br.readLine());
			if(l<=appleLocation && r>=appleLocation){
				continue;
			}
			else{
				if(r<appleLocation){
					originL=l;
					l=appleLocation-(m-1); 
					cnt=cnt+(l-originL); 
				}
				else{
					originL=l;
					l=appleLocation;
					cnt=cnt+(originL-l);
				}
			}
		}
		System.out.println(cnt);
	}
}