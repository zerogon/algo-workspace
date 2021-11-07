package notebook;

public class BinaryLab {

	public static void main(String[] args) {
		
		int[] a = new int[] {5, 10, 15, 20, 25, 30} ;
		int n = a.length;
		
		int key = 20;
		
		int idx = binaryMethod(a, n, key);
		
		System.out.println(idx+1+" 번째 있습니다.");
	}

	private static int binaryMethod(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		while(pl<=pr) {
			int pc = (pr+pl)/2;
			if(a[pc]==key) {
				return pc;
			}else if(a[pc]<key) {
				pl = pc + 1;
			}else {
				pr = pc - 1;
			}
		}
		
		
		return -1;
	}



}
