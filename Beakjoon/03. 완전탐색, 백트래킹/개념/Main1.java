import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int cnt=0;
		int i=2400;
		while(true){
			String a=Integer.toString(i);
			if(a.contains("2400")){
				cnt++;
				if(n==cnt){
					System.out.println(a);
					break;
				}
			}
			i++;
		}
    }
}

