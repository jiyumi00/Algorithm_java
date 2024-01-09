import java.util.Scanner;
import java.util.*;
public class FindWord_01{
	public static int solution(String word,char letter){
		int cnt=0;
		word=word.toUpperCase();
		letter=Character.toUpperCase(letter);
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==letter) cnt++;
		}
		return cnt;
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String word;
		char letter;
		
		word=scanner.next();
		letter=scanner.next().charAt(0);
	
		System.out.print(solution(word,letter));
	}
}