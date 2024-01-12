import java.util.Scanner;
public class Main{
	
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String word,reverseWord,newWord="";
		
		word=scanner.nextLine();
		word=word.toLowerCase();
		
		for(int i=0;i<word.length();i++){
			if((int)word.charAt(i)>=97 &&(int)word.charAt(i)<=122){
				newWord+=word.charAt(i);
			}
		}
		StringBuffer sb=new StringBuffer(newWord);
		reverseWord=sb.reverse().toString();
		
		if(reverseWord.equals(newWord)){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}