public class MultiMax {

    public int solution(int[] numbers){
        //두 곱이 최대가 나오게 하는 방법 -> 최대인 수와 두번째로 큰 수를 곱한다.
        int answer = 0;
        int max = 0;
        int second = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        for(int j=0; j < numbers.length; j++){
            if(numbers[j] < max && numbers[j] > second){
                second = numbers[j];
            }
        }
        System.out.println("max : " + max);
        System.out.println("second : " + second);

        answer = max * second;



        return answer;
    }
}
