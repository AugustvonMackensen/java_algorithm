public class Median {
    public int solution(int[] array){
        int answer = 0;

        //배열의 길이를 구한다.
        float length = array.length;

        //중앙값 : 2로 나눴을 때 위치 -> 소수점으로 떵어지면 반올림함.
        float median = length / 2;

        int pos = Math.round(median);

        answer = array[pos - 1];


        return answer;
    }
}
