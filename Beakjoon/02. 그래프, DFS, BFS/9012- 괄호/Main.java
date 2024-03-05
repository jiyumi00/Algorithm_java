import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t;
		String input;
		Stack<Character> stack=new Stack<>();
		
		t=Integer.parseInt(br.readLine());
		
		for(int i=0;i<t;i++){
			stack.clear();
			input=br.readLine();
			
			for(int j=0;j<input.length();j++){
				if(stack.isEmpty()){
					if(input.charAt(j)==')'){
						stack.push(input.charAt(j));
						break;
					}
					stack.push(input.charAt(j));
				}
				else{
					if(stack.peek()==input.charAt(j)){
						stack.push(input.charAt(j));
					}
					else{
						stack.pop();
					}
				}
			}
			
			if(stack.isEmpty()){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}
}