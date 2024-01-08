import java.util.Scanner;
public class CaseConversion_02{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String word;
		String newWord="";
		
		word=scanner.next();	
		for(int i=0;i<word.length();i++){
			if((int)word.charAt(i)>=97 &&(int)word.charAt(i)<=122 ){ 
				newWord+=(char)((int)(word.charAt(i))-32);
			}
			else{
				newWord+=(char)((int)(word.charAt(i))+32);
			}
		}
		System.out.print(newWord);
	}
}