package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
        // 결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        // x = 3, y =5 (3 > 5) 3은 5보다 크다 는 거짓이므로 x : y 중 max 값은(: 오른쪽) 5
        System.out.println(max); // 5

        int min = (x < y) ? x : y;
        // x = 3, y =5 (3 < 5) 3은 5보다 작다 는 참이므로 x : y 중 min 의 값(: 왼쪽)은 3
        System.out.println(min); // 3

        boolean b = (x == y) ? true : false;
        // boolean 삼항 연산자  x = 3, y = 5, (3 == 5) 의 조건은 거짓이므로 b의 값은 false(: 오른쪽) 값을 입력
        System.out.println(b); // false

        String s = (x != y) ? "달라요" : "같아요";
        // 문자열 삼항 연산자 x = 3, y = 5, (3 != 5) 의 조건이 참 이므로  s의 값은 "달라요"가 됨
        System.out.println(s); // 달라요
    }
}
