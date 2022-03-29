package Day2;

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
		*/
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
	}

}
