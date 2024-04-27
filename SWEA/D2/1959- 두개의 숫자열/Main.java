import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T,n,m;
		int a[],b[];
		
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			m=sc.nextInt();
			
			a=new int[n];
			b=new int[m];
			
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			for(int i=0;i<m;i++){
				b[i]=sc.nextInt();
			}
			
			int maxSum=0;
			int minArr[],maxArr[];
			if(n<m){
				minArr=Arrays.copyOf(a,a.length);
				maxArr=Arrays.copyOf(b,b.length);
			}else{
				minArr=Arrays.copyOf(b,b.length);
				maxArr=Arrays.copyOf(a,a.length);
			}
			
			for(int i=0;i<Math.abs(m-n)+1;i++){
				int result=0;
				for(int j=0;j<Math.min(m,n);j++){
					result+=minArr[j]*maxArr[i+j];
				}
				maxSum=Math.max(maxSum,result);
			}
			System.out.println("#"+test_case+" "+maxSum);
		}
		
		
    }
}

