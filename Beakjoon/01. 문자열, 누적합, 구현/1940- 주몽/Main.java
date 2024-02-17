import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n,m,cnt=0;
		int materials[];
		
		n=Integer.parseInt(br.readLine());
		m=Integer.parseInt(br.readLine());
		
		materials=new int[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			materials[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(materials[i]+materials[j]==m){
					cnt++;
				}
			}
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
		
		br.close();
		bw.close();
	}
}