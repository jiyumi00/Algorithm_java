import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T=10,n;
		int map[][];
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			
			map=new int[n][n];
			for(int i=0;i<n;i++){
				for(int j=0;j<n;j++){
					map[i][j]=sc.nextInt();
				}
			}
			int cnt=0;
			for(int i=0;i<n;i++){
				boolean one=false;
				for(int j=0;j<n;j++){
					if(one==true && map[j][i]==2){
						cnt++;
						one=false;
					}
					else if(map[j][i]==1) one=true;

				}
			}
			System.out.println("#"+test_case+" "+cnt);
		}
    }
}

