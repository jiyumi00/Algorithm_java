import java.util.*;
import java.io.*;
public class Main{
	
	static int cnt;
	static ArrayList<Integer> newList=new ArrayList<>();
	static int go(ArrayList<Integer> list){
		cnt=0;
		newList.clear();
		for(int i=0;i<list.size();i++){
			if(i%2==0){
				System.out.println(list.get(i)+","+list.get(i+1));
				cnt+=Math.abs(list.get(i)-list.get(i+1));
				newList.add(Math.max(list.get(i),list.get(i+1)));
			}
		}
		return cnt;
	}
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int k,result=0;
		ArrayList<Integer> list=new ArrayList<>();
		k=sc.nextInt();
		
		for(int i=0;i<Math.pow(2,k);i++){
			list.add(sc.nextInt());
		}
		
		while(list.size()!=1){
			result+=go(list);
			System.out.println("result: "+result);
			list=(ArrayList<Integer>)newList.clone();
		}
		System.out.println(result);
		
    }
}

