import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args) throws IOException{
		Scanner scanner=new Scanner(System.in);
		int testCase,n,ret;
		
		testCase=scanner.nextInt();
		for(int i=0;i<testCase;i++){
			n=scanner.nextInt();
			ret=0;
			for(int j=5;j<=n;j*=5){
				ret+=n/j;
			}
			System.out.println(ret);
		}
	}
}