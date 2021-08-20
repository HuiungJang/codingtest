package sort;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DupleArr {
    public static int[] solution(int[] arr) {
        /*
            파라미터로 받은 배열을 정렬한다.
            같은 값이 있으면 0으로 변환
            배열에 0을 전부 삭제
            그리고 리턴
         */

        Arrays.sort(arr); // 배열 정렬하기 오름차순

        int ref = 0; // 기준 값

        // 값이 같으면 0으로 변환하는 로직
        for(int i=0; i<arr.length; i++){
            ref=arr[i];
            // 기준 다음 숫자부터 끝까지 반복
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j] || arr[i]==arr[j-1]){
                    // i 번째와 i+1 번째가 같다면 또는 i와 i-1번째가 같다면
                    if(arr[j]==ref ){ // 0으로 변환
                       arr[i]=0;
                       arr[j]=0;
                    }
                }
            }
        }

        // 변환된 배열을 List 로 변환
        List<Integer> tmp = new ArrayList<>();
        for(int a : arr){
            tmp.add(a);
        }

        // 0이 있으면 삭제
        while(tmp.contains(0)){
            for(int i=0; i<tmp.size(); i++){
                if(tmp.get(i)==0){
                    tmp.remove(tmp.get(i));
                }
            }
        }

        // 중복됐던 값과 0을 지운 값을 새로운 배열에 담아서 리턴.
        int[] result = new int[tmp.size()];

        // 중복되지 않은 값이 없다면 = 전부 중복이라면
        if(tmp.size()==0){
            result[0]=-1;
        }
        // 값을 int형 배열에 넣어서 리턴
        for(int i=0; i<tmp.size(); i++){
            result[i] = tmp.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,1,1,2,5,5,7,5,5,3,7};

        for(Object i :solution(arr)) {
            System.out.println(i);
        }
    }
}
