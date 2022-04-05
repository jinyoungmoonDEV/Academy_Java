package Day7;
import java.util.ArrayList;
import java.util.Vector;
import java.util.*;


public class plactice {

	public static void main(String[] args) {

		/*
		//ppt251
		String test = "Hello Java! by JAVA";
		System.out.println(test);
		String a = test.substring(12);
		System.out.println(a);
		a = test.substring(0,12);
		System.out.println(a);

		String[] arr = test.split(" ");
		for(String s:arr) {
			System.out.println("s");
		}

		boolean check = test.contains("JAVA");
		System.out.println(check);
		check = test.contains("JAVA!");
		System.out.println(check);

		check = test.equals("Hello Java! by JAVA");
		System.out.println(check);
		check = test.equals("Hello Java by JAVA");
		System.out.println(check);

		String valueof = String.valueOf(true);
		System.out.println(valueof);
		valueof = String.valueOf('a');
		System.out.println(valueof);
		valueof = String.valueOf(250);
		System.out.println(valueof);
		valueof = String.valueOf(250L);
		System.out.println(valueof);
		valueof = String.valueOf(250f);
		System.out.println(valueof);
		valueof = String.valueOf(250.25);
		System.out.println(valueof);
		valueof = String.valueOf(true);
		System.out.println(valueof);
		 */

		/*
		//254~255
		String string_value;

		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer("20");

		Double double1 = new  Double(10.5);
		Double double2 = new  Double("20.5");

		Integer unboxing_integer;

		string_value = Double.toString(double1);
		System.out.println(string_value);
		System.out.println();

		string_value = Double.toString(double2);
		System.out.println(string_value);
		System.out.println();

		Integer integer3 = Integer.parseInt(integer1.toString());
		System.out.println(integer3);
		System.out.println();

		string_value = integer2.toBinaryString(integer2);
		System.out.println(string_value);
		System.out.println();
		string_value = integer2.toOctalString(integer2);
        System.out.println(string_value);
        System.out.println();
        string_value = integer2.toHexString(integer2);
        System.out.println(string_value);
        System.out.println();
        unboxing_integer = 55;//boxing 
        Integer integer4 = new  Integer(integer1.valueOf(unboxing_integer+2));//unboxing 
        System.out.println(integer4);
        System.out.println();
        System.out.println("문자열 2진수 -> int : " + Integer.valueOf(bin, 2));
        System.out.println("문자열 8진수  -> int : " + Integer.valueOf(oct, 8));
        System.out.println("문자열 16진수-> int : " + Integer.valueOf(hex, 16));
		 */
		/*
		//348~349
		ArrayList list1 = new ArrayList(20);
		list1.add(10);
		list1.add(9);
		list1.add(8);
		list1.add(7);
		list1.add(6);
		list1.add(5);

		ArrayList list2 = new ArrayList(list1.subList(0, 5));  // 인덱스 0부터 5까지를 list2에 대입한다.
		print(list1,list2);

		System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));  //list1과 list2의 교집합을 출력한다.

		list2.add("a");
		list2.add("b");
		list2.add(3,"A");
		print(list1,list2);

		list2.set(3, "B");
		print(list1,list2);
		for(int i = list2.size()-1; i>=0; i--) {
            if(list1.contains(list2.get(i)))
            list2.remove(i);
        }
        print(list1,list2);
    }

    static void print(ArrayList list1,ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
		 */
		/*
		//350
		Vector v = new Vector(10);
		v.add("10");
		v.add("9");
		v.add("8");
		v.add("7");
		print(v);

		v.trimToSize();    // tirmToSize()메소드는 빈공간을 없앤다.
		System.out.println("===[빈공간을 없앤 후]===");
		print(v);

		v.ensureCapacity(6);    //ensureCapacity(6)은 버퍼의 크기를 6이상으로 늘린다.
		System.out.println("===[버퍼크기6이상 늘린 후]===");
		print(v);

		v.clear();
		System.out.println("===[벡터를 지운 후]===");
		print(v);
	}

	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());
		System.out.println("capacity() : " + v.capacity());
	}
		 */

		//352
		ArrayList<String> list = new ArrayList<String>();

		list.add("일");
		list.add("이");
		list.add("삼");
		list.add("사");
		list.add("삼");
		list.add("이");
		list.add("일");

		String str;
		Iterator e = list.iterator();    //반복자 객체 얻기
		while(e.hasNext())            // 다음 원소가 있다면 실행
		{
			str = (String)e.next();    // 다음 원소 반환
			System.out.println(str);
		}

		System.out.println(list.indexOf("일"));    //앞에서 부터 검색한다.
		System.out.println(list.lastIndexOf("일"));    //뒤에서 부터 검색한다
	}
}
