import java.util.*;

public class Main {

    public static void main(String[] args) {
       int k=1;
       int[] tangerine={1, 1, 1, 1, 2, 2, 2, 3};

       Map<Integer,Integer> map=new HashMap<>();
       for(int size:tangerine){
           map.put(size,map.getOrDefault(size,0)+1);

       }
       ArrayList<Integer> list=new ArrayList<>();
       map.forEach((key,value)->{
           list.add(value);
       });
       Collections.sort(list,Collections.reverseOrder());
       int sum=0;
       int cnt=0;
       for(int num:list){
           sum+=num;
           cnt++;
           if(sum>=k){
               break;
           }

       }
        System.out.println(cnt);
    }
}
