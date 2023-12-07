package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // 아스키 코드 (ANSI) : 미국 표준 코드
        char c = '0'; // 알파벳 대문자 'A'는 65부터 시작, 소문자 'a'는 97부터 시작, 숫자 '0'은 48부터 시작
        System.out.println(c);
        System.out.println((int)c);

        c = '1';
        System.out.println(c);
        System.out.println((int)c);

        c++;
        System.out.println(c);
        System.out.println((int)c);

        String[][] seats3 = new String[10][15]; // 세로 크기 10 X 가로 크기 15 배열 생성
        char ch = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(ch) + (j + 1); // Ex. A1, A2 ... 의 형식 문자열 변수에 저장
                System.out.print(seats3[i][j] + " "); // 확인용 출력문
            }
            ch++;

            System.out.println(); // 줄바꿈용 출력문

        }
    }
}
