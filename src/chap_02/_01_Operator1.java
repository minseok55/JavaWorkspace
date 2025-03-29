package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자 (계산)

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2 * 컴퓨터의 정수 계산은 결과도 정수로 나옴, 소수점은 버려지고 2만 남음
        System.out.println(2 / 4); // 0
        System.out.println(4 % 2); // 0 * 나머지 연산 4를 2로 나눈 나머지
        System.out.println(5 % 2); // 1

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8 괄호를 이용해 연산의 순서를 정함
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20; // a 라는 변수에 20
        int b = 10; // b 라는 변수에 10
        int c;

        c = a + b; // 오른쪽 연산 결과 값이 c에 들어감
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        // 증감 연산 ++, --
        int val; // 정수형 변수
        val = 10;
        // int val = 10;
        // val++; = 문잔의 연산을 먼저 수행 후 + 1
        // ++val; = ++ 이 앞에 있으면 연산을 먼저 수행
        System.out.println(val); // 10
        System.out.println(++val); // 11 (++가 앞에 있으므로 + 1을 먼저 수행 후 출력)
        System.out.println(val); // 11 (위에서 먼저 + 1)

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10 (val 변수의 값 10을 먼저 출력 후 + 1이 수행됨)
        System.out.println(val); // 11 (위의 val 10 값을 출력 후 + 1이 된값을 출력)

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9 ( -1 -> val 출력 )
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10 (val 출력 -> -1)
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0; // ++가 뒤에 있는 증감연산 (대기번호)
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0 첫 고객 방문시 waiting 0
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1 두번 째 고객 방문, 첫 고객의 업무가 끝나지 않았을 시 대기 인원 1
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2 위와 같음 (같은 문장 복사 cmd + d)
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3


    }
}
