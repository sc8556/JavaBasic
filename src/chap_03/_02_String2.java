package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";


        // 문자열 변환
        System.out.println(s.replace("and",",")); // and → "," 로 변환하는 작업
        System.out.println(s.substring(7)); // Index 기준 7번째부터 시작해서 끝까지 출력
        System.out.println(s.substring(s.indexOf("Java"))); // Index 기준 7번째부터 시작해서 끝까지 출력
        System.out.println(s.substring(s.indexOf("Java"),s.indexOf("."))); // 시작위치부터 끝 위치 '직전' 까지만 출력

        // 공백 제거
        s = "        I Love Java.       ";
        System.out.println(s.trim()); // 앞뒤 공백제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2);
        System.out.println(s1 + "," + s2);
        System.out.println(s1.concat(",").concat(s2)); // s1 문자열에 ',' 추가하고 s2 추가하여 출력
    }
}
