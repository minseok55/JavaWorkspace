package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29, s 변수의 문자열 길이 확인 length
        // 리뷰 작성 시 ()글자 이상으로 입력하세요 같은 요청을 할때 많이 쓰임

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // 대문자로 변경
        System.out.println(s.toLowerCase()); // 소문자로 변경

        // 포함 관계
        System.out.println(s.contains("Java")); // () 안의 문자가 포함된다면 true / contains
        System.out.println(s.contains("C#")); // 포함되지 않는다면 false
        System.out.println(s.indexOf("Java")); // 위치 정보 7 , ()안의 문자열이 시작되는 위치 (J) / indexOf
        // 컴퓨터에서 문자열 시작 위치는 1이 아니라 0 부터 시작
        System.out.println(s.indexOf("C#")); // 포함되지 않는다면 -1
        System.out.println(s.indexOf("and")); // () 안의 같은 문자열이 여러개 인 경우 처음 일치하는 위치 정보 (12)
        System.out.println(s.lastIndexOf("and")); // 같은 문자열 중 마지막에 일치하는 위치 정보 (23) / lastIndexOf
        System.out.println(s.startsWith("I like")); // 이 문자열로 시작하면 true (아니면 false) / startsWith
        System.out.println(s.endsWith(".")); // 이 문자열로 끝나면 true (아니면 false) / endWith
    }
}
