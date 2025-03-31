package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
//        System.out.println(coffees[0] + " 하나");
//        System.out.println(coffees[1] + " 하나");
//        ...

        // for 반복문 순회
        for (int i = 0; i < 4; i++) { // 배열의 요소(숫자) for 반복문
            // i 가 0부터 4직전까지 순회 하는 동안 그 값을 배열의 [ ] 속에 넣어서 0 ~ 4 직전까지 반복
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------------------------");

        // 배열의 길이를 이용한 순회
        System.out.println(coffees.length); // coffees.length << 배열의 길이 확인

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------------------------");

        // enhanced for (for - each) 반복문, 향상된 for 문
        // coffees 라는 배열에 있는 값들을 순서대로 순회 하는데 그때 순회되는 값을 coffee 라는 이름으로 받아서 사용
        for (String coffee : coffees) { // index 값이 없으므로 처음부터 끝까지 순서대로 순회
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
