import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n,c;
		List<Integer> messages=new ArrayList<>();
		List<Integer> cnts=new ArrayList<>();
		String input;
		
		st=new StringTokenizer(br.readLine());
		n=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
	
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++){
			int message=Integer.parseInt(st.nextToken());
			
			if(messages.contains(message)){
				int index=messages.indexOf(message);
				int cnt=cnts.get(index);
				cnt++;
				cnts.set(index,cnt);
			}
			else{
				messages.add(message);
				cnts.add(1);
			}
			//message가 messages에 있으면
				//해당 인덱스에 cnt++
			
			//없으면
				//messages 배열에 추가
				//cnt배열에 1추가
		}

		//내림차순 정렬

		for(int i=0;i<cnts.size();i++){
			for(int j=i+1;j<cnts.size();j++){
				if(cnts.get(i)<cnts.get(j)){
					cnts.remove(j);
					cnts.add(i,cnts.get(j));
				}
			}
		} 
		for(int cntValue:cnts){
			System.out.print(cntValue+" ");
		}
		/*
		System.out.println();
		for(int i=0;i<messages.size();i++){
			
			for(int j=0;j<cnts.get(i);j++){
				System.out.print(messages.get(i)+" ");
			}
		} */
		
	}
}