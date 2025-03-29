package 저자출제.요세푸스;

import java.util.ArrayDeque;
import java.util.Queue;

public class _0220_1 {

    public static int solution(int N, int K){
        int num=0;
    //N명의 사람이 원형으로 서있다. 1부터 N가지 번호표를 가지고있다 => 원형 큐
    //임의의 숫자 K가 주어졌을 때
    //1번 번호표를 가진 사람을 기준으로 K번째 사람을 없앤다.
    //없앤사람 다음사람을 기준으로 하고 다시 K번째 사람을 없앤다.
    //마지막에 살아있는 사람의 번호를 구하시오

        //큐 선언 후 번호 부여
        Queue<Integer> queue = new ArrayDeque<>();
        for(int i=0;i<N;i++){
            queue.add(i+1);
        }

//        while(queue.size()>1) { //요소가 하나 남을때까지 반복
//            if () { //K번째 요소를 삭제
//                queue.poll();
//                //poll된 다음번호를 기준으로 설정
//
//            }
//        }


        //원형 큐로 구현하려면



        return num;
    }
}
