import java.util.*;
import java.io.*;

public class Main{
	public static class Pair<T1,T2>{
		private T1 first;
		private T2 second;
		public Pair(T1 first, T2 second){
			this.first=first;
			this.second=second;
		}
		public T1 getFirst(){
			return first;
		}
		public T2 getSecond(){
			return second;
		}
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		long n=scanner.nextLong();
		long k=scanner.nextLong();
		long ret=0;
		
		List<Pair<Long,Long>>jewelry=new ArrayList<>();
		for(int i=0;i<n;i++){
			long first=scanner.nextLong();
			long second=scanner.nextLong();
			jewelry.add(new Pair<>(first,second));
		}
		
		List<Long> bag=new ArrayList<>();
		for(int i=0;i<k;i++){
			bag.add(scanner.nextLong());
		}
		
		Collections.sort(jewelry,Comparator.comparing(Pair::getFirst));
		Collections.sort(bag);
		
		PriorityQueue<Long> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		int j=0;
		for(int i=0;i<k;i++){
			while(j<n && jewelry.get(j).getFirst()<=bag.get(i)){
				pq.add(jewelry.get(j).getSecond());
				j++;
			}
			if(!pq.isEmpty()){
				ret+=pq.poll();
			}
		}
		System.out.println(ret);
	}
	
}