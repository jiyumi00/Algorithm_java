import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args) throws IOException{
		Scanner scanner=new Scanner(System.in);
		int i=0,cnt=0,n;
		String str;
		
		n=scanner.nextInt();
		while(true){
			i++;
			str=Integer.toString(i);
			if(str.contains("666")){
				cnt++;
			}
			if(cnt==n){
				break;
			}
		}
		System.out.println(str);
	}
}