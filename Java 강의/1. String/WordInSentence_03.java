import java.util.Scanner;
public class WordInSentence_03{
	public String solution(String sentence){
		String maxWord="";
		int max=0;
		
		String [] word=sentence.split(" ");
		for(int i=0;i<word.length;i++){
			if(max<word[i].length()){
				max=word[i].length();
				maxWord=word[i];
			}
		}
		return maxWord;
	}
	public static void main(String[]args){
		WordInSentence_03 ws=new WordInSentence_03();
		Scanner scanner=new Scanner(System.in);
		String sentence;
		
		sentence=scanner.nextLine();
		System.out.print(ws.solution(sentence));
	}
}