import java.util.*;
public class Main{
	public static void main(String[]args){
		int times[]=new int[100];
		int aFare,bFare,cFare,totalFare=0;
		int startTime,endTime;
		Scanner scanner=new Scanner(System.in);
		
		aFare=scanner.nextInt();
		bFare=scanner.nextInt();
		cFare=scanner.nextInt();
		
		for(int i=0;i<3;i++){
			startTime=scanner.nextInt();
			endTime=scanner.nextInt();
			
			for(int j=startTime;j<endTime;j++){
				times[j]++;
			}
		}
		for(int i=0;i<times.length;i++){
			if(times[i]==1){
				totalFare+=times[i]*aFare;
			}
			else if(times[i]==2){
				totalFare+=times[i]*bFare;
			}
			else if(times[i]==3){
				totalFare+=times[i]*cFare;
			}
		}
		System.out.println(totalFare);
	}
}