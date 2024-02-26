import java.util.Scanner;
import java.util.Vector;

public class Main2 {
	static int n;
	static Vector<Integer> v;
	
	static boolean check(int n){
		if(n<=1) return false;
		if(n==2) return true;
		if(n%2==0) return false;
		for(int i=3;i*i<=n;i++){
			if(n%i==0) return false;
		}
		return true;
	}
	static int go(int idx,int sum){
		System.out.println("go("+idx+","+sum+")");
		if(idx==n){
			return check(sum)?1:0;
		}
		return go(idx+1,sum+v.get(idx))+go(idx+1,sum);
		
	}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		v=new Vector<>();
		
		for(int i=0;i<n;i++){
			int temp=scanner.nextInt();
			v.add(temp);
		}
		
		System.out.println(go(0,0));
    }
}

