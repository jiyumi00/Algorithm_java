import java.util.Scanner;
public class ReverseWord_04{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int n,wordLength;
		String word;
		
		n=scanner.nextInt();
		for(int i=0;i<n;i++){
			word=scanner.next();
			wordLength=word.length();
			for(int j=0;j<wordLength;j++){
				System.out.print(word.charAt(wordLength-1-j));
			}
			System.out.println();
		}
	}
}