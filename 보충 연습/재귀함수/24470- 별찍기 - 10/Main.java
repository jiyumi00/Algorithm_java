import java.util.*;
import java.io.*;
public class Main{
	static char[][]map;
	static void go(int n,int x,int y){
		if(n==1) return;
		int index=n/3;
		
		for(int i=x+index;i<x+2*index;i++){
			for(int j=y+index;j<y+2*index;j++){
				map[i][j]=' ';
			}
		}
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i==1&&j==1) continue;
				go(index,x+i*index,y+j*index);
			}
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		int n;
		n=Integer.parseInt(br.readLine());
		
		map=new char[n][n];
		
		for(int i=0;i<n;i++){
			Arrays.fill(map[i],'*');
		}
		go(n,0,0);
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				bw.write(map[i][j]);
			}
			bw.write("\n");
		}
		bw.flush();
    }
}

