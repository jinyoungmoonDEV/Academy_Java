package Day2;

import java.util.Scanner;

public class rcs {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		int check = 0x80000000;//비트연산을 위한 값
		int check1 = 0x7FFFFFF;//비트연산을 위한 값  아니면 check값을 ~선언하여 보수값으로 표현 가능(num = num&check1 => num = num& ~check) 100000---000 -> 011111111------111111
		int num = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println(Integer.toBinaryString(num));//코드실행전 2비트 출력
		
		for(i = 0; i < n; i++) {// *논리쉬프트(num = num >>> 1)사용하면 음수 양수 구분 x -> 단순 if ~else 구문으로 프로그래밍
			
			if(num >= 0) {//양수
				if ((num&check) == 0) {//i값 위치의 and연산자 비교, check값 or 1가능
				num = num >> 1;
				}
				else{
		    	num = num >> 1;
		    	num = num|check;//개념에 맞게 구현하기위한 비트 연산 처리
				}
			}
			
			else {//음수
				
		    if((num&1) == 0){//i값 위치의 and연산자 비교, check값 or 1가능
		    		num = num >> 1;
		    		num = num&check1;//개념에 맞게 구현하기위한 비트 연산 처리
		    }			
		    else {
		    	num = num >> 1;
		    	}
			}	
			
		}
		System.out.println(Integer.toBinaryString(num));
	}
}
