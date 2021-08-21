package normally;

import java.util.ArrayList;
import java.util.List;

class Solution{
    public List<Integer> solution(){
        int firstN=1;
        int secondN=2;
        int result=0;
        int count = 0;

        List<Integer> answer = new ArrayList<>();

        while(count<=10){
            answer.add(result);
            answer.add(firstN);
            answer.add(secondN);

            result=firstN+secondN;
            firstN=secondN+result;
            secondN= result+firstN;

            count++;
        }


        return answer;
    }
}

public class Pivonachi {

    public static void main(String[] args) {
        Solution s = new Solution();

        for(Object a : s.solution()) {
            System.out.println(a);
        }
    }
}
