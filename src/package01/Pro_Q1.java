package package01;

public class Pro_Q1 {
	public static void main(String[] args) {
		/*
		    String�� �迭 seoul�� element�� "Kim"�� ��ġ x�� ã��, 
		    "�輭���� x�� �ִ�"�� String�� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���. 
		    seoul�� "Kim"�� ���� �� ���� ��Ÿ���� �߸��� ���� �ԷµǴ� ���� �����ϴ�.

			���� ����
			seoul�� ���� 1 �̻�, 1000 ������ �迭�Դϴ�.
			seoul�� ���Ҵ� ���� 1 �̻�, 20 ������ ���ڿ��Դϴ�.
			"Kim"�� �ݵ�� seoul �ȿ� ���ԵǾ� �ֽ��ϴ�.
		 */
		Solution s = new Solution();
		String [] inputs = {"Jane", "Kim"};
		String answer = s.solution(inputs);
		System.out.println(answer);
		
	}
}


class Solution {
    public String solution(String[] seoul) {
        String answer = "";
		String matchString = "Kim";
		for(int i = 0 ; i < seoul.length; i ++) {
			if(seoul[i].equals(matchString)){
				answer = "�輭���� "+i+"�� �ִ�";
			}
		}
        return answer;
    }
}