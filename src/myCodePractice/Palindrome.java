package myCodePractice;

public class Palindrome {
	public static Boolean revString(String s) {
		String s2= "";
		 char[] c=s.toCharArray();
		 System.out.println(c.length);
		
		for(int i=c.length-1 ; i>=0;i--) {
		
			s2=s2+c[i];
		}
		return s.equals(s2);

	}
	public static void main(String[] args) {
		Boolean s=revString("naman");
		System.out.println(s);
		
	}
}
