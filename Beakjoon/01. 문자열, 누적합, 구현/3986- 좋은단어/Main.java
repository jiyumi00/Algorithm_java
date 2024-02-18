import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int n,cnt=0;
		String word;
		
		Stack<Character> stack=new Stack<>();
		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			stack.clear();
			word=br.readLine();
			for(int j=0;j<word.length();j++){
				//스택이 비어 있으면 push
				if(stack.isEmpty()){
					stack.push(word.charAt(j));
				}
				//안비어 있으면
				else{
					//최근 값과 동일하면
					if(word.charAt(j)==stack.peek()){
						stack.pop();
					}
					//최근 값과 동일하지 않으면
					else{
						stack.push(word.charAt(j));
					}
				}
			}
			//스택이 비어있으면 좋은 단어 !!
			if(stack.isEmpty()){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}