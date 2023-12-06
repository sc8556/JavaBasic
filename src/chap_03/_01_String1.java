package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // 29

        // 대문자 변환
        System.out.println(s.toUpperCase());
        // 소문자 변환
        System.out.println(s.toLowerCase());

        // 포함관계
        System.out.println(s.contains("Java")); //"Java" 라는 글자가 포함된다면 true, 그렇지 않으면 false - true
        System.out.println(s.contains("C#")); //"C#" 라는 글자가 포함된다면 true, 그렇지 않으면 false - false
        System.out.println(s.indexOf("Java")); // "Java" 라는 문자열의 위치 정보를 확인할 수 있음 - 7
        System.out.println(s.indexOf("C#")); // "C#" 라는 문자열의 위치 정보를 확인할 수 있음, 포함되지 않는다면 -1
        // 찾는 문자열의 위치를 찾는 경우
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보
        System.out.println(s.startsWith("I like")); // 문자열이 시작하는지 여부, 일치하면 true 그렇지 않으면 false - true
        System.out.println(s.endsWith(".")); // 문자열이 끝나는지 여부, 일치하면 true 그렇지 않으면 false - true
    }
}
