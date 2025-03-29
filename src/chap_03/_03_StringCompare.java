package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // s1변수의 문자열 내용이 ()안의 문자와 같으면 true, 다르면 false
        System.out.println(s2.equals("python")); // 대소문자 구분 * 대소문자가 다르면 false

        // 대소문자 구분 없이 문자열 내용이 같은지 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용) * s1 의 내용과 s2의 내용을 비교
        System.out.println(s1 == s2); // true (참조)
        // 메모리의 s1 공간에 저장된 1234를 같은 메모리공간에서 s2 에게 부여

        s1 = new String("1234"); // 각각의 서로 다른 메모리
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true (내용)
        System.out.println(s1 == s2); // false (참조)
        // s1의 변수와 s2의 변수는 서로 다른 메모리공간에 각각 저장 되어있음
        // Java 에서 일반적으로 문자열의 내용을 비교할 경우 equals 사용
    }
}
