import java.util.*;
import java.io.*;
public class Main{
	static int n,l,ret;
	static int map1[][];
	static int map2[][];
	static void go(int[][]map){
		for(int i=0;i<n;i++){
			int cnt=1;
			int j;
			for(j=0;j<n-1;j++){
				if(map[i][j]==map[i][j+1]){
					cnt++;
				}
				else if(map[i][j]+1==map[i][j+1] && cnt>=l){
					cnt=1;
				}
				else if(map[i][j]-1==map[i][j+1] && cnt>=0){
					cnt=-l+1;
				}else{
					break;
				}
			}
			if(j==n-1 && cnt>=0){
				ret++;
			}
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st=new StringTokenizer(br.readLine());
		
		n=Integer.parseInt(st.nextToken());
		l=Integer.parseInt(st.nextToken());
		map1=new int[n][n];
		map2=new int[n][n];
		
		for(int i=0;i<n;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<n;j++){
				map1[i][j]=Integer.parseInt(st.nextToken());
				map2[j][i]=map1[i][j];
			}
		}
		go(map1);
		go(map2);
		System.out.println(ret);
    }
}

