package chap_01;

public class _03_Variables { // 변수 - 어떤 데이터를, 어떤 값을 저장하는 공간
    public static void main(String[] args) {
        System.out.println("송자바님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println("송자바님, 배송이 완료되었습니다.");

        // 경우에 따라서  항상 적어주기엔 힘들 수 있어서 "송자바" 부분만큼을 변수로 빼서 저장하였다가 저장된 데이터를 사용
        // 프로그래밍에서 = 등호는 오른쪽에 있는 값을 왼쪽의 변수 또는 객체에 집어넣는다는 의미
        // 문자열 변수 - String < S는 대문자 / String 변수이름 = "문자열 값";
        String name = "송자바"; // name 문자열 자료형을 만들면서 동시에 "송자바" 문자열로 초기값을 설정
        System.out.println(name + "님, 배송이 시작됩니다. 15시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다. ");
        // 위에서 정의한 name 문자열 변수를 선언 후
        // 문자열 값을 집어 넣은 name 의 값이 들어옴

        int hour = 15; // 정수형 변수 integer, 변수명 hour

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다."); // (+) 빼먹지 않게 주의
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; // 실수형 변수
        char grade = 'A'; // 한글자만 표현할때는 char(character), (String  " 큰따옴표), (char ' 작은따옴표)
        // 변수는 언제든지 값을 변경 가능 (업데이트)
        name = "강자바"; // name 변수명은 그대로 사용하고 변수에 "강자바" 라는 값을 넣음
        System.out.println(name + "님의 평균 점수는 " + score + " 점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        // 참과, 거짓
        boolean pass = true; // 또는 false;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14123456789; // double 실수값 그대로 사용
        float f = 3.14123456789F; // 기본적으로 double 자료형으로 인식 하기 때문에 float 변수는 값 뒤에 F or f 를 넣음
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L; // int 의 범위를 벗어나기 때문에 long 을 사용, 이때 값 뒤에 L or l을 넣어줌
        // 21억 초과 하지 않을 시 int, 초과 시 double
//        l = 1_000_000_000_000L; // 가독성을 위해서 표기 하는 방법
        System.out.println(l);

//        정수 int(21억미만),long(21억초과) 실수 float,double(정밀),
//        문자형 char(하나의 문자),String(여러문자),boolean(참과 거짓, true, false)

        // 커피 컵과 커피 용량,
    }
}
