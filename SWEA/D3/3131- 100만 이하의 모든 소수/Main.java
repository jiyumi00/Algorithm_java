package project;

import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		
		for(int i=2;i<100;i++) {
			int flag=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
