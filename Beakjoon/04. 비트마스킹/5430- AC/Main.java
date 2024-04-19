import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t;
		t=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++){ 
			Deque<Integer> deque=new ArrayDeque<>();
			String p=br.readLine();
			int n=Integer.parseInt(br.readLine());
			String array=br.readLine();
			
			int x=0;
			for(int j=0;j<array.length();j++){
				char aChar=array.charAt(j);
				if(aChar=='[' || aChar==']') continue;
				if(aChar==','){
					deque.add(x);
					x=0;
				}
				else{
					x=x*10+(aChar-'0'); //숫자일때 이전값*10+현재값
				}
			}
			if(x>0) deque.add(x);
			
			boolean reversed=false,error=false;
			for(char pChar: p.toCharArray()){
				if(pChar=='R'){ //R일때
					reversed=!reversed;
				}
				else{ //D일때
					if(deque.isEmpty()){
						error=true;
						break;
					}
					if(reversed){
						deque.pollLast();
					}
					else deque.pollFirst();
				}
			}
			
			//출력
			if(error)System.out.println("error");
			else{
				StringBuilder sb=new StringBuilder();
				
				if(reversed){
					while(!deque.isEmpty()){
						sb.append(deque.pollLast()).append(",");
					}
				}else{
					while(!deque.isEmpty()){
						sb.append(deque.pollFirst()).append(",");
					}
				}

				if(sb.length()>0){ 
					sb.setLength(sb.length()-1); //마지막 ,제거
				}
				System.out.println("["+sb.toString()+"]");
			}
		} 
    }
}

