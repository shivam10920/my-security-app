package myCodePractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheWord {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple","mango","apple");
		Map<String, Long>countWords = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		countWords.forEach((word,count)->System.out.println(word+":"+count));
	
	}

}
