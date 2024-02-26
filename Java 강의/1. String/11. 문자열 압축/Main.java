import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		String str;
		
		int []alpa=new int[26];
		int index;
		char tmp=' ';
		str=scanner.next();
		
		for(int i=0;i<str.length();i++){
			index=(int)str.charAt(i)-65;
			alpa[index]++;
			
			
		}
		
	}
}