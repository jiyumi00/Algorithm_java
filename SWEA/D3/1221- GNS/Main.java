package project;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			Map<String,Integer> map=new LinkedHashMap<>();
			map.put("ZRO",0);
			map.put("ONE",0);
			map.put("TWO",0);
			map.put("THR",0);
			map.put("FOR",0);
			map.put("FIV",0);
			map.put("SIX",0);
			map.put("SVN",0);
			map.put("EGT",0);
			map.put("NIN",0);
			
			String tc=sc.next();
			int n=sc.nextInt();
			
			for(int i=0;i<n;i++) {
				String input=sc.next();
				
				if(map.containsKey(input)) {
					map.replace(input, map.get(input)+1);
				}
			}
			System.out.println("#"+test_case+" ");
			for(String key:map.keySet()) {
				if(map.get(key)>0) {
					for(int i=0;i<map.get(key);i++) {
						System.out.print(key+" ");
					}
				}
			}
			System.out.println();
		}
	}
	
}
