import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		int temps[];
		int n,k,temp,max=-10000000,sum=0;
		
		n=scanner.nextInt();
		k=scanner.nextInt();
		
		temps=new int[n];
		for(int i=0;i<n;i++){
			temp=scanner.nextInt();
			temps[i]=temp;
		}
		for(int i=0;i<temps.length-k+1;i++){
			sum=0;
			for(int j=i;j<i+k;j++){
				sum+=temps[j];
			}
			if(max<sum){
				max=sum;
			}
		}
		System.out.print(max);
	}
}