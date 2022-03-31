package Day4;
import java.util.Arrays;
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
		String temp="";
	  //return ps.substring(pa - 1, pb);
		for(int i=pa-1;i<=pb;i++) {
		}
		return temp;
	}

}
