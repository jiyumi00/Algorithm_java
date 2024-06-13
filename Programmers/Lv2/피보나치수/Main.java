import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n=3;
        int[]answer=new int[n+1];
        answer[0]=0;
        answer[1]=1;
        for(int i=2;i<=n;i++){
            answer[i]=(answer[i-1]+answer[i-2])%1234567;
        }
        System.out.println(answer[n]%1234567);
    }
}
