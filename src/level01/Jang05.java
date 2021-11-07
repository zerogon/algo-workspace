package level01;

public class Jang05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 0;
		int n = 45;
		String ans = "";
		while (n > 0) {
			ans = (n % 3) + ans;
			n /= 3;
		}
		
		ans =  new StringBuilder(ans).reverse().toString();
		answer = Integer.parseInt(ans,3);
		
		System.out.println(answer);
	}

}
