import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T,n,sum;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			sum=1;
			n=sc.nextInt();
			for(int i=2;i<=n;i++){
				if(i%2==0){
					sum-=i;
				}
				else{
					sum+=i;
				}
			}
			System.out.println("#"+test_case+" "+sum);
		}
    }
}

