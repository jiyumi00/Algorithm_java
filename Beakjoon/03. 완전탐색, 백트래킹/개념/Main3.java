import java.util.Scanner;
import java.util.Vector;

public class Main3 {
	static int n,temp, ret,cnt=0;
	static Vector<Integer> v;
	static final int mod=11;
	
	static void go(int idx,int sum){
		System.out.println("("+idx+","+sum+")");
		if(ret==10) return; //backTracking
		if(idx==n){
			ret=Math.max(ret,sum%mod);
			System.out.println("ret: "+ret);
			cnt++;
			return;
		}
		go(idx+1,sum+v.get(idx));
		go(idx+1,sum);
	}
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		v=new Vector<>();
		
		for(int i=0;i<n;i++){
			temp=scanner.nextInt();
			v.add(temp);
		}
		go(0,0);
		System.out.println(ret);
		System.out.println(cnt);
    }
}

