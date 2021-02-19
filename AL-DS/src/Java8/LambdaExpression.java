package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpression {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("gagaag","aaa","abag","gagabjaljgla");
			
//		Collections.sort(list, new Comparator<String>(){
//			@Override
//			public int compare(String s1, String s2) {
//				return s1.length()-s2.length();
//			}
//		});
//		
//		System.out.println(list);
		
//		Collections.sort(list, (o1,o2)->o1.length()-o2.length());
//		list.forEach(System.out::println);
		
		list.parallelStream().sorted((o1,o2)->o2.length()-o1.length()).collect(Collectors.toList()).forEach(System.out::println);
	}

}
