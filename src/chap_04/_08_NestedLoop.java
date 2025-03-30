package chap_04;

public class _08_NestedLoop {
    public static void main(String[] args) {
        // 이중 반복문

        // 별 (*) 사각형 만들기

        /*

         *****
         *****
         *****
         *****
         *****

         */

//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }


        for (int i = 0; i < 5; i++) { // i 는 0 부터 5회 반복 (i 속의 j를 5번 반복)
            for (int j = 0; j < 5; j++) { // j 는 0 부터 5회 아래의 문장을 반복
                System.out.print("*"); // ln이 없으므로 *****
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("----------------------");

        // 별 (*) 왼쪽 삼각형 만들기

        /*

         *
         **
         ***
         ****
         *****

         */

        for (int i = 0; i < 5; i++) { // 전체 문장 5번 반복 (세로 횟수) 건물을 예시로 바깥 for 문은 층수
            // for (int j = 0; j < i + 1; j++)
            for (int j = 0; j <= i; j++) {  // (가로 횟수) 안쪽 for 문은 호실
                // i가 0일 때는 i + 1 = 1 j는 반복문에서 1번 실행
                // (j < i + 1이니까, i가 증가할수록 j도 더 많이 반복돼서 별 개수가 늘어남.)
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }

        // i:0  j:0 (1번)            *
        // i:1  j:1 0,1(2번)         **
        // i:2  j:3 0,1,2(3번)       ***
        // i:3  j:4 0,1,2,3(4번)     ****
        // i:4  j:5 0,1,2,3,4(5번)   *****

        System.out.println("----------------------");

        // 별 (*) 오른쪽 삼각형 만들기

        /*

        ssss*
        sss**
        ss***
        s****
        *****

         */

        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5 - i - 1; j++) {
            for (int j = 0; j < 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("--------- 연습 ----------");

        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 2; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
        System.out.println("---------특정 단수 입력 구구단----------");
        int dan = 5;
        for (int i = dan; i <= dan; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (dan * j));
            }
        }
    }
}
