package myCodePractice;

public class ReverseString {
	public static String revString(String s) {
		String s2= "";
		 char[] c=s.toCharArray();
		 System.out.println(c.length);
		
		for(int i=c.length-1 ; i>=0;i--) {
		
			s2=s2+c[i];
		}
		return s2;

	}
	public static void main(String[] args) {
		String s=revString("shivam");
		System.out.println(s);
		
	}
	

}
