import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		String str,reverseStr;
		Scanner scanner=new Scanner(System.in);
		
		str=scanner.next();
		str=str.toLowerCase();
		
		StringBuffer sb=new StringBuffer(str);
		reverseStr=sb.reverse().toString();
		
		if(str.equals(reverseStr)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}