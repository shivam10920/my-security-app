package myCodePractice;

public class ProductOftwoNums {
	public static int productOfTwoNums(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j + 1] > a[0]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
		for (int k : a) {
			System.out.println(k);
		}
		return a[0] * a[1];
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		System.out.println(productOfTwoNums(a));
	}

}
