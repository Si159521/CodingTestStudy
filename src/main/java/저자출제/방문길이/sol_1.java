//package 저자출제.방문길이;
//
//public class sol_1 {
//    public static void main(String[] args) {
//        //10진수를 입력받아 2진수로 변환하여 반환하는 solution
//        int input = 27;
//        String result = solution(input);
//
//        //tc : 10, 27,12345
//        //=> 1010,11011, 11000000111001
//    }
//
//    public String solution(int input){
//        int answer =0;
//        //2의 n승 중에서 input보다 작은 수끼리 모아놓고 합이 input이 되는 수들을 찾기
//        //ex. input=27 => 16, 8, 4, 2, 1 => 16+8+2+1 => 1 1 0 1 1
//        //는 너무 인간의 관점으로 생각했다
//        //input을 2로 더이상 나눌 수 없을때까지 나누어 나머지를 기록하는 방식으로 찾기
//
//        int[] aa = new int[20];
//        int i,j=0;
//        for(i=0;input!=0;i++){
//            aa[i]=input%2;	//나머지 값을 배열에 저장
//            input=input/2;
//        }
//        //그 나머지를 거꾸로 나열한것이 input의 이진법 숫자
//        for(j=i-1;j>=0;j--){	//배열의 값을 마지막요소(i-1)부터 0까지 거꾸로 출력
//            System.out.print(aa[j]);
//        }
//    }
//}
