package chap_06;
// 메서드가 필요한 이유

public class _06_WhenToUse {
    // 숫자를 받아서 2제곱 (자기 자신을 한 번 곱함)을 계산해주는 메서드
    public static int getPower(int number) {
        //int result = number * number;
        //return result;
        //return number * number;
        // 실제 제곱 계산은 아래 getPower(number, exponent) 메서드에 위임
        return getPower(number, 2); // 메서드 내에서도 다른 메서드를 호출 할 수 있음
    }

    // 숫자와 지수 값을 받아서 거듭제곱 결과를 계산하는 메서드
    public static int getPower(int number, int exponent) {
        int result = 1; // 계산 결과를 담을 변수, 초기값 1
        for (int i = 0; i < exponent; i++) { // exponent 횟수만큼 반복
            result *= number; // result 에 number 를 곱해서 누적 저장
        }
        return result; // 최종 계산된 값 반환
    }

    public static void main(String[] args) {

//        // 2의 2승을 구하기
//        int result = 1;
//        for (int i = 1; i <= 2; i++) {
//            result *= 2;
//        }
        System.out.println(getPower(2, 2)); // 2 * 2 = 4

        // 3의 3승 구하기
//        result = 1;
//        for (int i = 1; i <= 3; i++) {
//            result *= 3;
//        }
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27

        // 4 의 2승을 구하기
//        result = 1;
//        for (int i = 1; i <= 2; i++) {
//            result *= 4;
//        }
        System.out.println(getPower(4, 2)); // 4 * 4 = 16
    }
}
