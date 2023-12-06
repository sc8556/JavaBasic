package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄, 문자, 숫자 사용가능
        // 3. 밑줄 또는 문자로 시작 가능 * 숫자로는 시작할 수 없음
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        // 6. 예약어는 사용이 불가능 * 예약어란? (public, static, void 등 ..)

        // 입국 신고서(여행)
        String nationality = "대한민국"; // 국적
        String fistName = "현성";
        String lastName = "김";
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "무슨 호델"; // 체류지
        String purposdOfVisit = "관광"; // 입국목적

        String flightNo = "KE657"; // 항공편명
        String _flightNo = "KE657"; // 항공편명
        String flight_No_2 = "KE657"; // 항공편명

    }
}
