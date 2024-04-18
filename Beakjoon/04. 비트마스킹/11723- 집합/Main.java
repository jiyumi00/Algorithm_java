import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		
		int x=0,n=20;
		int result=0;
		int m=Integer.parseInt(br.readLine());
		
		for(int i=0;i<m;i++){
			StringTokenizer st=new StringTokenizer(br.readLine());
			String operator=st.nextToken();
			if(!operator.equals("all") && !operator.equals("empty")){
				x=Integer.parseInt(st.nextToken());
			}
			switch(operator){
				case "add":
					result |=(1<<x); //x번째 비트 켜기
					break;
				case "remove":
					result &=~(1<<x);//x번째 비트 끄기
					break;
				case "check": 
					if((result&(1<<x))!=0) bw.write(1+"\n"); //x번째 비트 on
					else bw.write(0+"\n"); //x번째 비트 off
					break;
				case "toggle":
					result ^=(1<<x); //x번째 비트가 off이면 on, on이면 off
					break;
				case "all":
					result=(1<<n+1)-1; //1부터 20까지 모든 비트 껴기
					break;
				case "empty":
					result=0;
					break;
			}
		}
		bw.flush();
		bw.close();
		br.close();
    }
}

