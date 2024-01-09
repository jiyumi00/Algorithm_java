import java.util.*;
class WordInSentence_03{
	public String solution(String sentence){
		String maxWord="";
		int max=0;
		String[] word=sentence.split(" ");
		for(String str:word){
			if(max<str.length()){
				max=str.length();
				maxWord=str;
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