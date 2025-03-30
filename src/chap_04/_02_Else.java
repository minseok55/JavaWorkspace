package chap_04;

public class _02_Else {
    public static void main(String[] args) {
        // 조건문 If Else
        int hour = 10;
        if (hour < 14) { // 오후 2시이전이면
            System.out.println("아이스 아메리카노 + 1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        }
        System.out.println("커피 주문 완료 #1");
        // if 조건이 만족하면  if { } 안의 문장 실행, 조건이 만족하지 않을 경우
        // if 를 빠져나와 else { } 안의 문장 실행


        // 오후 2시 이후이거나 모닝커피를 마신 경우?
        hour = 15;
        boolean morningCoffee = false; // 모닝커피 여부 마셨을 경우 true, 마시지 않았을 경우 false
        if (hour >= 14 || morningCoffee == true) { // 오후 2시 이후이거나 모닝커피를 마신경우?
            System.out.println("아이스 아메리카노 (디카페인) + 1");
        } else { // 그 외의 경우이면
            System.out.println("아이스 아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #2");
        // if 조건 중 하나라도 만족 하는 경우 if { } 안의 문장 실행
        // if 조건 중 둘다 만족하지 않는 경우 if 를 빠져나와 else { } 안의 문장 실행

        // if ~ else
        // 조건이 참인경우 실행, 그 외의 경우 실행
    }
}
