import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		String str,reversedStr;
		str=scanner.next();
		
		StringBuffer sb=new StringBuffer(str);
		reversedStr =sb.reverse().toString();
		
		if(str.equals(reversedStr)){
			System.out.println(1);
		}
		else{
			System.out.println(0);
		}
	}
}