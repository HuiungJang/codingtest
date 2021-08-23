package stack_queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
    프린터 문제

    1. 큐에 넣고
    2. 우선순위 순으로 정렬하고
    3. 높은 우선 순위 출력하고 갯수 +1
 */
class PrinterSolution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : priorities) {
            que.offer(a);
        }

        while (!que.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (que.peek() == priorities[i]) {
                    que.poll();
                    answer++;
                    if (location == i) {
                        que.clear();
                        break;
                    }
                }
            }
        }

        return answer;
    }
}

public class Printer {
    public static void main(String[] args) {
        PrinterSolution s = new PrinterSolution();
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(s.solution(priorities, location));

    }
}
