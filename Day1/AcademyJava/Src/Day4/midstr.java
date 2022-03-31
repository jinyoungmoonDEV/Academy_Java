package Day4;
import java.util.Scanner;
public class midstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String a = sc.next();
		String b = sc.next();
		String result = midstr(s,a,b);
		System.out.print(result);
	}
	
	public static String midstr(String ...strs) {         
		String ps= strs[0];
		int pa = Integer.parseInt(strs[1]);
		int pb = Integer.parseInt(strs[2]);
		String temp = new String("");
	    temp = ps.substring(pa - 1, pb);
	    return temp;
	}

}
