import java.util.*;
import java.io.*;

public class Main{
	static class Pair{
		int end;
		int start;
		
		Pair(int end,int start){
			this.end=end;
			this.start=start;
		}
	}
	public static void main(String[]argse){
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		List<Pair> intervals=new ArrayList<>();
		
		for(int i=0;i<n;i++){
			int start=scanner.nextInt();
			int end=scanner.nextInt();
			intervals.add(new Pair(end,start));
		}
		Collections.sort(intervals, Comparator.comparingInt(pair -> pair.end));
		int count=1;
		int lastEnd=intervals.get(0).end;
		
		for(int i=1;i<n;i++){
			if(intervals.get(i).start>=lastEnd){
				lastEnd=intervals.get(i).end;
				count++;
			}
		}
		System.out.println(count);
	}
}