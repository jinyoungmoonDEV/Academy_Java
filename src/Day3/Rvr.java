package Day3;
import java.util.Scanner;
public class Rvr {

	public static void main(String[] args) {
		System.out.println("문자열\n문자");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = sc.next().charAt(0);
		
		String res = revsqueeze(s,c);
		System.out.println(res);
		}
	
	/*
	public static String revsqueeze(String s, char c) {
	      char ch;
	      String temp = "";
	      for (int i = s.length() - 1; i >= 0; i--) {
	         ch = s.charAt(i);

	         if (ch != c)
	            temp += ch;

	      }
	      return temp;
	   }
	   */
	
	public static String revsqueeze(String s, char c) {
	      char ch;
	      String temp = "";
	      int i = s.length()-1;
	      while(i >=0)
	      {
	    	  ch = s.charAt(i);
	    	  
	    	  if(ch != c)
	    	  {
	    		  temp += ch;
	    	  }
	    	  i--;
	      }
	      return temp;
	   }
}
