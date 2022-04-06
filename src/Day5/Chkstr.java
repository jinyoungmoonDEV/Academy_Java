package Day5;
import java.util.Scanner;
class Ts{
	String s;
	String t;
	static final int NUM = 0;//정적변수
	static final int STR = 1;
	//-,.체크   둘다 둘다숫자는NUM아님STR
	Ts(String s, String t) {
		this.s = s;
		this.t = t;
	}
	public int check() {//체크 메소드 
		 int i;

	      for (i = 0; i < s.length(); i++) {
	         if (s.charAt(i) == '-' || s.charAt(i) == '.')
	            continue;
	         if (Character.isDigit(s.charAt(i)) == false)
	            return STR;

	      }

	      for (i = 0; i < t.length(); i++) {
	         if (t.charAt(i) == '-' || t.charAt(i) == '.')
	            continue;

	         if (Character.isDigit(t.charAt(i)) == false)
	            return STR;
	      }

	      return NUM;
	}
}
public class Chkstr {//메인 클래스
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		double a, b;
		int result;
		Ts P = new Ts(s,t);
		int cond = P.check();
		
		if(cond==P.STR) {
			result = s.compareTo(t);
		}else {
			a = Double.parseDouble(s);
			b = Double.parseDouble(t);
			if(a>b) result = 1;
			else if(a<b) result=-1;
			else result = 0;
		}
		System.out.println(result);
	}
}

