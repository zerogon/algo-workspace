package notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;

public class LambdaLab {

	public static void main(String[] args) {
		
// ------------------------------------------ wrapper
		
		Consumer<String> printString = System.out::println;
		Function<String,Integer> func = Integer::parseInt;  // 하나의 메소드만 호출하는경우, 메소드 참조 가능
		Predicate<String> predic = s -> s.length() == 0;
		
		System.out.println(predic.test(""));
		int a = func.apply("40");
		System.out.println(a);
		printString.accept("안녕하세요");
		
// ------------------------------------------ 기본형
		ObjIntConsumer<String> objCon = (i, s) -> System.out.println(i + s);
		IntPredicate intPredic = x -> x % 2 == 0;
		IntFunction<String> intFunc = s-> s*10+"";
		
		objCon.accept("안녕", 20);
		System.out.println(intPredic.test(2));
		String ab = intFunc.apply(10);
		System.out.println(ab);
		
// ------------------------------------------ List
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		list.forEach(i->System.out.print(i+","));
		System.out.println("---");
		list.removeIf(i->i%2==0);
		list.forEach(i->System.out.print(i+","));
		list.replaceAll(x->x*10);
		System.out.println("---");
		list.forEach(System.out::println);
		
		
	}

}
