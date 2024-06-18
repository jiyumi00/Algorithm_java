import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int n=118372;

        String[]nums=String.valueOf(n).split("");
        Arrays.sort(nums, Comparator.reverseOrder());
        StringBuilder sb=new StringBuilder();
        for(String num:nums){
            sb.append(num);
        }
        long answer=0;
        answer=Long.parseLong(sb.toString());
        System.out.println(answer);
    }
}
