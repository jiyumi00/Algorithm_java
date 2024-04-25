import java.util.*;
import java.io.*;
public class Main{
	static int cnt;
	static int recursion(String input,int l,int r){
		if(input.charAt(l)!=input.charAt(r)){
			return 0;
		}else if(l>=r){
			return 1;
		}
		else {
			cnt++;
			return recursion(input,l+1,r-1);
		}
		
	}
	static int isPalindrome(String input){
		cnt=1;
		return recursion(input,0,input.length()-1);
	}
    public static void main(String[] args) throws IOException{
		Scanner scanner=new Scanner(System.in);
		int t;
		t=scanner.nextInt();

		for(int i=0;i<t;i++){
		   String input=scanner.next();
		   System.out.println(isPalindrome(input)+" "+cnt);
		}
    }
}

