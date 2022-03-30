package Day2;

import java.util.Scanner;
import java.util.Arrays;
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
		//1번
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
		//2번
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print(a * a);
		*/
		
		/*
		//3번
		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은? ");
		int a = sc.nextInt();
		System.out.print("원기둥의 높이는? ");
		int b = sc.nextInt();
		System.out.printf("원기둥의 부피는 %.2f", a*a*b*3.14);
		*/
		
		/*
		//4번
		Scanner sc = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");
		int time = sc.nextInt();
		int hour = time/(3600);
		int min = time/60-(hour*60);
		int min2 = (time-hour*3600)/60;
		int sec = time%60;
		System.out.printf("%d시간 %d분 %d초 %d", hour, min, sec,min2);
		*/
		
		
		/*
		//5번
		Scanner sc = new Scanner(System.in);
		System.out.print("소문자 입력 : ");
		String small = sc.next();
		small = small.toUpperCase();
		System.out.print(small);
		*/
		
		/*
		//6번
		Scanner sc = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요 : ");
		int F = sc.nextInt();
		float C = (float)5/9*(F-32);
		System.out.printf("%.2f",C);
		*/
		
		/*	
		//7번
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt(); 
		System.out.printf("1. %s\n",num % 4== 0 && num % 5 == 0);
		System.out.printf("2. %s\n",num % 4== 0 || num % 5 == 0);
		System.out.printf("3. %s\n",num % 4== 0 ^ num % 5 == 0);
		*/
		
		/*
		//8번
		Scanner sc = new Scanner(System.in);
		System.out.print("0~999 사이의 숫자를 입력하세요 : ");
		String num = sc.next();
		char[] arr = num.toCharArray();
		char hun = arr[0];
		char ten = arr[1];
		char one = arr[2];
		int hap = Character.getNumericValue(hun) + Character.getNumericValue(ten) + Character.getNumericValue(one);
		System.out.printf("%d", hap);
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int major = sc.nextInt();
		System.out.print("교양 이수 학점 : ");
		int culture = sc.nextInt();
		System.out.print("일반 이수 학점 : ");
		int normal = sc.nextInt();
		
		if (major >= 70) {
	         if ((culture >= 30 && normal >= 30) || (culture + normal) >= 80)
	            System.out.print("졸업가능");
	         else
	            System.out.print("졸업불가능");
	      } else
	         System.out.print("졸업불가능");
	  */
	}
}
