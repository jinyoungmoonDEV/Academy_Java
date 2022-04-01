package Day5;
import java.util.Scanner;

class Tr{
	String s;
	String t;
	Tr(String s, String t) {
		this.s = s;
		this.t = t;
	}
}


class Select extends Tr{
	public  Select(String s, String t) {
		super(s, t);
	}
	public Tr check(){
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '.') {
				continue;
			}
			if (Character.isDigit(s.charAt(i)) == false) {
				return new Strcmp(s,t);
			}
			else {
				return new Numcmp(s,t);
			}
		}
		return new Numcmp(s,t);
	}
	public int connect(Tr Q) {
		if (Q instanceof Strcmp) {
			return ((Strcmp)Q).cmp();
		}
		else 
			return ((Numcmp)Q).cmp();
	}
}


class Numcmp extends Tr{
	Numcmp(String s, String t) {
		super(s, t);
	}
	public int cmp() {
		double a,b;
	    a = Double.parseDouble(s);
		b = Double.parseDouble(t);
		if(a>b) return  1;
		else if(a<b) return 1;
		else return  0;
	}
}



class Strcmp extends Tr{
	Strcmp(String s, String t) {
		super(s, t);
	}
	public int cmp() {
		return s.compareTo(t);
	}
}



public class fcmp2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		Tr p,Q;
		p = new Select(s,t);//upcasting
		Q = ((Select)p).check();//down

		System.out.println(((Select)p).connect(Q));;
	}

}
