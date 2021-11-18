package notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLab {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		int [] intArray = new int [] {1,2,3,4,5};
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		};
		
		//Stream.of(intArray).forEach(a->System.out.println(a));
		//Stream<int[]> ane = Stream.of(intArray);
		
		Stream<Integer> stream1 = list.stream();
		IntStream stream2 = Arrays.stream(intArray);
		
		// stream1.sorted().forEach(System.out::print);
		// stream2.sorted().forEach(System.out::print);
		
		//stream1.map(x->2*x).forEach(System.out::print);
		
		
		
		

	}

}
