package hash;


import java.util.Arrays;

class Solution{
    public boolean solution(String[] phone_book) {
        // 첫번째 풀이
        // Map 사용해서 풀기

//        Map<String,Integer> map = new HashMap<>();
//        for(int i=0; i<phoneBook.length; i++){
//            map.put(phoneBook[i],i);
//        }
//
//        for(int i=0; i<map.size();i++){
//            for(int j=1; j<phoneBook[i].length(); j++){
//                if(map.containsKey(phoneBook[i].substring(0,j))){
//                    return false;
//                }
//            }
//        }
//        return ture;

        // 두번쨰 풀이
        // 정렬이용해서 풀기
        
        // 정렬하고
        Arrays.sort(phone_book);

        // 정렬된 배열에서 i+1 번째가 i 번째로 시작하면 끝
        for(int i=0; i<phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                return false;
            }
        }

        return true;
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] phone_book = {"119", "97674223", "1195524421"};
        System.out.println(s.solution(phone_book));
    }
}
