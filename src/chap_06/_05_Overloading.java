package chap_06;

// 메서드 오버로딩 (overloading)을 설명하는 예제
public class _05_Overloading {

    // 정수 하나를 받아서 제곱값을 반환하는 메서드
    public static int getPower(int number) {
        int result = number * number; // number 를 자기 자신과 곱함
        return result; // 계산 결과를 반환
        //return number * number;
    }

    // 문자열로 받은 숫자를 정수로 변환 후 제곱값을 반환하는 메서드
    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber); // 문자열을 정수로 변환
        return number * number; // 변환된 숫자의 제곱값 반환
    }

    // 정수와 지수 값을 받아서 거듭제곱 결과를 반환하는 메서드
    public static int getPower(int number, int exponent) {
        int result = 1; // 결과를 저장할 변수 초기화
        for (int i = 1; i <= exponent; i++) { // exponent 만큼 반복
            result *= number; // result 에 number 를 누적 곱함
        }
        return result; // 최종 결과 반환
    }

    public static void main(String[] args) {
        // 메서드 오버로딩
        // 같은 이름의 메소드를 여러번 선언 * 같은 이름 (getPower) 이지만 매개변수의 형태나 개수가 다름
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 반환형이 다를 경우는 메서드오버로딩X
        getPower(3);

        // 정수 하나를 전달 (int) -> getPower(int number) 호출
        System.out.println(getPower(3)); // 3 * 3 = 9
        // 문자열을 전달 (String) -> getPower(String strNumber) 호출
        System.out.println(getPower("4")); // "4" -> 4 -> 4 * 4 == 16
        // 정수 두개를 전달 (int, int) -> getPower(int number, int exponent) 호출
        System.out.println(getPower(3, 3)); // 3 * 3 * 3 = 27
    }
}
