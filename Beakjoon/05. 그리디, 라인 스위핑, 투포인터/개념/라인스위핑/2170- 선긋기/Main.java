import java.util.*;
import java.io.*;

public class Main {
	 static class Pair {
        int from;
        int to;
        Pair(int from, int to) {
            this.from = from;
            this.to = to;
        }
    }
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());  

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            list.add(new Pair(from, to));
        }
        list.sort(Comparator.comparingInt(a -> a.from));

        int ret = 0;
        int l = list.get(0).from;
        int r = list.get(0).to;

        for (int i = 1; i < n; i++) {
            if (r < list.get(i).from) {
                ret += (r - l);
                l = list.get(i).from;
                r = list.get(i).to;
            } else if (list.get(i).from <= r && list.get(i).to > r) {
                r = list.get(i).to;
            }
        }
        ret += r - l; 
        bw.write(Integer.toString(ret));
		bw.flush();
		bw.close();
    }
}
