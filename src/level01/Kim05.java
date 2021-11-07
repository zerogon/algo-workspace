package level01;

public class Kim05 {
	static class Solution {
		public int solution(int[] numbers) {	
			int sum = 45;
			for(int number : numbers) {
				sum -= number;
			}
			return sum;
		}
	}

	public static void main(String[] args) {
		methodTest a = (x,y)->x+y;
		
		System.out.println(a.sum(10, 20));
	}
}

@FunctionalInterface
interface methodTest{
	int sum (int a, int b);
}
