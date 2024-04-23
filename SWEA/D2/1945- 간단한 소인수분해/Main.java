import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int n,ret,T;
		T=sc.nextInt();
		int nums[]={2,3,5,7,11};
		
		for(int test_case=1;test_case<=T;test_case++){
			int cnts[]=new int[5];
			n=sc.nextInt();
			
			int index=0,cnt=0;
			while(true){
				if(n==1){
					break;
				}
				if(n%nums[index]==0){
					n=n/nums[index];
					cnt++;
				}else{
					cnts[index]=cnt;
					index++;
					cnt=0;
				}
			}
			cnts[index]=cnt;
			System.out.print("#"+test_case+" ");
			for(int i=0;i<5;i++){
				System.out.print(cnts[i]+" ");
			}
			System.out.println();
		}
    }
}

