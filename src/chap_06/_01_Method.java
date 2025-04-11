package chap_06;

public class _01_Method {
    // 메서드 정의 (메소드명은 주로 동사를 사용) : 어떤 기능을 하는 코드들의 묶음
    // - 코드 덩어리를 이름을 붙여서 나중에 재사용할 수 있게 만드는 것 (요리 - 여러개의 레시피)
    // - 중복을 줄이고, 코드 정리, 재사용 가능하게 하기 위해서 사용함
    // - 실행단계 1. 메서드 정의 -> 이름, 괄호, 중괄호
    //            2. 메서드 안에 실행할 코드 작성
    //            3. 필요할 때 그 메서드 이름만 써서 호출하면 실행됨
    public static void sayHello() { // 동작 => 주로 동사를 사용
        System.out.println("안녕하세요 메소드입니다.");
    }

    // 1. public - 접근 제한자, 누구나 접근한 수 있도록, 다른 클래스에서도 이 메서드를 사용할 수 있음
    // 2. static - 정적 멤버 선언, 일반적으로 자바에서는 객체를 생성해야 메서드를 쓸 수 있음,
    //              static을 붙이면 클래스 이름으로 직접 호출 가능.
    // 3. void - 리턴값 없음 (결과를 반환하지 않음) 어떤 메서드는 계산 결과를 return 으로 돌려주지만,
    //           void 가 붙으면 그냥 실행만 하고 끝.
    public static void main(String[] args) {
        // 메서드 호출
        System.out.println("메소드 호출 전");
        sayHello();
        sayHello();
        sayHello();
        System.out.println("메소드 호출 후");

        // for 문을 이용해서 반복 호출
        for (int i = 1; i <= 10; i++) {
            sayHello();
        }
    }
}
