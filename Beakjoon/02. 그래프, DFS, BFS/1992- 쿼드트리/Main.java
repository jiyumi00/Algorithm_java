import java.util.*;
import java.io.*;
public class Main{
	static int map[][];
	static int n;
	static String str;

	static String quadTree(int y,int x,int size){
		//size가 1일때 
		if(size==1){ 
			return Integer.toString(map[y][x]);
		}
		int num=map[y][x]; //첫번 째 시작점
		str="";
		//0과 1 혼합
		for(int i=y;i<y+size;i++){
			for(int j=x;j<x+size;j++){
				if(num!=map[i][j]){
					str+="(";
					str+=quadTree(y,x,size/2);
					str+=quadTree(y,x+size/2,size/2);
					str+=quadTree(y+size/2,x,size/2);
					str+=quadTree(y+size/2,x+size/2,size/2);
					str+=")";
					return str;
				}
			}
		}
		//모두 0 또는 모두 1일때
		return Integer.toString(map[y][x]);
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		n=Integer.parseInt(br.readLine());
		
		map=new int[n][n];
		for(int i=0;i<n;i++){
			String s=br.readLine();
			for(int j=0;j<n;j++){
				map[i][j]=s.charAt(j)-'0';
			}
		}
		System.out.println(quadTree(0,0,n));
	}
}