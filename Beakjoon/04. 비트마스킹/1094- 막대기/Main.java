import java.util.*;

public class Main{
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
	   String binary;
	   int x,cnt=0;
	   x=scanner.nextInt();
	   
	   binary=Integer.toBinaryString(x);
	   
	   for(int i=0;i<binary.length();i++){
		   if(binary.charAt(i)=='1'){
			   cnt++;
		   }
	   }
	   System.out.println(cnt);
    }
}

