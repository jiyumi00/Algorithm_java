import java.util.*;
public class Main{
	
	public static char encryption(int ch){
		if((ch>=97 && ch<=109)||(ch>=65 && ch<=77) ){
			return (char)(ch+13);
		}
		else if((ch>=110 && ch<=122)||(ch>=78 && ch<=90)){
			return (char)(ch+13-26);
		}
		else{
			return (char)ch;
		}
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String str;
		
		str=scanner.nextLine();
		for(int i=0;i<str.length();i++){
			System.out.print(encryption((int)str.charAt(i)));
		}
	}
}