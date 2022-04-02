package Day4;
import java.io.PrintStream;
import java.util.Scanner;
public class Day4 {

	public static void main(String[] args) {

		/*
		//1번
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age>=19)
			System.out.print("성년");
		else
			System.out.print("미성년");
		 */


		/*
		//2번
		Scanner sc = new Scanner(System.in);
		int rank = sc.nextInt();
		if(rank == 1)
			System.out.print("아주 잘했습니다");
		else if(rank>=2 && rank<=3)
			System.out.print("잘했습니다");
		else if(rank >=4 && rank <=6)
			System.out.print("보통입니다");
		else
			System.out.print("노력해야겠습니다.");
		 */


		/*
		//3번
		Scanner sc = new Scanner(System.in);
		int num;
		int hap = 0;
		do {
		System.out.print("양의 정수를 입력하세요 : ");
		num = sc.nextInt();
		if (num%2 == 0)
			hap += num;
		else 
			continue;
		}while(num > 0);
		System.out.printf("입력한 양의 정수 중에서 짝수의 합은 %d", hap);
		 */


		/*
		//4번
		int a = 5;
		for(int i=1;i<a+1;i++)
		{
			for(int j=1;j<=i;j++) {
			System.out.print("*");
			}
			System.out.print("\n");
		}
		 */


		//5번
		/*
		int a,b,c;
		for(a=1;a<20;a++)
		for(b=1;b<20;b++)
		for(c=1;c< ;c++)
		if(a+b+c >= 20) {
			continue;
		}
		else if(a*a + b*b == c*c){
			System.out.printf("a=%d, b=%d, c=%d", a,b,c);
		}
		 */


		//6번+7번
		/*
		String c = input("철수");
		String y = input("영희");
		whoWin(c,y);
		 */


		/*
		//8번(코드 main메소드 아래)
		System.out.println(factorial(5));
		 */


		/*
		//9번
		foo("안녕",1);
		foo("안녕하세요",1,2);
		foo("잘 있어");
	}
	static void foo(String a) {
		System.out.println(a);
	}
	static void foo(String s,int a) {
		System.out.printf("%s %d\n",s,a);
	}
	static void foo(String s,int a,int b) {
		System.out.printf("%s %d %d\n",s,a,b);
	}
		 */


		//10번
		/*
		System.out.print("양의 정수릏 입력하세요 : ");
		int num = new Scanner(System.in).nextInt();
		if(isPrine(num))
			System.out.println(num + "는 소수 입니다.");
		else
			System.out.println(num + "는 소수가 아닙니다.");
		 */
	}

	/*
	//8번
	static int factorial(int n) {

		if(n == 1) {
			return 1;
		}
		else {
			return n * factorial ( n - 1 );
		}
	}
	 */


	/*//10번
	public static boolean isPrine(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		else {
			return false;
		}
	}
	 */


	/*
      //6,7번
	public static void whoWin(String c, String y) {
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.printf("%s : ",c);
		s1 = sc.next();
		System.out.printf("%s : ",y);
		s2 = sc.next();

		if (s1.equals("r")) {
			if (s2.equals("s"))
				System.out.println("철수, 승!");
			else if (s2.equals("p"))
				System.out.println("영희, 승!");
			else
				System.out.println("무승부");
		} else if (s1.equals("s")) {
			if (s2.equals("p"))
				System.out.println("철수, 승!");
			else if (s2 == "r")
				System.out.println("영희, 승!");
			else
				System.out.println("무승부");
		} else if (s1.equals("p")) {
			if (s2.equals("r"))
				System.out.println("철수, 승!");
			else if (s2.equals("s"))
				System.out.println("영희, 승!");
			else
				System.out.println("무승부");
		}
	}


	public static String input(String string) {
		return string;
	}
	 */
}

