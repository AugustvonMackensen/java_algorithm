public class HateEng {
    public long solution(String numbers){

        long answer = 0;
        String[] num = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        String number = "";

        String longNum = "";

        for(int i=0; i < numbers.length(); i++){
            char ch = numbers.charAt(i);
            sb.append(ch);

            number = sb.toString();
            for(int j=0; j < num.length; j++){
                String numStr = num[j];
                if(number.equals(numStr)){
                    switch (numStr){
                        case "zero":
                            longNum = "0";
                            break;
                        case "one":
                            longNum = "1";
                            break;
                        case "two":
                            longNum = "2";
                            break;
                        case "three":
                            longNum = "3";
                            break;
                        case "four":
                            longNum = "4";
                            break;
                        case "five":
                            longNum = "5";
                            break;
                        case "six":
                            longNum = "6";
                            break;
                        case "seven":
                            longNum = "7";
                            break;
                        case "eight":
                            longNum = "8";
                            break;
                        case "nine":
                            longNum = "9";
                            break;
                    }


                    sb.setLength(0);
//                    sb.delete(0, sb.length());
                    sb2.append(longNum);
                }
            }

        }

        answer = Long.parseLong(sb2.toString());

        return answer;
    }
}
