import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n;
		String str,temp="";
		ArrayList<String> list=new ArrayList<>();

		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			str=br.readLine();
			temp="";
			for(int j=0;j<str.length();j++){
				if(((int)str.charAt(j)>=97) && ((int)str.charAt(j)<=122)){
					System.out.println("---문자----");
					if(temp!=""){
						list.add(temp);
					}
					temp="";
				}
				else{
					System.out.println("---숫자---");
					temp+=str.charAt(j);
					System.out.println("temp:"+temp);
				}
			}
			if(temp!=""){
				list.add(temp);
			}
		}
		
		System.out.println("ArrayList: ");
	
		for(String value:list){
			System.out.print(value+" ");
		}
		//string배열을 int로
		
	}
}