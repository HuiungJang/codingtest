import java.util.Arrays;
/*
H index
오름차순으로 정렬 후
citations 배열의 인자와 배열길이를 비교
 */
public class Hindex {

    public static int solution(int[] citations) {
        int answer = 0;

        // 오름차순으로 정렬
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++){
            if( citations[i] >= citations.length-i ){
                answer = citations.length-i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] test = {3, 0, 6, 1, 5, 45, 12};

        System.out.println(solution(test));
    }
}
