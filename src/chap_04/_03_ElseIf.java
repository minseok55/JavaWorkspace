package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 ElseIf

        // 한라봉 에이드가 있으면 + 1
        // 또는 망고 주스가 있으면 + 1
        // 또는 아이스 아메리카노 + 1

        boolean hallabongAde = true; // 한라봉 에이드
        boolean mangoJuice = true; // 망고 주스

        if (hallabongAde) { // 한라봉 에이드가 있을 경우
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice) { // 한라봉 에이드가 없다면 망고주스
            System.out.println("망고 주스 + 1");
        } else { // 둘다 없을 경우 아이스 아메리카노
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #1");


        // else if 는 여러번 사용 가능

        hallabongAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if (hallabongAde) { // 한라봉 에이드 없음
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice) { // 망고주스 없음
            System.out.println("망고 주스 + 1");
        } else if (orangeJuice) { // 오렌지 주스는 있으므로 아래의 문장 실행
            System.out.println("오렌지 주스 + 1");
        } else { // 위의 오렌지 주스의 조건이 만족 하였으므로, 아메리카노 주문은 하지 않고 문장을 빠져나옴
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        // else 는 없어도 가능

        hallabongAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if (hallabongAde) { // 모든 조건에 만족하지 않으면 어떤 문장도 실행되지 않고 else 문잘 실행
            System.out.println("한라봉 에이드 + 1");
        } else if (mangoJuice) {
            System.out.println("망고 주스 + 1");
        } else if (orangeJuice) {
            System.out.println("오렌지 주스 + 1");
        } // 마지막 else 는 생략 가능
        System.out.println("커피 주문 완료 #3");
    }
}
