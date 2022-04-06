package Day4;
import java.util.Scanner;
public class rsp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.equals(b)){
			System.out.print("무승부");
		}  
		else {
			if(a.equals("r")) {
				if(b.equals("s")) {
					System.out.print("철수, 승!");
				}
				else
					System.out.print("영희, 승!");
			}
			if(a.equals("s")) {
				if(b.equals("p")) {
					System.out.print("철수, 승!");
				}
				else
					System.out.print("영희, 승!");
			}
			if(a.equals("p")) {
				if(b.equals("r")) {
					System.out.print("철수, 승!");
				}
				else
					System.out.print("영희, 승!");
			}
		}
	}

}
