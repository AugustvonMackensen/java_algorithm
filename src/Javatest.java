import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Javatest {

    public int[] solution(String today, String[] terms, String[] privacies) throws ParseException {
        int[] answer = {};

        SimpleDateFormat dt = new SimpleDateFormat("yyyy.MM.dd");
        Date eday = dt.parse(today);


        //앞 글자는 유효기간, 뒤에 숫자는 보관 달수
        StringBuilder sb = new StringBuilder();
        StringBuilder prd = new StringBuilder();


        for(int i=0; i< terms.length; i++){
            if(!terms[i].equals("")){
                char code = terms[i].charAt(0);

            }
        }


        return answer;
    }

}
