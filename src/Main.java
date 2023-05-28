import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //프로그래머스 암호해독
        Decryption decryption = new Decryption();
        String answer = decryption.solution("dfjardstddetckdaccccdegk", 4);
        System.out.println(answer);


        //cut array
        CutArray cutArray = new CutArray();
        System.out.println(Arrays.toString(cutArray.solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));

        //Caps and Lows
        CapsLow cap = new CapsLow();
        System.out.println(cap.solution("abCdEfghIJ"));

        //Gems
        GemIncreasement gi = new GemIncreasement();
        System.out.println(gi.solution(7, 15));

        //Multi-Max
        MultiMax max = new MultiMax();
        System.out.println(max.solution(new int[]{0, 31, 24, 10, 1, 9}));

        //Login
        LoginSuccess login = new LoginSuccess();
        System.out.println(login.solution(new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(login.solution(new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));
        System.out.println(login.solution(new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));

        //HateEng
        HateEng he = new HateEng();
        System.out.println(he.solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(he.solution("onefourzerosixseven"));

        //중앙값
        Median median = new Median();
        System.out.println(median.solution(new int[]{9, -1, 0}));
    }
}
