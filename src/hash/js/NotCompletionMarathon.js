'use strict';

/*
프로그래머스 완주하지 못한 선수
 */

function solution(participant, completion) {
  participant.sort();
  completion.sort();

  for (let i = 0; i < participant.length; i++) {
    try {
      if (participant[i] !== completion[i]) {
        return participant[i];
      }
    } catch (e) {
      return participant[participant.length - 1];
    }
  }
}


console.log(solution(["marina", "josipa", "nikola", "vinko", "filipa"], ["josipa", "filipa", "marina", "nikola"]));

