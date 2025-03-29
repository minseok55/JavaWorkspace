package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true; // 김치찌개가 있음
        boolean 계란말이 = true; // 계란말이가 있음
        boolean 제육볶음 = false; // 제육볶음이 없음

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true 이면 true (괜찮은 식당) * 있거나
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 true 이면 true (최고의 식당) * 그리고

        // And 연산 (두 개의 조건이 모두 만족할 때 결과는 true)
        System.out.println((5 > 3) && (3 > 1)); // 5 는 3 보다 크고, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) && (3 < 1)); // 5 는 3 보다 크고, 3 은 1 보다 작다 (false)

        // Or 연산 (두 개의 조건이 하나라도 만족할 경우 결과는 true)
        System.out.println((5 > 3) || (3 > 1)); // 5 는 3 보다 크거나, 3 은 1 보다 크다 (true)
        System.out.println((5 > 3) || (3 < 1)); // 5 는 3 보다 크거나, 3 은 1 보다 작다 (true)
        System.out.println((5 < 3) || (3 < 1)); // 5 는 3 보다 작거나, 3 은 1 보다 작다 (false)
        // System.out.println(1 < 3 < 5); // 연속적으로 두번 비교하는 것은 불가능한 코드
        System.out.println((1 < 3) && (3 < 5)); // 연속적으로 비교할때 가능한 코드


        // 논리 부정 연산자 (결과의 반대를 출력)
        System.out.println(!true); // false * 값이 true 지만 !가 있으므로 결과는 반대의 false 가 됨
        System.out.println(!false); // true * 값이 false 지만 !가 있으므로 결과는 반대의 true 가 됨
        System.out.println(!(5 == 5)); // false * 5는 5와 같지만 앞에 ! 가 있으므로 true 에서 false 가 됨
        System.out.println(!(5 == 3)); // true * 5는 3과  같지 않지만 앞에 !가 있으므로 false 에서  true 가 됨
    }
}
