package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자 (Escape Sequence, Escape Character, Special Character)
        // \n \t \\ \ " \ '
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // \n : 줄 바꿈
        System.out.println("자바가\n너무\n재밌어요");

        // \t : 탭
        System.out.println("해물파전\t9000원");
        System.out.println("김치전\t8000원");
        System.out.println("부추전\t8000원");

        // \\: 역 슬래시 - 주소 지킬 때 참조

        System.out.println("C:\\progrmafiles\\Java");

    }
}
