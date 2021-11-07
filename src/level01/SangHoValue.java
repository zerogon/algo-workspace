package level01;

public class SangHoValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *  [ 
 *    [100,90,98,88,65],
 *    [50,45,99,85,77],
 *    [47,88,95,80,67],
 *    [61,57,100,80,65],
 *    [24,90,94,75,65]
 *  ]	"FBABD"
	[[50,90],[50,87]]	"DA"
	[[70,49,90],[68,50,38],[73,31,100]]	"CFD"
 * 
 * 
 * */
	}

}

class Test2{
	public String solution(int[][] scores) {
        
        // 1. 자신의 평가한 부분을 제외한 합을 구하기.
        // 2. 평가받은 점수중에 최대값과 최소값을 구하여 자신의 평가점수랑 비교하기.
        // 3. 
        // 4. 평균점수에 따른 학점 나누기
        
        String answer = "";
        int n = scores.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            double avg = 0;
            int min = -1;
            int max = 101;

            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
                sum += scores[j][i];
            }

            if (scores[i][i] > max || scores[i][i] < min) {
                avg = (double) sum / (n - 1);
            } else {

                avg = (double) (sum + scores[i][i]) / n;
            }

        }
        answer = sb.toString();
        return answer;
    }
}
