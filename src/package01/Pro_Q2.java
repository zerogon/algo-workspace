package package01;

public class Pro_Q2 {
	public static void main(String[] args) {
		Solution1 s = new Solution1();
		int[] tmp = s.solution(12345);
		for(int a : tmp) {
			System.out.println(a);
		}
	}
}
class Solution1 {
    public int[] solution(long n) {
    	// 12345 > 5, 4, 3, 2, 1
    	int[] answer = {};
    	
    	// ��Ʈ�������� ������ ��´�
    	StringBuilder sb = new StringBuilder(Long.toString(n));
    	// ������ ��Ų��.
    	sb.reverse();
    	// ���� ����
    	String answerString = sb.toString();
    	answer = new int[answerString.length()];
    	for(int i = 0 ; i < answerString.length(); i ++) {
    		answer[i] = answerString.charAt(i)-'0';
    	}
        return answer;
    }
}