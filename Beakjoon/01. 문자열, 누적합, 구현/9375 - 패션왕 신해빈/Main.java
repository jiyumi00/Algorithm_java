import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		HashMap<String,Integer> clothes=new HashMap<String,Integer>();
		int t,n,result=1;
		String name,kind;
		
		t=scanner.nextInt();
		for(int i=0;i<t;i++){
			result=1;
			clothes.clear();
			n=scanner.nextInt();
			for(int j=0;j<n;j++){
				name=scanner.next();
				kind=scanner.next();
				
				if(clothes.containsKey(kind)){
					int cnt=clothes.get(kind);
					cnt++;
					clothes.put(kind,cnt);
				}
				else{
					clothes.put(kind,1);
				}
			}
			for(int cnt:clothes.values()){
				result *= cnt+1;
			}
			System.out.println(result-1);
		}
	}
}