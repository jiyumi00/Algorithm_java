import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []elements={7,9,1,1,4};
        //2배의 길이 배열 생성
        int []newElements=new int[elements.length*2];

        for(int i=0;i<elements.length;i++){
            newElements[i]=elements[i];
            newElements[i+elements.length]=elements[i];
        }

        //중복을 제거하기 위한 Set 생성
        Set<Integer> set=new HashSet<>();

        for(int i=0;i<elements.length;i++){
            for(int j=i;j<elements.length+i;j++){
                int sum=0;
                for(int t=i;t<j;t++){
                    sum+=newElements[t];
                }
                set.add(sum);
            }
        }

        System.out.println(set.size());
    }
}
