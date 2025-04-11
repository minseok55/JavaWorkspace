package chap_06;

public class _03_Return {
    // 메서드 수행시 메서드에서 어떤 값을 반환해서 메서드를 호출한 곳에서 반환된 값을 받아서 처리
    // 호텔 전화번호
    // void = 반환값이 없는 메서드, 문자열 형태의 값을 반환하기 위해서는 String
    // 메서드에서 값을 반환하고, 그 값을 main에서 받아서 사용하는 예제

    // 호텔 전화번호를 반환하는 메서드
    public static String getPhoneNumber() {
        // 전화번호 문자열 저장
        String PhoneNumber = "02-1234-5678";
        // 저장된 전화번호 반환
        return PhoneNumber;
    }

    // 호텔 주소
    // 호텔 주소를 반환하는 메서드
    public static String getAddress() {
        // 문자열을 바로 반환
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    // 호텔의 엑티비티 정보를 반환하는 메서드
    public static String getActivities() {
        // 활동 정보를 문자열로 반환
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        // getPhoneNumber 메서드의 반환값을 변수에 저장
        String contactNumber = getPhoneNumber();
        // 저장한 전화번호 출력
        System.out.println("호텔 전화번호 : " + contactNumber);

        // getAddress 메서드의 반환값을 변수에 저장
        String address = getAddress();
        // 저장한 주소 출력
        System.out.println("호텔 주소 : " + address);

        // 문자열 변수로 받지 않고 바로 사용
        // getActivities 메서드의 반환값을 변수 없이 바로 출력
        System.out.println("호텔 액티비티 : " + getActivities());
    }

}
