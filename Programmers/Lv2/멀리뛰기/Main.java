import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;



public class Main {
    static int go(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        int a=1,b=2;
        int result=0;
        for(int i=3;i<=n;i++){
            result=(a+b)%12345;
            a=b;
            b=result;
        }
        return result%12345;
    }

    public static void main(String[] args) {
       int n=5;
        System.out.println(go(n));

    }
}
