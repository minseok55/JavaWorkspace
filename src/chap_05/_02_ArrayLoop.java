package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
//        System.out.println(coffees[0] + " 하나");
//        System.out.println(coffees[1] + " 하나");
//        ...

        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("---------------------------------------");

        // enhanced for (for - each) 반복문
        for (String coffee : coffees) { // coffees 라는 배열에 있는 값들을 순서대로 순회 하는데 그때 그때 순회되는 값을 coffee 라는 이름으로 받아서 사용
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
    }
}
