import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CutArray {
    public int[] solution(int[] numbers, int num1, int num2){

        int[] answer = {};

        ArrayList<Integer> ilist = new ArrayList<>();
        for(int i=num1; i <= num2; i++){
            ilist.add(numbers[i]);
        }

        answer = ilist.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
