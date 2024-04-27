import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		
		int T;
		int day1_month,day2_month,day1_date,day2_date;
		int result=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		
		map.put(1,31);
		map.put(2,28);
		map.put(3,31);
		map.put(4,30);
		map.put(5,31);
		map.put(6,30);
		map.put(7,31);
		map.put(8,31);
		map.put(9,30);
		map.put(10,31);
		map.put(11,30);
		map.put(12,31);
		
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			day1_month=sc.nextInt();
			day1_date=sc.nextInt();
			day2_month=sc.nextInt();
			day2_date=sc.nextInt();
			
			if(day1_month==day2_month){
				result=day2_date-day1_date+1;
			}
			else{
				result=map.get(day1_month)-day1_date+1;
				for(int i=day1_month+1;i<day2_month;i++){
					result+=map.get(i);
				}
				result+=day2_date;
			}
			
			System.out.println("#"+test_case+" "+result);
		}
    }
}

