import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T=10;
		
		int a[]=new int[8];
		int newA[]=new int[8];
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n=sc.nextInt();
			for(int i=0;i<8;i++){
				a[i]=sc.nextInt();
			}
			
			int num=1,newNum=0;
			while(true){
				if(a[7]==0){
					break;
				}
				
				newNum=a[0]-num;
				if(newNum<=0){
					newNum=0;
				}
				
				for(int i=0;i<7;i++){
					newA[i]=a[i+1];
				}
				newA[7]=newNum;
				
				a=Arrays.copyOf(newA,newA.length);
			
				if(num==5){
					num=1;
				}else{
					num++;
				}
			}
			
			System.out.print("#"+test_case+" ");
			for(int i=0;i<8;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
    }
}

