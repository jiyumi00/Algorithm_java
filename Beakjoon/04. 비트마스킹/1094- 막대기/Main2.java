import java.util.*;

public class Main2{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
	   String binary;
	   int x,cnt=1;
	   x=scanner.nextInt();
	   
	   while(x!=1){
		   if((x&1)==1) cnt++;
		   x/=2;
	   }
	   System.out.println(cnt);
    }
}

