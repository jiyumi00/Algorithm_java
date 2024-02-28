import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
	
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		String str,temp="";
		ArrayList<BigInteger> list=new ArrayList<>();

		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			str=br.readLine();
			temp="";
			for(int j=0;j<str.length();j++){
				if(((int)str.charAt(j)>=97) && ((int)str.charAt(j)<=122)){
					if(temp!=""){
						list.add(new BigInteger(temp)); 
						//Integer.parseInt 런타임 에러 (숫자 100자리 정수로 표현 불가)
					}
					temp="";
				}
				else{
					temp+=str.charAt(j);
				}
			}
			if(temp!=""){
				list.add(new BigInteger(temp));
			}
		}
		
		Collections.sort(list);
		for(BigInteger value:list){
			System.out.println(value);
		}
		
		
	}
}