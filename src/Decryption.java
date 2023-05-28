public class Decryption {

    public String solution(String cipher, int code){
        String answer ="";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i < cipher.length(); i++){
            int idx = i +1;
            if(idx % code == 0 ){
                sb.append(cipher.charAt(i));
            }
        }

        answer = sb.toString();
        return answer;
    }
}
