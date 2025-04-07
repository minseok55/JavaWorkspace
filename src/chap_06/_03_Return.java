package chap_06;

public class _03_Return {
    // 메서드 수행시 메서드에서 어떤 값을 반환해서 메서드를 호출한 곳에서 반환된 값을 받아서 처리
    // 호텔 전화번호
    // void = 반환값이 없는 메서드, 문자열 형태의 값을 반환하기 위해서는 String
    public static String getPhoneNumber() {
        String PhoneNumber = "02-1234-5678";
        return PhoneNumber;
    }
    // 호텔 주소

    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivities() {
        return "볼링장, 탁구장, 노래방";
    }

    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호 : " + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소 : " + address);

        // 문자열 변수로 받지 않고 바로 사용
        System.out.println("호텔 액티비티 : " + getActivities());
    }

}
