package Day66;
import java.util.Scanner;

class Select{
	String s, t;
	static final int NUM = 0;
	static final int STR = 1;

	public Select(String s, String t) {
		this.s = s;
		this.t = t;
	}

	public int check() {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '.') {
				continue;
			}
			if (Character.isDigit(s.charAt(i)) == false) {
				if (Character.isDigit(s.charAt(i)) == true){
					return NUM;
				}
				else {
					return STR;
				}
			}
		}
		return NUM;
	}

	class Numcmp{
		public Numcmp(String a, String b) { // 생성자?
			s = a;
			t = b;
		}

		public int cmp() { // Num.cmp method

			double a;
			double b;
			int result;

			a = Double.parseDouble(s);
			b = Double.parseDouble(t);
			if (a > b)
				result = 1;
			else if (a < b)
				result = -1;
			else
				result = 0;

			return result;
		}
	}


	class Strcmp{
		Strcmp(String s, String t) {
			s = s;
			t = t;
		}
		public int cmp() {
			int result = s.compareTo(t);
			return result;
		}
	}
}

public class midstr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		Select p;
		int result,Q;
		p = new Select(s,t);
		Q = p.check();

		if(Q == Select.STR) {
			Select.Strcmp a = p.new Strcmp(s,t);
			result = a.cmp();
		}
		else {
			Select.Numcmp a = p.new Numcmp(s,t);
			result = a.cmp();
		}

		System.out.println(result);
	}
}
