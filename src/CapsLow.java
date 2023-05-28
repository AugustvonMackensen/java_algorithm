public class CapsLow {
    public String solution(String my_string) {
        String answer = "";
        String letter = "";
        StringBuilder sb = new StringBuilder();

        for(int i=0; i < my_string.length(); i++){
            char ch = my_string.charAt(i);
            //대소문자 체크하는 함수
           if(Character.isLowerCase(ch)){
               letter = String.valueOf(ch).toUpperCase();
           } else {
               letter = String.valueOf(ch).toLowerCase();
           }

           sb.append(letter);
        }

        answer = sb.toString();


        return answer;
    }
}
