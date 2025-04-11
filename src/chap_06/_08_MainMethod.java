package chap_06;
// main 메서드에서 args 배열을 통해 메뉴를 처리하는 예제

public class _08_MainMethod {
    // 프로그램 실행 시 전달받은 인자(args)에 따라 메뉴를 고름
    public static void main(String[] args) { // 메인 메서드
        // 전달된 모든 인자를 한 줄씩 출력
        for (String s : args) {
            System.out.println(s);
        }

        // 고를 수 있는 메뉴 번호
        // 1. 도서 조회
        // 2. 도서 대여
        // 3. 도서 반납

        // 입력값이 1개일 때만 메뉴 실행
        if (args.length == 1) {
            switch (args[0]) {
                case "1": // 1번 입력 시
                    System.out.println("도서 조회 메뉴입니다.");
                    break;
                case "2": // 2번 입력 시
                    System.out.println("도서 대여 메뉴입니다.");
                    break;
                case "3": // 3번 입력 시
                    System.out.println("도서 반납 메뉴입니다.");
                    break;
                default: // 1~3 외 다른 숫자를 넣었을 때
                    System.out.println("잘못 입력하셨습니다.");
            }
        } else {
            // 입력이 없거나 2개 이상일 때는 안내 메세지 출력
            System.out.println("사용법) 1 ~ 3 메뉴 중 하나를 입력하세요.");
        }
    }
}
