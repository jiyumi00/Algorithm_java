import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	static String changeTime(int num){
		String m = "00" + (num / 60);
        String s = "00" + (num % 60);
        return m.substring(m.length() - 2) + ":" + s.substring(s.length() - 2);
	}
	public static void main(String[]args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n,teamNum,minute,second,lastTime=0,totalTime=48*60;
		int oneScore=0,twoScore=0,oneTime=0,twoTime=0;
		
		n=Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++){
			String input=br.readLine();
			st=new StringTokenizer(input);
			teamNum=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(st.nextToken(),":");
			minute=Integer.parseInt(st.nextToken());
			second=Integer.parseInt(st.nextToken());
			
			int currentTime=minute*60+second;
			
			if(oneScore>twoScore){
				oneTime+=currentTime-lastTime;
			}
			else if(twoScore>oneScore){
				twoTime+=currentTime-lastTime;
			}
			
			lastTime=currentTime;
			
			if(teamNum==1){
				oneScore++;
			}
			else{
				twoScore++;
			}
		}
		if(oneScore>twoScore){
			oneTime+=totalTime-lastTime;
		}
		else if(twoScore>oneScore){
			twoTime+=totalTime-lastTime;
		}
		System.out.println(changeTime(oneTime));
		System.out.print(changeTime(twoTime));
			
	}
}