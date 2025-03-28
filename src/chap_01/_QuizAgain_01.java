package chap_01;
 /*
    문제
    버스 도착정보를 출력하는 프로그램을 작성하시오.
    각 정보는 적절한 자료형의 변수에 정의합니다.

    정보
    * 버스 번호는 "1234", "상암08" 과 같은 형태
    * 남은 시간은 분 단위 (예: 3분, 5분)
    * 남은 거리는 km 단위 (예: 1.5km, 0.8km)

    실행 결과
    상암08번 버스
    약 3분 후 도착
    남은 거리 1.5km
    */

public class _QuizAgain_01 {
    public static void main(String[] args) {

        // 버스 번호
        int busNum = 1234;

        // 남은 시간
        int minute = 5;

        // 남은 거리
        double distance = 0.8;

        System.out.println("상암" + busNum + "번 버스");
        System.out.println("약 " + minute + "분 후 도착");
        System.out.println("남은 거리 " + distance + "km");
    }
}
