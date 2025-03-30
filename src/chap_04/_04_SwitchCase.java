package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // Switch case
        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장장학금 대상 아님

        // If Else 문을 이용한 방법 (여러 조건 또는 범위에 해당하는 경우)
        int ranking = 2; // 1등

        if (ranking == 1) { // ranking 이 1등과 같을 경우
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
//        2등과 3등의 조건 만족시 실행 문장이 같으므로 위의 (ranking == 2 || ranking == 3) 식으로 사용 가능
//        } else if (ranking == 3) {
//            System.out.println("반액 장학금");
        } else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // Switch Case 문을 이용 (명확한 케이스가 있는 경우)
//        switch (표현) {
//
//        }
        ranking = 5;

        switch (ranking) { // ( )에 해당하는 값이 case 에 해당하는지 확인
            case 1: // 1등일 경우
                System.out.println("전액 장학금");
                break; // switch case 모든 문장을 빠져나오는 역할을 함. 각 case 의 조건이 만족 시 break 실행
            case 2: // 2등일 경우
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;
            // 그 외의 경우
            default: // 마지막은 default 로 끝냄 , default 에는 break 를 사용하지 않아도 됨.
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #2");


        // case 2 와 3 을 통합
        ranking = 3;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2: // case 2와 3의 조건이 같기 때문에 통합 가능
            case 3:
                System.out.println("반액 장학금");
                break;
            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급 : 최상, 4급 : 최하)
        int grade = 2; // 중고 상품의 등급 변수
        int price = 7000; // 기본 가격 변수
        switch (grade) {
            case 1:
                price += 1000; // price = price + 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
            // 1등급일 경우 case 1,2,3 실행 + 1000 + 1000 + 1000원, 2등급일 경우 case 1을 제외하고 2,3 실행 1000 + 1000
        }
        System.out.println(grade + "등급 제품의 가격 : " + price + "원");

        // 여러 조건이나 범위 일경우 if else (예 : 학점)
        // 명확한 값이 있을 경우 switch case (예 : 에러코드)
    }
}

