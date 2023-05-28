public class GemIncreasement {

    public int solution(int n, int t){
        int answer = 0;

        //자바에서는 제곱 사용시 한 변수 또는 숫자를 계쏙 곱하거나 Math.pow()를 사용함.
        double sq = Math.pow(2, t);
        int square = (int) sq;

        answer = n * square;

        return answer;
    }
}
