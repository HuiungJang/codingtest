'use strict';

function solution(array, commands) {
  const answer = [];

  for (let i = 0; i < commands.length; i++) {
    // 배열을 자르고 정렬
    const ary = array.slice(commands[i][0] - 1, commands[i][1]).sort((a, b) => a - b);

    // commands i번째 2번 인덱스 값은 *번째 수니까 거기서 -1해야 원하는 인덱스 가능
    answer.push(ary[commands[i][2] - 1]);
  }

  return answer;
}

console.log(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]));