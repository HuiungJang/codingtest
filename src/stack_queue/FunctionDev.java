package stack_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 프로그래머스 스택/큐 기능개발문제

 */
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<>();
        // 작업에 걸리는 일수 구하기
        int[] days = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            for (int j = 1; j <= 100; j++) {
                if (progresses[i] + speeds[i] * j >= 100) {
                    days[i] = j;
                    // 큐에 걸리는 작업일수 넣기
                    q.add(days[i]);
                    break;
                }
            }
        }

        while (!q.isEmpty()) {
            int day = q.poll(); // 작업일 가져오고 큐에서 첫번째 제거
            int count = 1;

            // i 번째가 i+1번째보다크면
            while (!q.isEmpty() && day >= q.peek()) {
                count++;
                q.poll(); // i+1번째 값 제거
            }

            answer.add(count);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

public class FunctionDev {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        for (int a : s.solution(progresses, speeds)) {
            System.out.println(a);
        }
    }
}
