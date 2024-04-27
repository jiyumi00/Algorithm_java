import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T,n;
		T=sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			
			ArrayList<Integer> list=new ArrayList<>();
			
			for(int i=0;i<n;i++){
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			System.out.print("#"+test_case+" ");
			for(int num:list){
				System.out.print(num+" ");
			}
			System.out.println();
		}
    }
}

