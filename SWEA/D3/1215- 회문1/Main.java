import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n,T=10;
		char map[][]=new char[8][8];
		String s;
		
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			for(int i=0;i<8;i++){
				s=sc.next();
				for(int j=0;j<8;j++){
					map[i][j]=s.charAt(j);
				}
			}
			
			int cnt=0;
			for(int i=0;i<8;i++){
				for(int k=0;k<8-n+1;k++){
					StringBuilder sb=new StringBuilder();
					for(int j=k;j<k+n;j++){
						sb.append(map[i][j]);
					}
					if(sb.toString().equals(sb.reverse().toString())){
						cnt++;
					}
				}
			}
			for(int i=0;i<8;i++){
				for(int k=0;k<8-n+1;k++){
					StringBuilder sb=new StringBuilder();
					for(int j=k;j<k+n;j++){
						sb.append(map[j][i]);
					}
					if(sb.toString().equals(sb.reverse().toString())){
						cnt++;
					}
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
    }
}

