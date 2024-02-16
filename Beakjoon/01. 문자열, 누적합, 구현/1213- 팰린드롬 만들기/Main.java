import java.util.*;
public class Main{
	
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String str,result="",reverseResult;
		int oddCnt=0;
		String odd="";
		int alpha[]=new int[26];
		
		str=scanner.next();
		for(int i=0;i<str.length();i++){
			alpha[(int)str.charAt(i)-65]++;
		}
		for(int i=0;i<alpha.length;i++){
			//홀수가 1개 거나 홀수 0개
			if(alpha[i]%2!=0){
				oddCnt++;
			}
		}
		if(oddCnt==0 || oddCnt==1){
			for(int i=0;i<alpha.length;i++){
				for(int j=0;j<alpha[i]/2;j++){
					result+=(char)(i+65);
				}
				if(alpha[i]%2!=0){
					odd+=(char)(i+65);
				}
			}
			//문자열 뒤집기
			StringBuffer sb=new StringBuffer(result);
			reverseResult=sb.reverse().toString();
			//홀수+뒤집은문자열
			result+=odd+reverseResult;
		
			System.out.println(result);
		}
		else{
			System.out.println("I'm Sorry Hansoo");
		}
	}
}