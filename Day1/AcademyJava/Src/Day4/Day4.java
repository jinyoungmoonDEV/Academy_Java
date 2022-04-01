package Day4;
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
		for(c=1;c<20;c++)
		if(a+b+c >= 20) {
			continue;
		}
		else if(a*a + b*b == c*c){
			System.out.printf("a=%d, b=%d, c=%d", a,b,c);
		}
		*/
		
		//6번
	}
}
