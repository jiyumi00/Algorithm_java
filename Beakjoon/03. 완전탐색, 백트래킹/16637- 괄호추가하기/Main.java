import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static ArrayList<Integer>nums=new ArrayList<>();
	static ArrayList<Character>opers=new ArrayList<>();
	static int n,ret=Integer.MIN_VALUE;
	static String input;
	
	static int operation(char a,int b,int c){
		if(a=='+') return b+c;
		if(a=='-') return b-c;
		if(a=='*') return b*c;
		return 0;
	}
	static void go(int here,int num){
		if(here==nums.size()-1){
			ret=Math.max(ret,num);
			return;
		}
		go(here+1, operation(opers.get(here),num,nums.get(here+1)));
		if(here+2<=nums.size()-1){
			int temp=operation(opers.get(here+1),nums.get(here+1),nums.get(here+2));
			go(here+2,operation(opers.get(here),num,temp));
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		n=Integer.parseInt(br.readLine());
		input=br.readLine();
		
		for(int i=0;i<n;i++){
			if(i%2==0) nums.add(input.charAt(i)-'0');
			else opers.add(input.charAt(i));
		}
		go(0,nums.get(0));
		System.out.println(ret);
	}
}