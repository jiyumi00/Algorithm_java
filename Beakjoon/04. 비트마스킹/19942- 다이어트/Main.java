import java.util.*;
import java.io.*;
public class Main{
	static int n,minPrice=10000;
	//static int mp,mf,ms,mv;
	static int standard[]=new int[4];
	static Map<Integer,ArrayList<Integer>> map=new HashMap<>();
	static void isSatisfied(){
		
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n=Integer.parseInt(br.readLine());
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<4;i++){
			standard[i]=Integer.parseInt(st.nextToken());
		}
		for(int i=1;i<=n;i++){
			st=new StringTokenizer(br.readLine());
			ArrayList<Integer> ingredients=new ArrayList<>();
			for(int j=0;j<5;j++){
				ingredients.add(Integer.parseInt(st.nextToken()));
			}
			map.put(i,ingredients);
			//System.out.println(ingredients);
		}
		/* for(int key:map.keySet()){
			ArrayList list=map.get(key);
			System.out.println(key+":"+list);
		} */
		
		//모든 경우의 수 
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<(1<<n);i++){
			list.clear();
			
			for(int j=0;j<n;j++){
				if((i&(1<<j))!=0){
					list.add(j+1);
					
				}
			}
			for(int t=0;t<list.size();t++){
				for(int key:map.keySet()){
					if(key==list.get(t)){
						ArrayList value=map.get(key);
						System.out.print(key+": ");
						for(int k=0;k<value.size();k++){
							System.out.print(value.get(k)+", ");
						}
						//System.out.print(key+": "+map.get(key));
					}
				}
				System.out.print(" ");
				
			}
			
			/* if(minPrice>price){
				minPrice=price;
				//key값들 저장
			} */
			System.out.println();
		}
    }
}

