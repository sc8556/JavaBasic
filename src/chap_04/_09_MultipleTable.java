package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        System.out.println("시작");
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int sum = i * j;
                System.out.println(i + "*" + j + "=" + sum);
            }
            System.out.println();
        }
        System.out.println("종료");
    }
}