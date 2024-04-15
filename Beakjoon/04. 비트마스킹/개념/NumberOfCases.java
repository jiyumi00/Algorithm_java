import java.util.*;

public class NumberOfCases{
    public static void main(String[] args) {
       String[] a={"사과", "딸기", "포도", "배"};
	   int n=a.length;
	   
	   for(int i=0;i<(1<<n);i++){
		   StringBuilder ret=new StringBuilder();
		   for(int j=0;j<n;j++){
			   if((i&(1<<j))!=0){
				   ret.append(a[j]).append(" ");
			   }
		   }
		   System.out.println(ret);
	   }
    }
}

