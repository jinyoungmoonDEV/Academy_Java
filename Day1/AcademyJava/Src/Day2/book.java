package Day2;

import java.util.Scanner;
public class book {

	public static void main(String[] args) {
		/*
		double d = (double)100;
		System.out.println(d);
		
		int x = 1, y = 2;
		
		System.out.println(x++);//실행후 값1 추가
		System.out.println(++x + y--);
		System.out.println(++x / 3 + x * ++y);//int 형이라 소수점
		
		
		int x = 100;
		System.out.println(x + "부터" + 200);
		System.out.println(x + 100 + " 년 전");
		System.out.println("200" + "100" + "어이쿠!");
		
		int i1 = 0x11, i2 = 5;
		final int ONE = 1;
		char c1 = 'a';
		float f1 = 3.14f;
		double d1 = 2.8;
		boolean b1 = true;
		
		int i = 1;
		//boolean b = (boolean)i;
		System.out.println(i);
		
		System.out.printf("i1 = %d\n", i1);
		System.out.printf("i1/2 = %d\n", i1/2);
		System.out.println("c1+ONE" + c1 + ONE);
		System.out.println((int)c1 + ONE);
		
		System.out.printf("b1"+b1);
		*/
		
		/*
		for(int i=1;i<12;i++)
		{
			for(int j=0;j<12-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print(a * a);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int a = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int b = sc.nextInt();
		System.out.printf("원기둥의 부피는 %.2f", a*a*b*3.14);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int time = sc.nextInt();
		int hour = time/(3600);
		int min = time/60-(hour*60);
		int sec = time%60;
		System.out.printf("%d시간 %d분 %d초", hour, min, sec);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요 : ");
		int F = sc.nextInt();
		float C = (float)5/9*(F-32);
		System.out.printf("%.2f",C);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 입력 : ");
		int small = sc.nextInt();
		char big = (char)((char)small - 32);
		System.out.print(big);
	}

}
