import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n,max=0;
		int nges[];
		boolean isBigNum=false;
		n=Integer.parseInt(br.readLine());
		
		nges=new int[n+1];
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			nges[i]=Integer.parseInt(st.nextToken());
			if(max<nges[i]){
				max=nges[i];
			}
		}
		
	
		for(int i=0;i<n;i++){
			isBigNum=false;
			if(max==nges[i] || i==n-1){
				System.out.print(-1+" ");
				continue;
			}
			for(int j=i+1;j<n;j++){
				if(nges[i]<nges[j]){
					System.out.print(nges[j]+" ");
					isBigNum=true;
					break;
				}
			}
			if(isBigNum==false){
				System.out.print(-1+" ");
			}
		}
	}
}