package chap_06;

public class _03_Return {
    /* [호텔에 필요한 정보]
        - 호텔 전화번호
        - 호텔 주소
        - 호텔 이용가능한 액티비티
    */
    // 호텔 전화번호 메소드 정의
    public static String getPhoneNumber(){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소 메소드 정의
    public static String getAddress(){
        return "서울시 어딘가";
    }
    // 호텔 액티비티 메소드 정의
    public static String getActivity(){
        return "볼링장, 탁구장, 노래방";
    }
    public static void main(String[] args) {
        // 반환값, Return
        String contactNumber = getPhoneNumber(); // 호텔 전화번호 메소드 호출
        System.out.println("호텔 전화번호: " + contactNumber);
        String address = getAddress();
        System.out.println("호텔 주소는: " + address);
        System.out.println("호텔 액티비티:" + getActivity());
    }
}
