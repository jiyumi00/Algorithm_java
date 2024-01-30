import java.util.*;
public class Main2{
	public static boolean isNumber(String question){
		if(question.matches(".*[0-9].*")){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		
		int n,m,index;
		String name,question;
		String []pokemonIndexs;
		HashMap<String,Integer> pokemonNames=new HashMap<String,Integer>();
		n=scanner.nextInt();
		m=scanner.nextInt();
		
		pokemonIndexs=new String[n+1];
		for(int i=1;i<=n;i++){
			name=scanner.next();
			pokemonNames.put(name,i);
			pokemonIndexs[i]=name;
		}
		
		for(int i=0;i<m;i++){
			question=scanner.next();
			if(isNumber(question)){
				index=Integer.parseInt(question);
				System.out.println(pokemonIndexs[index]);
			}
			else{
				System.out.println(pokemonNames.get(question));
			}
		} 
	}
}