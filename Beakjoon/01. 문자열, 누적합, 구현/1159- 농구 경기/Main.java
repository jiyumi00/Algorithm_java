import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int n,index;
		String name;
		int alpha[]=new int[26];
		boolean check=false;
		
		n=scanner.nextInt();
		for(int i=0;i<n;i++){
			name=scanner.next();
			alpha[((int)name.charAt(0))-97]++;
		}
		for(int i=0;i<alpha.length;i++){
			if(alpha[i]>=5){
				check=true;
				System.out.print((char)(i+97));
			}
		}
		if(check==false){
			System.out.print("PREDAJA");
		}
		
	}
}