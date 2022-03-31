package Day4;
import java.util.Scanner;
public class Time {
	int hour;
	int min;
	int sec;
	int hap;
	int day;
	
	public Time(int hour, int min, int sec, int day) {
	      this.hour = hour;
	      this.min = min;
	      this.sec = sec;
	      this.day = day;
	   }
	public Time add_time(Time second_time) {
	      int h1 = 0, m1 = 0, s1 = 0;
	      h1 = hour + second_time.hour;
	      m1 = min + second_time.min;
	      s1 = sec + second_time.sec;
	      int total = h1*m1*s1;
	      if(total > 24*60*60) {
	    	  day = 1;
	    	  total = total - (24*60*60);
	    	  h1 += h1 -1;
	      }
	      return new Time(h1, m1, s1, day);

	   }

	   public Time sub_time(Time second_time) {
	      int h1 = 0, m1 = 0, s1 = 0;
	      h1 = hour - second_time.hour;
	      m1 = min - second_time.min;
	      s1 = sec - second_time.sec;

	      int total = h1*m1*s1;
	      if(total < 0) {
	    	  day = -1;
	    	  total = total + (24*60*60);
	    	  h1 += h1 + 1;
	      }
	      return new Time(h1, m1, s1, day);

	   }

	   public void print() {
	      System.out.printf("%d %d %d %d\n", hour, min, sec, day);
	   }

	   public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      int hour, min, sec, day;
	      Time add_time;
	      Time sub_time;
	      int result;
	      hour = sc.nextInt();
	      min = sc.nextInt();
	      sec = sc.nextInt();
	      day = 0;
	      Time first_time = new Time(10, 10, 10, 0);
	      Time second_time = new Time(hour, min, sec, day);

	      add_time = first_time.add_time(second_time); // add 메소드 호출
	      sub_time = first_time.sub_time(second_time); // sub 메소도 호

	      System.out.println("두 시간의 합은");
	      add_time.print(); // print 메소드 호출

	      System.out.println("두 시간의 차는");
	      sub_time.print(); // print 메소드 호출
	}
}


