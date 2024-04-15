import java.util.*;

public class Parameter{
	private static final int n=4;
	private static String[] a={"사과", "딸기", "포도", "배"};
	
	private static void go(int num){
		String ret="";
		for(int i=0;i<4;i++){
			if((num&(1<<i))!=0) ret+=a[i]+" ";
		}
		System.out.println(ret);
	}
    public static void main(String[] args) {
		for(int i=0;i<n;i++){
			go(1|(1<<i));
		}
    }
}

