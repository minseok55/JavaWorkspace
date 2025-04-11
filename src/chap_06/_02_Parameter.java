package chap_06;

public class _02_Parameter {
    // method = 자판기, parameter = 자판기에 넣는 버튼 정보
    // parameter = 메서드야 이걸로 일좀 해줘! 하는 값
    // parameter = 매개변수
    // parameter = 메서드가 동작할 때 필요한 정보를 외부에서 받아오는 값 (매개변수)

    // 전달값이 있는 메서드
    // 숫자 하나를 받아서 제곱값을 출력하는 메서드
    public static void power(int number) { // Parameter , 매개변수
        int result = number * number; // number를 자기 자신과 곱함 (제곱 계산)
        System.out.println(number + " 의 2 승은 " + result); // 결과 출력
    }

    // 숫자 두 개를 받아서 거듭제곱 결과를 출력하는 메서드
    public static void powerByExp(int number, int exponent) { // 2개이상 의 경우
        // 결과를 저장할 변수, 처음엔 1로 시작
        int result = 1;
        for (int i = 0; i < exponent; i++) { // exponent 횟수만큼 반복
            result *= number; // result = result * number; 누적 곱셈
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 거듭제곱 계산 메서드
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9
        // 전달값(Argument)을 넣어 메서드를 호출함

        // Argument, 인수
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9
        power(2); // 2의 제곱 출력 -> 4
        power(3); // 3의 제곱 출력 -> 9

        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3); // 3 * 3 * 3 = 27
        powerByExp(10, 0); // 1 // 어떤 수의 0승은 항상 1이 됨
        powerByExp(2, 3); // 2^3 = 8 출력
        powerByExp(3, 3); // 3^3 = 27 출력
        powerByExp(10, 0); // 10^0 = 1 출력 (어떤 수든 0승은 1)
    }
}