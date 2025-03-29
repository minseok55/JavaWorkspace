package chap_02;

/*
    문제
    어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오

    조건
    * 키가 120 cm 이상인 경우에만 탑승 가능
    * 삼항 연산자 이용

    실행결과
    키가 115 이므로 탑승 불가능 합니다.
    키가 121 이므로 탑승 가능 합니다.
    */

public class _QuizAgain_02 {
    public static void main(String[] args) {
        int height = 120; // 키 기준
        int a = 130; // 어린이 키
        String result = (a >= height) ? "탑승 가능합니다." : "탑승 불가능합니다";
        //어린이 키가 기준보다 크기 때문에 : 왼쪽 "탑승 가능합니다" 변수 b에 입력 됨
        System.out.println("키가 " + a + "cm 이므로 " + result);

        // 해설
//        int hight = 115;
//        String result = (조건) ? (참) : (거짓);
//        System.out.println("키가 " + "cm 이므로" + result);
    }
}
