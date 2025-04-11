package chap_06;


public class _04_ParameterAndReturn {
    // 전달값과 반환값이 있는 메소드
    // 이 메서드는 전달받은 숫자를 제곱하여 결과를 반환함
    public static int getPower(int number) {
        int result = number * number; // 전달받은 number 를 자기 자신과 곱해서 result 에 저장
        return result; // 계산된 result 값을 메서드 밖으로 반환
        //return number * number;
    }

    // 이 메서드는 전달받은 숫자를 제곱하여 결과를 반환함
    public static int getPowerByExp(int number, int exponent) {
        // 곱셈 결과를 저장할 변수, 초기값은 1
        int result = 1;
        // exponent 횟수만큼 반복하면서 number를 계속 곱함
        for (int i = 1; i <= exponent; i++) {
            result *= number; // result 에 number 를 곱해서 누적 저장
        }
        return result; // 최종 계산된 거듭제곱 값을 반환
    }

    public static void main(String[] args) {

        // getPower(2)의 결과를 retVal 에 저장 (2 * 2 = 4)
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4;

        retVal = getPower(3);
        System.out.println(retVal); // 3 * 3 = 9;

        retVal = getPowerByExp(3, 3);
        System.out.println(retVal); // 3 * 3 * 3 = 27

        System.out.println(getPowerByExp(2, 4));

        System.out.println(getPower(5));
    }
}
