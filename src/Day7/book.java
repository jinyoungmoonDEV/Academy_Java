package Day7;

public class book {

	public static void main(String[] args) {
		//1번
		String s = "abcbdbe";
		char c= 'b';
		System.out.print(countChar(s,c));
	}

	static int countChar(String s, char c) {
		return s.charAt(c);
	}
}