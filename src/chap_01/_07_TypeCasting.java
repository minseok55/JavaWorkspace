package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        //int score = 93 + 98.8; // 정수 + 실수 X

        // int to float, double (정수형 값을 실수형 값으로 형변환)
        int score = 93; // score 변수에 93의 값을 입력
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0 변환하고자 하는 자료형을 변수명 앞에 괄호를 이용하여 입력
        System.out.println((double) score); // 93.0

        // float, double to int (실수형 값을 정수형 값으로 형변환)
        float score_f = 93.3F; // float 은 값을 입력 할때 입력값 뒤에 f or F
        double score_d = 98.8;
        System.out.println((int) score_f); // 93 실수형 93.3 을 소수점 이하 부분을 지워 정수로 형변환
        System.out.println((int) score_d); // 98

        // 정수 + 실수 연산
        score = 93 + (int) 98.8; // 93 + 98 실수를 정수형으로 형변환과 동시에 정수형과 연산
        System.out.println(score); // 191 (정수 + 정수 결과는 정수형으로 출력)

        score_d = (double) 93 + 98.8; // 93.0 + 98.8 정수를 실수로 형변환과 동시에 실수형과 연산
        System.out.println(score_d); // 191.8 (실수 + 실수 결과는 실수형으로 출력)

        // 변수 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 191 -> 191.0
        // int -> long -> float -> double (자동 형변환) 점점 커지는 범위

        int convertedScoreInt = (int) score_d; // 191.8 -> 191
        // double -> float -> long -> int (수동 형변환) 점점 작아지는 범위

        // 숫자를 문자열로 (정수)
        String s1 = String.valueOf(93); // String class 의 valueOf를 이용하여 괄호 속에 원하는 값을 입력
        s1 = Integer.toString(93); // Integer class 의 toString 문자열로 변환해주는 기능
        System.out.println(s1); // 93

        // 실수
        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8); // Double class 제공
        System.out.println(s2); // 98.8

        // 문자열을 숫자로
        int i = Integer.parseInt("93"); // Integer.parseInt 정수로 변환
        System.out.println(i); // 93
        double d = Double.parseDouble("98.8");
        System.out.println(d); // 98.8

        // int error = Integer.parseInt("자바"); 잘못된 예시 (문자열인 변수를 정수로 변환하려고 할 때)
    }
}
