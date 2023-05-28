import java.util.ArrayList;

public class PairCrypto {

    public String solution(String s, String skip, int index){
        String answer = "";

        StringBuilder sb = new StringBuilder();

        ArrayList<Character> clist = new ArrayList<>();

        char[] carray = s.toCharArray();
        char[] skiparray = skip.toCharArray();

        for(int i=0; i < carray.length; i++){
            for(int j=0; j < skiparray.length; j++){
                if(carray[i] == skiparray[j]){

                }
                    int lIndex = carray[i] + index;
            }


        }

        for(int ch=61; ch <= 79; ch++){


        }

        return answer;
    }
}
