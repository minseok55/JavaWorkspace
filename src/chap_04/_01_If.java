package chap_04;

public class _01_If {
    public static void main(String[] args) {
        //조건문 if

        int hour = 15; // hour 변수 / 시간

//        if (조건) {
//            수행할 명령
//        }


        // if 문 내에서 하나의 문장을 실행할 때는 { } 생략가능, 가급적 사용
        if (hour < 14) { // 비교 연산자 hour 가 14시보다 작은 경우,
            System.out.println("아이스 아메리카노 + 1"); // 조건이 참일경우 { }안의 문장 실행
        }

        //if 문 내에서 2개 이상의 문장을 실행할 때는 { } 생략 불가
        if (hour < 14) {
            System.out.println("아이스 아메리카노 + 1"); // 조건이 참일 경우 두개 이상의 문장도 실행 가능
            System.out.println("샷추가");
        }
        System.out.println("커피 주문 완료 #1"); // 조건이 거짓일 경우 조건문을 빠져나오고 { } 밖의 문장 실행


        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false; // 모닝 커피 여부 변수, 모닝커피를 마시지 않음

        //if (hour < 14 && morningCoffee == false) { // 모닝커피 변수가 false 와 같은지 확인
        if (hour < 14 && !morningCoffee) { // 14시 이전이면서 && 모닝커피를 마시지 않았을 경우의 부정 (논리부정 연산자 사용)
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true; // 모닝커피를 마신 경우

        //if (hour >= 14 || morningCoffee == true) { // 14시 이후 이거나 || 모닝커피를 마신경우 둘 중에 하나라도 참일 경우
        if (hour >= 14 || morningCoffee) { // morningCoffee = true
            System.out.println("아이스 아메리카노(디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #3");
    }
}
// 조건을 만족 하는 경우에만 특정 코드가 실행됨
