package myCodePractice;

public class DuplicateNums {
	public static void duplicateNum(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
					break;
				}

			}

		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 4 };
		duplicateNum(a);

	}

}
