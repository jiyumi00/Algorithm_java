import java.util.*;
public class Main{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		int height,totalSum=0,index1=0,index2=0;
		
		for(int i=0;i<9;i++){
			height=scanner.nextInt();
			list.add(height);
			totalSum+=height;
		}
		for(int i=0;i<9;i++){
			for(int j=i+1;j<9;j++){
				if((totalSum-100)==(list.get(i)+list.get(j))){
					index1=i;
					index2=j;
					break;
				}
			}
		}
		
		list.remove(index1);
		list.remove(index2-1);
		
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
}