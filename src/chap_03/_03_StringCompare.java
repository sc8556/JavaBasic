package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2)); // 문자열이 같으면 true, 그렇지 않으면 false - false
        System.out.println(s1.equals("Java")); // 문자열이 같으면 true, 그렇지 않으면 false - true

        System.out.println(s2.equals("python")); // 문자열이 같으면 true, 그렇지 않으면 false - false
        System.out.println(s2.equalsIgnoreCase("python")); // '대소문자 구분없이' 문자열이 같으면 true, 그렇지 않으면 false - true

        // 문자열 비교 심화
        s1 = "1234"; // 벽에 붙은 메모지의 비밀번호 정보
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // true

        // 참조값이 다른 변수 선언
        s1 = new String("1234");
        s2 = new String("1234");

        System.out.println(s1.equals(s2)); // true, 내용을 비교
        System.out.println(s1 == s2); // false, 참조하는 곳을 비교, 메모리가 다르기 때문에 false로 나옴

    }
}
