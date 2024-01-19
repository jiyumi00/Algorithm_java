import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int []alpha=new int[26];
		String s;
		s=scanner.next();
		
		for(int i=0;i<s.length();i++){
			alpha[(int)s.charAt(i)-97]++;
		}
		for(int i=0;i<alpha.length;i++){
			System.out.print(alpha[i]+" ");
		}
	}
}