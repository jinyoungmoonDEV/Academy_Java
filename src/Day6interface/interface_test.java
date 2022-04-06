package Day6interface;
import java.util.Scanner;

interface Ts{//cmp method in Ts interface
	public abstract int cmp();
}
class Tr{
	String s;
	String t;
	Tr(String s, String t) {
		this.s = s;
		this.t = t;
	}
}


class Select extends Tr{//Tr상속받아 전역변수 선언
	Select(String s, String t) {//마더클래스 s,t값 선언
	      super(s, t);
	   }
	public  Ts check() {
		int i;
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-' || s.charAt(i) == '.') {
				continue;
			}
			if (Character.isDigit(s.charAt(i)) == false) {
				if (Character.isDigit(s.charAt(i)) == true){
					return new Numcmp(s,t);
				}
				else {
					return new Strcmp(s,t);
				}
			}
		}
		return new Numcmp(s,t);
	}
}


class Numcmp extends Tr implements Ts{//다중상속 클래스(Tr클래스,Ts인터페이스)
	Numcmp(String s, String t) {//마더클래스 s,t값 선언
		super(s, t);
	}
	@Override
	public int cmp() {
		double a,b;
		a = Double.parseDouble(s);
		b = Double.parseDouble(t);
		if(a>b) return  1;
		else if(a<b) return -1;
		else return  0;
	}
}



class Strcmp extends Tr implements Ts{//다중상속 클래스(Tr클래스,Ts인터페이스)
	Strcmp(String s, String t) {//마더클래스 s,t값 선언
		super(s, t);
	}
	@Override
	public int cmp() {
		return s.compareTo(t);
	}
}



public class interface_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();
		Select p;
		Ts Q;
		p = new Select(s,t);
		Q = p.check();

		System.out.println(Q.cmp());
	}

}