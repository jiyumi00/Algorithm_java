import java.util.*;
class Main{
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
		Main ws=new Main();
		Scanner scanner=new Scanner(System.in);
		String sentence;
		
		sentence=scanner.nextLine();
		System.out.print(ws.solution(sentence));
	}
}