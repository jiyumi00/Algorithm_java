import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int n=5000;
        int answer=0;
        while(true){
            if(n==0) break;
            if(n%2==0){
                n=n/2;
            }else{
                n=n-1;
                answer++;
            }
        }
        System.out.println(answer);
    }
}
