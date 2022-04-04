package Day6;
import java.util.Scanner;

interface Ts{
}
abstract class Tr{
	String s;
	String t;
	public abstract int cmp();
	Tr(String s, String t) {
		this.s = s;
		this.t = t;
	}
}


class Select{
	String s,t;
	
	Select(String s,String t){
		this.s = s;
		this.t = t;
	}
	public  Tr check() {
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '.') {
				continue;
			}
			if (Character.isDigit(s.charAt(i)) == false) {
				if (Character.isDigit(s.charAt(i)) == true){
				}
				else {
					return new Strcmp(s,t);
				}
			}
		}
		return new Numcmp(s,t);
	}
}


class Numcmp extends Tr implements Ts{
	Numcmp(String s, String t) {
		super(s, t);
	}
	public int cmp() {
		double a,b;
		a = Double.parseDouble(s);
		b = Double.parseDouble(t);
		if(a>b) return  1;
		else if(a<b) return -1;
		else return  0;
	}
}



class Strcmp extends Tr implements Ts{
	Strcmp(String s, String t) {
		super(s, t);
	}
	public int cmp() {
		return s.compareTo(t);
	}
}



public class abstract_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		Select p;
		Tr Q;
		p = new Select(s,t);
		Q = p.check();

		System.out.println(Q.cmp());
	}

}
