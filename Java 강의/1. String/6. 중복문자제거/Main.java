import java.util.Scanner;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String str;
		int []alpa=new int[26];
		int index;
		str=scanner.next();
		
		for(int i=0;i<str.length();i++){
			index=(int)str.charAt(i)-97;
			
			if(alpa[index]==0){
				System.out.print(str.charAt(i));
				alpa[index]++;
			}
			else{
				continue;
			}
		}
	}
}