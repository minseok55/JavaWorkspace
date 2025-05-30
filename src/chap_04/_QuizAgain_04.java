package chap_04;

/*
조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오

조건
- 주차 요금은 시간당 4000원 (일일 최대 요금은 30000원)
- 경차 또는 장애인 차량은 최종 요금에서 50% 할인
    * 장애인 차량 : 직접 운전 또는 탑승 모두 포함

주차요금 예시
- 일반차량 5시간 주차 시 20000원
- 경차 5시간 주차 시 10000원
- 장애인 차량 10시간 주차 시 15000원

실행결과

- 일반 차량 5시간 주차 시 20000원
    주차 요금은 20000원 입니다.
- 경차 5시간 주차 시 10000원
    주차 요금은 10000원 입니다.
- 장애인 차량 10시간 주차 시 15000원 입니다.

// 최종결과 주차 요금은 XX 원입니다.
*/
public class _QuizAgain_04 {
    public static void main(String[] args) {
        int hour = 2; // 주차시간
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 시간 * 시간당 요금  = 총 주차요금

        if (fee > 30000) { // 총 주차요금 보다 일일 최대 요금 30000원이 클경우
            fee = 30000; // 일일 최대 요금 30000원으로 설정
        }
        if (isSmallCar || withDisabledPerson) { // 경차거나 장애인 차량이 일경우
            fee /= 2; // 총 주차요금에서 50% 할인
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");

    }
}
