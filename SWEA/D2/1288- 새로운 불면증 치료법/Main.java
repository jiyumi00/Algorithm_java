import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int nums[]=new int[10];
		int T,n,result;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			
			Arrays.fill(nums,0);
			int x=1;
			while(true){
				boolean check=true;
				result=n*x;
				
				String number=Integer.toString(result);
				for(int i=0;i<number.length();i++){
					nums[number.charAt(i)-'0']=1;
				}
				for(int i=0;i<nums.length;i++){
					if(nums[i]==0){
						check=false;
					}
				}
				if(check==true) break;
				x++;
			}
			System.out.println("#"+test_case+" "+result);
		}
    }
}

