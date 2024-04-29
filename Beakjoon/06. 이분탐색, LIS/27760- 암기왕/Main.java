import java.util.*;
import java.io.*;

public class Main{
	
	static int n,m;
	static int nList[],mList[];
	static int search(int num){
		int l=0; int r=n-1;
		int check=0;
		
		while(l<=r){
			int mid=(l+r)/2;
			if(nList[mid]==num){
				check=1;
				return check;
			}else if(nList[mid]>num){
				r=mid-1;
			}else{
				l=mid+1;
			}
		}
		return check;
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T;
		
		T=Integer.parseInt(br.readLine());
		
	
		for(int test_case=0;test_case<T;test_case++){
			//입력
			n=Integer.parseInt(br.readLine());
			nList=new int[n];
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<n;i++){
				nList[i]=Integer.parseInt(st.nextToken());
			}
			
			m=Integer.parseInt(br.readLine());
			mList=new int[m];
			st=new StringTokenizer(br.readLine());
			for(int i=0;i<m;i++){
				mList[i]=Integer.parseInt(st.nextToken());
			}
			
			//정렬
			Arrays.sort(nList);
			
			//이분탐색
			for(int i=0;i<m;i++){
				bw.write(Integer.toString(search(mList[i])));
				bw.write('\n');
			}
			bw.flush();
		}
		
		
	}
	
}