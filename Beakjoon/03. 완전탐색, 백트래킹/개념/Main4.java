import java.util.*;

public class Main4 {
	static final int n=3;
	static int[][]a={
		{10, 20, 21},
		{70, 90, 12},
		{80, 110, 120}
	};
	static int[][]visited=new int[3][3];
	 static final int[] dy = {-1, 0, 1, 0};
    static final int[] dx = {0, 1, 0, -1};
	static ArrayList<Integer> v=new ArrayList<>();
	
	static void print(){
		for(int i:v) System.out.print(i+" ");
		System.out.println();
	}
	static void go(int y,int x){
		if(y==n-1 && x==n-1){
			print();
			return;
		}
		for(int i=0;i<4;i++){
			int ny=y+dy[i];
			int nx=x+dx[i];
			if (ny < 0 || nx < 0 || ny >= n || nx >= n) continue;
			if(visited[ny][nx]==1) continue;
			visited[ny][nx]=1;
			v.add(a[ny][nx]);
			
			go(ny,nx);
			
			visited[ny][nx]=0;
			v.remove(v.size()-1);
		}
	}
    public static void main(String[] args) {
		visited[0][0]=1;
		v.add(a[0][0]);
		go(0,0);
    }
}

