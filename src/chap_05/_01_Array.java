package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간
        // 처음 만들어진 형태로 고정
        // 의자로 예를 들면 변수 = 의자 1개, 배열 = 역이나 공항 의자 (의자의 크기가 같음 = 같은 자료형)
        String coffeeRose = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeChandler = "카페라떼";
        String coffeeMonica = "카푸치노";

        System.out.println(coffeeRose + " 하나"); // 아메리카노 하나
        System.out.println(coffeeRachel + " 하나"); // 카페모카 하나
        System.out.println(coffeeChandler + " 하나"); // 카페라떼 하나
        System.out.println(coffeeMonica + " 하나"); // 카푸치노 하나
        System.out.println("주세요");

        // 배열을 만드는 것을 선언이라고 함
        // 배열 선언 첫 번째 방법 (문자열 배열)
        //크기 4개의 똑같은 String 데이터를 갖는 배열을 만드는 방법
//        String[] coffees = new String[4]; // [ ] 배열 크기 (몇 개의 배열)

        // 배열 선언 두 번째 방법
//         String coffees[] = new String[4]; // [ ] 위치의 차이
        // 위치값에 값을 정의
        // index 값은 0부터 시작
//        coffees[0] = "아메리카노"; // 맨 첫번째 배열의 요소
//        coffees[1] = "카페모카";
//        coffees[2] = "카페라떼";
//        coffees[3] = "카푸치노";

        // 배열 선언 세 번째 방법
//        String[] coffees = new String[]{"아메리카노", "카페모카", "카페라떼", "카푸치노"};

        //배열 선언 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "카페라떼", "카푸치노"};
        
        System.out.println("------------------------------------");

        // 커피주문
        System.out.println(coffees[0] + " 하나"); // 아메리카노 하나
        System.out.println(coffees[1] + " 하나");
        coffees[2] = "에스프레소"; // 값 변경
        System.out.println(coffees[2] + " 하나");
        System.out.println(coffees[3] + " 하나");
        System.out.println("주세요");

        // 다른 자료형?
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        double[] d = new double[]{10.0, 11.2, 13.5};
        boolean[] b = {true, true, false};
    }
}