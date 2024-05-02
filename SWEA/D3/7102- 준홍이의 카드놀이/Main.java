import java.util.*;
import java.io.*;
public class Main{
	
    public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int T,n,m;
	
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			n=sc.nextInt();
			m=sc.nextInt();
			
			HashMap<Integer,Integer> map=new HashMap<>();
			ArrayList<Integer> maxList=new ArrayList<>();
			
			for(int i=1;i<=n;i++){
				for(int j=1;j<=m;j++){
					if(!map.containsKey(i+j)){
						map.put(i+j,1);
					}else{
						int cnt=map.get(i+j);
						map.replace(i+j,++cnt);
					}
				}
			}
			int maxCnt=0;
			
			Set<Integer> keySet=map.keySet();
			for(Integer key:keySet){
				maxCnt=Math.max(maxCnt,map.get(key));
			}

			for(Integer key:keySet){
				if(map.get(key)==maxCnt){
					maxList.add(key);
				}
			}
			Collections.sort(maxList);
			
			System.out.print("#"+test_case+" ");
			for(int item:maxList){
				System.out.print(item+" ");
			}
			System.out.println();
		}
    }
}

