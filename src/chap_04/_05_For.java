package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For

        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또 다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다");
        System.out.println("환영합니다. 나코입니다"); // option + 드래그 여러개를 한번에 바꿀때
        // 매장의 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");
        System.out.println("환영합니다. 코나입니다");

        System.out.println(" ---- 반복문 사용 ---- ");

        // 반복문 사용 For

        // for 라는 반복문을 이용하여 정의 되어있는 조건에 따라 반복 횟수만큼 { }속의 내용을 반복해서 수행
        // for (선언; 조건; 증감){ }
        // 선언 : 주로 int 형 변수를 사용

        for (int i = 0; i < 10; i++) {
            // int i = 0; (i 라는 이름의 변수의 초기값을 0으로 설정)
            // i < 10; (i 는 10보다 작다는 조건)
            // 수행 명령
            // i++ (i += 1) 앞의 선언과 조건을 만족 할 경우 아래의 명령을 수행 후 증감
            // 조건에 맞는 경우 반복, 조건에 맞지 않을 경우 반복문을 빠져나옴
            // i < 10; = i 가 10이 되면 조건에 밎자 않기 때문에 반복문 종료
//            System.out.println("어서오세요. 나코입니다. " + i);
//            System.out.println("환영합니다. 나코입니다. " + i);
            System.out.println("환영합니다. 코나입니다. " + i);
        }


        // 짝수만 출력
//        for (int i = 0; i <.....) for+i
        for (int i = 0; i < 10; i += 2) {
            // int i = 0 이고 조건식 0은 10보다 작다 (10 미만의 숫자) 증감 += 2씩 더해지므로
            // (0 + 2), (2 + 2), (4 + 2), (6 + 2) 실행되고 (8 + 2) + 10 이기 때문에 실행 수행하지 않고 반복문 종료
//            System.out.println(i);
            System.out.print(i); // 줄바꿈 x
            //println 에서 ln을 빼면 줄바꿈을 하지 않음
        }

        System.out.println(); // 다음 조건의 가독성을 위해서 줄바꿈

        // 홀수만 출력
        // 1, 3, 5, 7, 9
        for (int i = 1; i < 10; i += 2) {
            // 홀수만 출력 하기 위해서는 1부터 시작 하여 i += 2 를 반복 해주는 방식
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자 출력
        // 5, 4, 3, 2, 1

        for (int i = 5; i > 0; i--) {
            // 거꾸로 숫자를 출력하기 위해서는 5 부터 i-- 로 1씩 감소하는 방식
            System.out.print(i);
        }

        System.out.println();

        // 1 부터 10까지의 수들의 합
        // 1 + 2 + 3 .... + 10 = 55
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i; // 반복된 숫자들을 sum 값에 더함
            // sum + 1 -> sum(1) + 1 -> sum(2) + 1 -> sum(3) + 1  i의 값이 조건에 만족할동안 반복
            System.out.println("현재까지 총합은 " + sum + "입니다."); // 반복하면서 현재까지의 합을 실행
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");
        // 반복 종료 후 현재까지의 합
    }
}
