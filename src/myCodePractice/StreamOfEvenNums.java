package myCodePractice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfEvenNums {
	public static void main(String[] args) {
		List<Integer>l1 = Arrays.asList(2,3,4,5,2,7,8);
		List<Integer>l = l1.stream().filter(n -> n%2==0).collect(Collectors.toList());
		for(int i:l) {
			System.out.println(i);
		}
	}

}
