package chap_06;

public class _02_Parameter {
    // method = 자판기, parameter = 자판기에 넣는 버튼 정보
    // parameter = 메서드야 이걸로 일좀 해줘! 하는 값
    // parameter 메서드가 동작할 때 필요한 정보를 외부에서 넘겨주는 것
    // parameter = 매개변수

    // 전달값이 있는 메소드
    public static void power(int number) { // Parameter , 매개변수
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void powerByExp(int number, int exponent) { // 2개이상 의 경우
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number; // result = result * number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 거듭제곱 계산 메서드
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수
        power(2); // 2 * 2 = 4
        power(3); // 3 * 3 = 9

        powerByExp(2, 3); // 2 * 2 * 2 = 8
        powerByExp(3, 3); // 3 * 3 * 3 = 27
        powerByExp(10, 0); // 1 // 어떤 수의 0승은 항상 1이 됨
    }
}