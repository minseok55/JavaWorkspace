package chap_01;

public class _04_Comment {
    public static void main(String[] args) {
        System.out.println("(10분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다.");
        // 주석 처리 된 문장은 실행되지 않음 (실행을 원하지 않을 시 주석 처리)
        //System.out.println("(5분 전) 잠시 후 결혼식 시작 예정이오니 착석 부탁드립니다."); // 복사 command + D
        System.out.println("지금부터 결혼식을 시작하겠습니다.");

        int size = 120; // size 변수에 120 값을 넣음
        size = size + 10; // 어린이는 발이 빨리 자라기 때문에 사이즈 10만큼 더 큰 신발을 구매 (주석을 이용해 설명)
        // size += 10; == size = size +10
        // size 변수에 10을 더하여 size = 130
        System.out.println("신발 사이즈 " + size + "으로 보여주세요");


        // 한 줄 주석 단축키 : cmd + / (//)
        // 여러 줄 주석 단축키 : cmd + shift + / (/**/)
        int a = 10; // int a 라는 변수에 10을 입력
        int b = 20; // int b 라는 변수에 20을 입력
        System.out.println(a + b); // 30

        // 실행취소 command + z
    }
}