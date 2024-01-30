import java.util.*;
public class Main{
	
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
		String []pokemons;
		n=scanner.nextInt();
		m=scanner.nextInt();
		
		pokemons=new String[n];
		for(int i=0;i<n;i++){
			name=scanner.next();
			pokemons[i]=name;
		}
		
		for(int i=0;i<m;i++){
			question=scanner.next();
			if(isNumber(question)){
				index=Integer.parseInt(question);
				System.out.println(pokemons[index-1]);
			}
			else{
				for(int j=0;j<n;j++){
					if(pokemons[j].equals(question)){
						System.out.println(j+1);
						break;
					}
				}
				
			}
		}
	}
}