package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        // 상수가 필요한 경우 전 세계적으로 사용하는 값들 (예: 국가번호 +82)
        // final 상수 키워드
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호 (문자열)
        // KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; // 원주율
        final String DATE_OF_BIRTH = "1987-01-01"; // 생년 월일
        // 상수의 변수명 작성 시 모두 대문자이므로 두 개 이상의 단어 일 경우 단어 중간에 "_"를 넣어 가독성 높이기
    }
}
