package myCodePractice;

import java.util.Scanner;

public class Palindrome2 {
	public static boolean pali(String s) {
		int left = 0;
		int right = s.length() - 1;
		while (left <= s.length()-1) {
			if (s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(pali(s));

	}

}
