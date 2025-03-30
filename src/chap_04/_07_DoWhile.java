package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        // 반복문 DoWhile
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        int height = 2; // 키 2m

        while (move + height < distance) { // move 에 height 더한 값이 distance 보다 작을때 까지
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다."); // 반복문을 벗어난 뒤 실행 문장

        System.out.println(" --- 반복문 #1 ---");

        // 키가 엄청 나게 큰 사람?
        move = 0;
        height = 25; // 키가 25m

        while (move + height < distance) { // 처음부터 조건이 맞지 않으므로 반복문을 빠져나감
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3; // 3m 이동
        }
        System.out.println("도착했습니다.");

        System.out.println(" --- 반복문 #2 ---");

        // Do While 반복문
        do { // 조건에 상관없이 문장을 먼저 수행하고 조건을 확인하고 반복 수행
            // 최소 한 번은 do 영역을 실행함
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move); // 문장 수행
            move += 3; // move = 3이 됨
        } while (move + height < distance); // move(3) + height(25) 조건에 맞지 않으므로 반복 종료
        System.out.println("도착했습니다."); // 반복 종료 후 { } 밖의 문장 수행
    }
}
