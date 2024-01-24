import java.util.*;
public class Main{

	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int n;
		String pattern,str;
		String []splitPattern;
		
		n=scanner.nextInt();
		pattern=scanner.next();
		
		splitPattern=pattern.split("\\*");
		for(int i=0;i<n;i++){
			str=scanner.next();
			
			if(splitPattern[0].length()+splitPattern[1].length() > str.length()){
				System.out.println("NE");
				continue;
			}
			String front=str.substring(0,splitPattern[0].length());
			String back=str.substring(str.length()-splitPattern[1].length(),str.length());
			
			if(front.equals(splitPattern[0]) && back.equals(splitPattern[1])){
				System.out.println("DA");
			}
			else{
				System.out.println("NE");
			}
		} 
	}
}