//package lv2.실패율;
//
//import java.util.*;
//
//public class ans01 {
//    public static void main(String[] args) {
//        //스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수 / 스테이지에 도달한 플레이어 수
//        //스테이지에 도달한 사람들을 먼저 추려내고
//        //(그 중에) 클리어실패 플레이어 수를 전체 플레이어 수로 나누기 = 실패율
//
//        //실패율이 같은 스테이지 -> 작은 번호의 스테이지가 먼저 오도록
//        //스테이지에 도달한 유저가 없는경우 : 실패율 0
//
//        //실패율 계산
//        //현재 도달한 스테이지 = (현재 있는 스테이지)-1만큼 깼다(현재 있는 스테이지는 못깼다)
//        //각 스테이지의 실패율을 담은 배열
//        //전체 플레이어 수 : stages 배열의 요소들의 합
//
//        int [] answer = {2, 1, 2, 6, 2, 4, 3, 3};
//        answer = solution(5, answer);
//
////        for(int i=0;i<answer.length;i++){
////            System.out.print(answer[i] +" ");
//        }
//    }
//    public static int[] solution(int N, int[] stages){
//        //실패율 계산
//        //현재 도달한 스테이지 = (현재 있는 스테이지)-1만큼 깼다(현재 있는 스테이지는 못깼다)
//        //각 스테이지의 실패율을 담은 배열
//        //전체 플레이어 수 : stages 배열의 요소들의 합
//
//        int sum=0; //전체 플레이어 수
//        for(int i=0;i<stages.length;i++){
//            sum+=stages[i];
//        }
//        int[] failure = new int[stages.length];
//
//        for(int i=0;i<stages.length;i++){
//            if(stages[i]==0){  //스테이지에 도달한 유저가 없는경우
//                failure[i]=0; //실패율 0
//            }
//
//            //실패율=현재 스테이지에 머무르는 사람 / 현재 스테이지에 머무르는 사람+깬사람
//            //깬사람 = 전체인간-(stages[i+1]부터 끝까지)
//            int solved=0;
//            for(int j=i;j<stages.length;j++){
//                solved+=stages[j];
//            }
//            failure[i]=stages[i]/(stages[i]+sum-solved);
//        }
//
//        //스테이지-실패율 -> 키-값으로 저장 -> 해시맵
//        Map<Integer, Integer> sortedStages= new HashMap();
//        for(int i=0;i<stages.length;i++){
//            sortedStages.put(i+1,failure[i]);
//        }
//
//        //실패율이 높은 스테이지부터 내림차순으로 스테이지번호 출력
//        //comparator 인터페이스를 활용하여 value를 기준으로 내림차순으로 정렬
//        List<Map.Entry<String, Integer>> sortedList = new LinkedList<>(map.entrySet());
//        sortedList.sort(new Comparator<Map.Entry<Integer, Integer>>() {
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2)              {
//                return o2.getValue() - o1.getValue();
//            }
//        });
//
//        //구현못한부분
//        //실패율이 같은 스테이지 -> 작은 번호의 스테이지가 먼저 오도록
//        //value값이 같은 스테이지는 오름차순으로 정렬
//
//        return sortedList;
//    }
//}
//
//public void main() {
//}
//
