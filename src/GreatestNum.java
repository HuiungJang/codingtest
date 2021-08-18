import java.util.Arrays;
import java.util.Comparator;
/*
  가장 큰 수
  배열을 문자형으로 변환 후 합쳐서 내보내자

*/
class GreatestNum{

    public static String solution(int[] numbers) {

        String answer = "";
        // 문자형 배열
        String[] strArr=  new String[numbers.length];

        // 정수형 배열로 변환
        for(int i=0; i< numbers.length; i++){
            strArr[i] = Integer.toString(numbers[i]);
        }

        // 내림차순 정렬
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });

        // 0인경우
        if(strArr[0].equals("0")) return "0";

        for(String r : strArr){
            answer += r;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] t1 = {3,123,9};

        System.out.print(solution(t1));
    }
}







