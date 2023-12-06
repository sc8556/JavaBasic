package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호 final 을 붙여주면 변수가 아닌 상수가 되고 상수는 값을 변경할 수 없음
//        KR_COUNTRY_CODE = "+8282"; // 국가 번호
        System.out.println("KR_COUNTRY_CODE");

        final double PI = 3.141592F; // 원주율
        final String DATE_OF_BIRTH = "2001-12-31"; // 생년월일
    }
}
