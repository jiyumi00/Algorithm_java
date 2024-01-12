import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		String str,numStr;
		int num;
		
		str=scanner.next();
		
		numStr=str.replaceAll("[^0-9]","");
		num=Integer.parseInt(numStr);
		System.out.println(num);
	}
}