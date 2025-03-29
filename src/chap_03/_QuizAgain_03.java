package chap_03;

/*
문제
주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오

참고
* 주민등록번호는 13자리의 숫자로 구성
* 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
* 입력 데이터는 - 을 포함한 14자리의 문자열 형태

예시
* "901231-1234567" 인 경우 901231-1 까지 출력
* "030708-4567890" 인 경우 030708-4 까지 출력
 */

public class _QuizAgain_03 {
    public static void main(String[] args) {
        String s1 = "870101-1234567"; // 주민등록번호 13자리
        String s2 = "920101-2345678";

        System.out.println(s1.substring(0, 8)); // 0 위치부터 8위치 직전까지
        // indexOf 를 사용한 방법
        System.out.println(s2.substring(0, s2.indexOf("-") + 2)); // 0 위치부터 "-" 뒤로 +2 위치 까지("-"의 위치는 고정)
    }
}
