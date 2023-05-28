public class LoginSuccess {
    public String solution(String[] idpw, String[][] db){
        String answer = "";

        String id = idpw[0];
        String pw = idpw[1];

        for(String[] data: db){
            if(!data[0].equals(id)){
                answer = "fail";
            } else if(!data[1].equals(pw)){
                answer = "wrong pw";
            } else {
                answer = "login";
            }
        }
        return answer;

    }
}
