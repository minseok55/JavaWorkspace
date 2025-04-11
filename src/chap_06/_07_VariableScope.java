package chap_06;

public class _07_VariableScope {
    // methodA: 전달받은 number 변수만 사용할 수 있음
    public static void methodA(int number) {
        // System.out.println(number); // number 는 매개변수이므로 사용 가능
        // System.out.println(result); // result 는 이 메서드 안에 선언되지 않았기 때문에 에러
    }

    // methodB: 내부에서 선언된 지역 변수만 사용할 수 있음
    public static void methodB() {
        int result = 1; // 지역 변수: 이 methodB 블럭 안에서만 유효함
    }

    // main 메서드: 프로그램의 시작점
    public static void main(String[] args) {
        int number = 3; // 지역 변수: main 메서드 안에서만 사용 가능

        // System.out.println(result); // result 는 main 안에 선언되지 않았기 때문에 에러

        // 반복문 내부에서만 사용할 수 있는 변수 i
        for (int i = 0; i < 5; i++) {
            System.out.println(i); // i는 for 블럭 안에서만 유효함
        }

        // System.out.println(i); // i는 for 블럭 밖에서는 사용할 수 없음

        // 새로운 블럭을 정의하여 변수 j 선언
        {
            int j = 0; // j는 이 블럭 내부에서만 유효함
            System.out.println(j); // j 출력
        }

        // System.out.println(j); // j는 위 블럭 밖에서는 사용할 수 없음

        System.out.println(number); // number 는 main 전체에서 사용 가능
    }
}
