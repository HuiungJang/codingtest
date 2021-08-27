'use strict';

function solution(citations) {
  let answer = 0;
  // js의 sort는 유니코드 순으로 정렬한다.
  // 정렬순서를 정하려면 따로 파라미터를 비교해서 정렬해줘야한다.
  citations.sort((a, b) => {
    return a - b;
  });

  for (let i = 0; i < citations.length; i++) {
    if (citations[i] >= citations.length - i) {
      answer = citations.length - i;
      break;
    }
  }
  return answer;
}

console.log(solution([3, 0, 6, 1, 5, 45, 12]));