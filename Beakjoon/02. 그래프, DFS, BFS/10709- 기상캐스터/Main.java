import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int h,w,cnt=0;
		char map[][];
		boolean check=false;
		
		st=new StringTokenizer(br.readLine());
		h=Integer.parseInt(st.nextToken());
		w=Integer.parseInt(st.nextToken());
		
		map=new char[h][w];
		for(int i=0;i<h;i++){
			check=false;
			cnt=0;
			String input=br.readLine();
			for(int j=0;j<w;j++){
				if(input.charAt(j)=='c'){
					check=true;
					cnt=0;
					System.out.print(0+" ");
				}
				else{
					if(check==true){
						cnt++;
						System.out.print(cnt+" ");
					}
					else{
						System.out.print(-1+" ");
					}
				}
				
			}
			System.out.println();
		}
		
		
	}
}