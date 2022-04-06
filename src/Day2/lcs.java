package Day2;

import java.util.Scanner;
public class lcs {
 
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int check = 0x80000000;//비트연산을 위한 값
		int num = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(Integer.toBinaryString(num));//코드실행전 2비트 출력
		
		for(i = 0; i < n; i++) {
			if ((num&check) == 0) {//i값 위치의 and연산자 비교
				num = num << 1;
			}
			else {
				num = num << 1;
				num= num +1;
				}
			}
		System.out.println(Integer.toBinaryString(num));
	}

}
