package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 손님이 노쇼
        for (int i = 1; i <= 50; i++) { // 손님 최대 50명 방문
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");

            // 치킨을 가져가야 하지만
            // 손님이 없다면? (noShow)
            if (i == noShow) { // 손님 번호와 노쇼 손님 순서가 같다면 아래의 문장 수행
                System.out.println(i + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; // 만나는 순간 이하의 모든 코드는 수행하지 않고 다음 증감으로 넘어감
            }
            sold++; // 판매 처리 (판매 수량 업데이트)
            if (sold == max) { // 판매된 치킨의 수가 최대 치킨 판매 수량과 같으면
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; //  break 를 통해서 반복문 탈출
            }
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("-----------------------------------------");

        // While 문
        sold = 0; // 치킨 판매 수량 초기화
        int index = 0; // 손님 번호
//        while (index <= 50) {
        while (true) { // 무한 반복 이지만 특정 조건의 break 를 만나면 탈출
            index++;
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");

            // 손님이 없다면 (noShow)
            if (index == noShow) { // 손님 순서와 노쇼 손님의 번호가 같을 경우
                System.out.println(index + "번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
//                index++;  // continue 를 만나면 아래 문장을 수행 하기 않기 때문에 추가
                // while 문에서는 증감 확인 없이 넘어가고 조건 확인하기 때문에
                continue;
            }

            sold++; // 판매처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다");
                break;
            }
//            index++; // for 문의 증감 처럼 while 에서 직접 증감
        }
        System.out.println("영업을 종료합니다.");
    }
}
