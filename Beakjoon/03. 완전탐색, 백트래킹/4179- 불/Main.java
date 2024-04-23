import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Main{
	static int r,c;
	static char map[][];
	static int fireVisited[][],personVisited[][];
	static int fireX,fireY;
	static int personX,personY;
	static int cnt=0;
	static int dy[]={-1,0,1,0};
	static int dx[]={0,1,0,-1};
	
	public static class Pair{
		int y,x;
		Pair(int y,int x){
			this.y=y;
			this.x=x;
		}
	}
	
	
	static void bfs(int y,int x,int visited[][]){
		Queue<Pair> queue=new LinkedList<>();
		visited[y][x]=1;
		queue.add(new Pair(y,x));
		
		while(queue.size()!=0){
			Pair p=queue.poll();
			for(int i=0;i<4;i++){
				int ny=p.y+dy[i];
				int nx=p.x+dx[i];
				if(ny<0 || ny>=r || nx<0 || nx>=c) continue;
				if(map[ny][nx]!='#' && visited[ny][nx]==0){
					visited[ny][nx]=visited[p.y][p.x]+1;
					queue.add(new Pair(ny,nx));
				}
			}
			
		}
	}
    public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st=new StringTokenizer(br.readLine());
		r=Integer.parseInt(st.nextToken());
		c=Integer.parseInt(st.nextToken());
		
		map=new char[r][c];
		fireVisited=new int[r][c];
		personVisited=new int[r][c];
		for(int i=0;i<r;i++){
			String input=br.readLine();
			for(int j=0;j<c;j++){
				map[i][j]=input.charAt(j);
				if(map[i][j]=='F'){
					fireX=j;
					fireY=i;
				}
				if(map[i][j]=='J'){
					personX=j;
					personY=i;
				}
			}
		}
		
		bfs(fireY,fireX,fireVisited);
		bfs(personY,personX,personVisited);
		
		int answer = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (i == 0 || i == r-1 || j == 0 || j == c-1) {
                    if (personVisited[i][j] > 0 && (personVisited[i][j] < fireVisited[i][j] || fireVisited[i][j] == 0)) {
                        answer = Math.min(answer, personVisited[i][j]);
                    }
                }
            }
        }
        
        if (answer == Integer.MAX_VALUE) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(answer);
        }
    
		
    }
}