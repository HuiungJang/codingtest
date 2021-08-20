package hash;

import java.util.Arrays;
/*
    마라톤 완주 못한 사람 찾기
    
    배열을 정렬한다
    정렬하면 참가자와 완주자는 1대1로 매칭되고
    완주 못한 사람은 항상 1명이니까 참가자 배열 끝에 남음
    그러면 오류 발생시키고 참가자 배열 제일 끝에 있는 사람 리턴하면 끝
 */
public class NotCompletionMarathon {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<participant.length; i++){
            try{
                if(!participant[i].equals(completion[i])){
                    return participant[i];
                }
            }catch (IndexOutOfBoundsException e){
                return participant[participant.length-1];
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant,completion));
    }
}