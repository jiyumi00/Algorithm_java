import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int []people={20,20,30,50,90};
        int limit=100;

        Arrays.sort(people);

        int min=0;
        int max= people.length-1;
        int cnt=0;
        while(true){
            if(min==max) {
                cnt++;
                break;
            }
            if(min>max) break;
            if(people[min]+people[max]>limit){
                max--;
                cnt++;
            }else if(people[min]+people[max]<=limit){
                min++;
                max--;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
