import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		Stack<Character>stack=new Stack<>();
		while(true){
			stack.clear();
			str=br.readLine();
			if(str.equals(".")) break;
			
			for(int i=0;i<str.length();i++){
				if(stack.isEmpty()){
					if(str.charAt(i)=='('|| str.charAt(i)==')' || str.charAt(i)=='[' || str.charAt(i)==']'){
						stack.push(str.charAt(i));
					}
				}
				else{
					if((stack.peek()=='(' && str.charAt(i)==')') || (stack.peek()=='['&&str.charAt(i)==']')){
						stack.pop();
					}
					else{
						if(str.charAt(i)=='('|| str.charAt(i)==')' || str.charAt(i)=='[' || str.charAt(i)==']'){
							stack.push(str.charAt(i));
						}
					}
				}
			}
			if(stack.isEmpty()){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
	}
}