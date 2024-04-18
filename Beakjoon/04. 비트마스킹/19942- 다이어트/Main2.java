import java.util.*;
import java.io.*;
public class Main2{
	static int n,targetMp,targetMf,targetMs,targetMv;
	static int minCost=Integer.MAX_VALUE;
	static class Ingredient{
		int mp,mf,ms,mv,cost;
		
		public Ingredient(int mp,int mf,int ms,int mv,int cost){
			this.mp=mp;
			this.mf=mf;
			this.ms=ms;
			this.mv=mv;
			this.cost=cost;
		}
	}
    public static void main(String[] args) throws IOException{
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		targetMp=scanner.nextInt();
		targetMf=scanner.nextInt();
		targetMs=scanner.nextInt();
		targetMv=scanner.nextInt();
		
		Ingredient[] ingredients=new Ingredient[n];
		for(int i=0;i<n;i++){
			int mp=scanner.nextInt();
			int mf=scanner.nextInt();
			int ms=scanner.nextInt();
			int mv=scanner.nextInt();
			int cost=scanner.nextInt();
			ingredients[i]=new Ingredient(mp,mf,ms,mv,cost);
		}
		
		Map<Integer,List<List<Integer>>> resultMap=new HashMap<>();
		
		for(int i=1;i<(1<<n);i++){
			int sumMp=0,sumMf=0,sumMs=0,sumMv=0,sumCost=0;
			List<Integer> combination=new ArrayList<>();
			
			for(int j=0;j<n;j++){
				if((i&(1<<j))!=0){
					combination.add(j+1);
					sumMp+=ingredients[j].mp;
					sumMf+=ingredients[j].mf;
					sumMs+=ingredients[j].ms;
					sumMv+=ingredients[j].mv;
					sumCost+=ingredients[j].cost;
				}
				
			}
			if(sumMp>=targetMp && sumMf>=targetMf && sumMs>=targetMs && sumMv>=targetMv){
				if(sumCost<=minCost){
					if(sumCost<minCost){
						minCost=sumCost;
						resultMap.put(minCost,new ArrayList<>());
					}
					resultMap.get(minCost).add(combination);
				}
			}
			
		}
		if(minCost==Integer.MAX_VALUE){
			System.out.println("-1");
		}else{
			//같은 비용의 집합이 하나 이상이면 사전 순으로 가장 빠른 것 출력
			List<List<Integer>> optimalCombinations=resultMap.get(minCost);
			Collections.sort(optimalCombinations,(list1,list2)->{
				for(int k=0;k<Math.min(list1.size(),list2.size());k++){
					if(!list1.get(k).equals(list2.get(k))){
						return list1.get(k)-list2.get(k);
					}
				}
				return list1.size()-list2.size();
			});
			System.out.println(minCost);
			for(int index:optimalCombinations.get(0)){
				System.out.print(index+" ");
			}
			System.out.println();
		}
    }
}

