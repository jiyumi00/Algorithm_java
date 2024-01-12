import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		String s;
		char t;
		int min,num;
		ArrayList<Integer> indexs=new ArrayList<>();
	
		s=scanner.next();
		t=scanner.next().charAt(0);
		
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==t){
				indexs.add(i);
			}
		}
		
		for(int i=0;i<s.length();i++){
			min=100;
			num=0;
			for(int j=0;j<indexs.size();j++){
				if(i<=indexs.get(j)){
					num=indexs.get(j)-i;
				}
				else{
					num=i-indexs.get(j);
				}
				if(min>num){
					min=num;
				}
			}
			System.out.print(min+" ");
		}
	}
}