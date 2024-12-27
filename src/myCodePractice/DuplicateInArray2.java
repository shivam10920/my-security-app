package myCodePractice;

public class DuplicateInArray2 {
	public static int[] duplicate(int[] a) {
		int[] b = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					boolean alradyAdded = false;

					for (int k = 0; k < b.length; k++) {

						if (b[k] == a[i]) {
							alradyAdded = true;
							break;

						}
					}
					if (!alradyAdded) {
						b[index] = a[i];
						index++;

					}
				}
			}

		}
		int[] result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = b[i];
		}
		return result;

	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 2, 3 };
		System.out.println(a[0]);
		int[] b = duplicate(a);
		for (int j : b) {
			System.out.println(j);
		}

	}

}
