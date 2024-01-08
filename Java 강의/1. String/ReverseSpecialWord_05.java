import java.util.Scanner;
import java.util.ArrayList;

public class ReverseSpecialWord_05{
	public static boolean isAlphabet(String word,int i){
		if(((int)word.charAt(i)>=65 && (int)word.charAt(i)<=90) || ((int)word.charAt(i)>=97 && (int)word.charAt(i)<=122)){
			return true;
		}
		return false;
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String word;
		ArrayList <Character>alpaWord=new ArrayList<>();
		int wordLength;
		
		word=scanner.next();
		wordLength=word.length();
		
		for(int i=0;i<wordLength;i++){
			if(isAlphabet(word,i)){
				alpaWord.add(word.charAt(i));
			}
		}
		int alpaWordLength=alpaWord.size();
		for(int i=0;i<wordLength;i++){
			if(isAlphabet(word,i)){
				System.out.print(alpaWord.get(alpaWordLength-1));
				alpaWordLength--;
			}
			else{
				System.out.print(word.charAt(i));
			}
		}
	}
}