import java.util.Scanner;
public class FindWord_01{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String word,str;
		char letter;
		int cnt=0;
		
		word=scanner.next();
		str=scanner.next();
		letter=str.charAt(0);
		
		for(int i=0;i<word.length();i++){
			if(word.charAt(i)==letter){
				cnt++;
			}	
			if((int)(word.charAt(i))+32==(int)letter){
				cnt++;
			}
			if((int)(word.charAt(i))-32==(int)letter){
				cnt++;
			}
		}
		System.out.print(cnt);
	}
}