import java.util.ArrayList;

public class Restorer {
	 static int[] visited = new int[4];
    static ArrayList<Integer>[] adj = new ArrayList[4];
    static ArrayList<Integer> v = new ArrayList<>();

    static void print() {
        for (int i : v) System.out.print((char) (i + 'A') + " ");
        System.out.println();
    }

    static void go(int idx) {
        if (v.size() == 3) {
            print();
            return;
        }
        for (int there : adj[idx]) {
            if (visited[there] == 1) continue;
            visited[there] = 1;
            v.add(there);
            go(there);
            visited[there] = 0;
            v.remove(v.size() - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            adj[i] = new ArrayList<>();
        }

        adj[0].add(1);
        adj[1].add(2);
        adj[1].add(3);
        adj[1].add(0);
        adj[2].add(1);
        adj[3].add(1);

        visited[0] = 1;
        v.add(0);
        go(0);
    }
}
