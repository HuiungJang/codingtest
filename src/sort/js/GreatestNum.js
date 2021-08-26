'use strict';

function solution(numbers) {
  // 인수를 문자형 배열로 치환
  const numberToStringArr = [];
  numbers.forEach(e => {
    e = e + '';
    numberToStringArr.push(e);
  });

  // 배열 정렬
  numberToStringArr.sort((a, b) => a + b > b + a ? -1 : 1);

  if (numberToStringArr.indexOf('0') === 0) {
    // 제일 큰 수가 0이면 0을 반환
    return '0';
  } else {
    // 문자열 다 더해서 리턴
    return numberToStringArr.reduce((a, c) => a + c);
  }

}

console.log(solution([3, 30, 34, 5, 9]));