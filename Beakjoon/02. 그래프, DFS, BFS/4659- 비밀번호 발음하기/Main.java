import java.util.*;
import java.io.*;

public class Main{
	static String str;
	static int lcnt,vcnt;
	
	public static boolean isVowel(char ch){
		return ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u';
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			str=br.readLine();
			if(str.equals("end")) break;
			
			lcnt=0;
			vcnt=0;
			boolean result=true;
			boolean vowelCheck=false;
			char prev=' ';
			
			for(int i=0;i<str.length();i++){
				char indexChar=str.charAt(i);
				if(isVowel(indexChar)){
					lcnt++;
					vcnt=0;
					vowelCheck=true;
				}
				else{
					lcnt=0;
					vcnt++;
				}
				
				//연속된 모음 3개 or 자음 3개
				if(vcnt==3 || lcnt==3) result=false;
				if(i>=1 && (prev==indexChar)&&(indexChar!='e' && indexChar!='o')){
					result=false;
				}
				prev=indexChar;
			}
			
			//모음 포함x
			if(vowelCheck==false) result=false;
			
			if(result){
				System.out.println("<"+str+"> is acceptable.");
			}
			else{
				System.out.println("<"+str+"> is not acceptable.");
			}
		}
	}
}