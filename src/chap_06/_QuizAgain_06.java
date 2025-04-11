package chap_06;

// 실행 결과
// 이름 : 송**
// 주민등록번호 : 991230-1******
// 전화번호 : 010-1234-****

// 힌트
// substring()
// length()

public class _QuizAgain_06 {

    // 문자열의 앞부분만 남기고 뒷부분은 *로 가리는 메서드
    public static String getHiddenData(String data, int index) {
        // 앞에서부터 index 전까지 잘라서 저장 (예: 송자바 → 송)
        String hiddenData = data.substring(0, index); // 송자바 -> 송
        // index 위치부터 끝까지 *로 바꾸기
        for (int i = index; i < data.length(); i++) { // 반복 범위 : index 부터 data 의 길이까지,
            // 별표(*)를 붙이는 이유 : 개인정보를 숨기기 위해
            hiddenData += "*"; // 송**
        }
        return hiddenData;
//        for (int i = 0; i < data.length() - index; i++) {
//        hiddenData += "*";
//    }
//        return"";
    }

    public static void main(String[] args) {
        // 이름 정보
        String name = "송자바";
        // 주민등록번호
        String id = "991230-1234567";
        // 전화번호
        String phone = "010-1234-5678";

        // 이름은 첫 글자만 남기고 나머지는 *로 표시
        System.out.println("이름 : " + getHiddenData(name, 1)); // 이름을 가리기 위해 getHiddenData 호출
        // 주민등록번호는 생년월일과 성별 자리까지는 남기고 뒷자리는 *로 표시
        System.out.println("주민등록번호 : " + getHiddenData(id, 8)); // 주민등록번호를 가리기 위해 getHiddenData 호출
        // 전화번호는 뒤 4자리만 *로 표시
        System.out.println("전화번호 : " + getHiddenData(phone, 9)); // 전화번호를 가리기 위해 getHiddenData 호출
    }

}

