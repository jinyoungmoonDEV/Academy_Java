package Day4;

public class Math {

	public static void main(String[] args) {
		int a,b,c;
		for(a=1;a<20;a++)
		for(b=1;b<20;b++)
		for(c=1;c<20;c++)
		if(a+b+c >= 20) {
			continue;
		}
		else if(a*a + b*b == c*c){
			System.out.printf("a=%d, b=%d, c=%d", a,b,c);
		}
	}

}
