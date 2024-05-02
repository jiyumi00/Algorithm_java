import java.util.*;
import java.io.*;
public class Main{
	static int n,m;
	static ArrayList<String>nList=new ArrayList<>();
	
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T = 10;
		for(int test_case = 1; test_case <= T; test_case++)
		{
			nList.clear();
			n=sc.nextInt();
			for(int i=0;i<n;i++){
				nList.add(sc.next());
			}
			
			int x,y;
			m=sc.nextInt();
			for(int i=0;i<m;i++){
				String command=sc.next();
				
				switch(command){
					case "I":
						x=sc.nextInt();
						y=sc.nextInt();
						
						for(int j=0;j<y;j++){
							String s=sc.next();
							nList.add(x+j,s);
						}
						break;
					
					case "D":
						x=sc.nextInt();
						y=sc.nextInt();
						
						for(int j=0;j<y;j++){
							nList.remove(x);
						}
						break;
					
					case "A" :
						y=sc.nextInt();
						for(int j=0;j<y;j++){
							String s=sc.next();
							nList.add(s);
						}
						break;
				}
			}
			System.out.print("#"+test_case+" ");
			for(int i=0;i<10;i++){
				System.out.print(nList.get(i)+" ");
			}
			System.out.println();
		}
    }
}

