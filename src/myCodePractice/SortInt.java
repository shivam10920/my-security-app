package myCodePractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortInt {public static void main(String[] args) {
	List<Integer>num = Arrays.asList(3,41,34,51,32,22);
	List<Integer>num2= num.stream().sorted(Comparator.reverseOrder()).toList();
	for(int n :num2) {
		System.out.println(n);
	}
}

}
