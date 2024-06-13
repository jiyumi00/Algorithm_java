import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {
        int num=626331;
        int cnt=0;
        boolean check=false;

        if(num==1){
            cnt=0;
        }else{
            while(true) {
                if (num % 2 == 0) {
                    num = num / 2;
                } else {
                    num = (num * 3) + 1;
                }
                cnt++;
                if (cnt > 500) {
                    cnt=-1;
                    break;
                }
                if(num == 1) {
                    break;
                }
            }
        }
        System.out.println(cnt);

    }
}
