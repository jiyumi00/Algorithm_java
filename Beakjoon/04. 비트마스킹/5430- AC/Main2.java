import java.util.*;
import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            Deque<Integer> deque = new ArrayDeque<>();
            String P = sc.next();  // 연산자 문자열
            int N = sc.nextInt();  // 배열 원소의 수
            String order = sc.next();  // 배열 형태의 문자열

            int x = 0;
            for (int i = 0; i < order.length(); i++) {
                char c = order.charAt(i);
                if (c == '[' || c == ']') continue;
                // 숫자가 나오면 현재 수 * 10 한 뒤 더함
                if (c >= '0' && c <= '9') x = x * 10 + (c - '0');
                // ',' 일 경우 현재 수를 덱에 넣음
                else if (c == ',') {
                    deque.add(x);
                    x = 0;
                }
            }
            // 마지막 수를 덱에 넣음
            if (x > 0) deque.add(x);

            boolean error = false, reversed = false;

            for (char a : P.toCharArray()) {
                if (a == 'R') reversed = !reversed;
                else {
                    if (deque.isEmpty()) {
                        error = true;
                        break;
                    }
                    if (reversed) deque.pollLast();
                    else deque.pollFirst();
                }
            }

            if (error) System.out.println("error");
            else {
                StringBuilder sb = new StringBuilder("[");
                while (!deque.isEmpty()) {
                    int num = reversed ? deque.pollLast() : deque.pollFirst();
                    sb.append(num);
                    if (!deque.isEmpty()) sb.append(",");
                }
                sb.append("]");
                System.out.println(sb.toString());
            }
        }
    }
}
