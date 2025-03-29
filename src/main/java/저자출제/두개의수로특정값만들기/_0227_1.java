package 저자출제.두개의수로특정값만들기;

import java.util.*;

public class _0227_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8};
        int target=6;
        //입출력 예
        //arr:[1,2,3,4,8], target:6, return:true
        //arr:[2,3,5,9[, target:10, return:false
        System.out.println(solution(arr, target));
    }
    public static Boolean solution(int[] arr, int target){
        Boolean result;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        //모든 계산 결과를 hashmap에 저장하면서 이게 target과 같은 수인지 검사 후 value를 true/false로 저장
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];

                if(sum==target){
                    hashMap.put(sum, true);
                }else{
                    hashMap.put(sum, false);
                }
            }
        }



        if(hashMap.containsKey(target)){
            return true;
        }else{
            return false;
        }
    }
}
