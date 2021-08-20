package sort;

import java.util.Arrays;

/*
k 번째 수
commands 0,1 인덱스 기준으로 배열 쪼개고
정렬한 다음
거기서 commands 2번 인덱스(~번째 수)를 사용해서 값을 가져오자
 */
public class KNum {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i< commands.length; i++){
            int[] tmp = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(tmp);

            answer[i]= tmp[commands[i][2]-1];
        }

        return answer;
    }


    public static void main(String[] args) {
        int[] test1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] test2={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(solution(test1,test2));
    }
}
