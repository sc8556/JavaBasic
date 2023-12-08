package chap_06;

public class _Quiz_06 {
    public static String getHiddenData(String type, int num){ // 메소드 선언
        String text = type.substring(0,num); // 필요한 문자열만 잘라서 변수에 저장
        for (int i = num; i < type.length(); i++) { // 남은 문자열부터 원래 문자열 끝까지 반복문 수행
            text = text + "*"; // 기존 문자열의 끝까지 '*' 붙이기
        }
        return text; // 결과 반환
    }
    public static void main(String[] args) {
        String name = "나코딩";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름: " + getHiddenData(name,1));
        System.out.println("주민등록번호: " + getHiddenData(id,8));
        System.out.println("전화번호: " + getHiddenData(phone,9));

    }
}
