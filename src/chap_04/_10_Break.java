package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break
        // 치킨 집에서 매일 20마리만 판매 (1인당 1마리만 구매 가능)
        // 손님이 50명 대기

        // For 문
        int max = 20; // 오늘 준비된 재료의 수
        for (int i = 1; i <= 50; i++) { // i(손님) 1 명 ~ 최대 50명이 반복할 때까지 반복)
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if (i == max) { // 손님 1명당 치킨이 1마리 주문 할 경우  손님 수와 치킨의 max 값이 같을경우
                System.out.println("금일 재료가 모두 소진되었습니다."); // 문장을 실행 후
                break; // 재료와 손님 수가 같으므로 더이상 판매 불가하여, 반복문 탈출 (반복문 종료)
            }// 50번 반복문 수행을 하려고 했지만, if 문의 조건을 만족하고 break 를 사용하여 반복문 탈출
        }
        System.out.println("영업을 종료합니다.");


        System.out.println("---------------------------------------");


        // While 문
        int index = 1; // 손님 대기 번호
        while (index <= 50) { // 손님 대기 번호가  50번보다 작거나 같을 때까지 반복
            System.out.println(index + "번 손님, 주문하신 치킨 나왔습니다.");
            if (index == max) { // 손님 대기 번호와 치킨 재료의 수가 같다면 아래 문장 수행
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break; // if의 조건을 만족하여 위의 문장을 수행 후 break 를 만나서 반복문 종료
            }
            index++; // while 문의 조건에는 for 문 처럼 증감이 없기 때문에 따로 + 1 을 설정함
        }
        System.out.println("영업을 종료합니다.");
    }
}
