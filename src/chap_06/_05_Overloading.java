package chap_06;

public class _05_Overloading {
    public static int getPower(int number) { // int number는 'Parameter(매개변수)' 라고 합니다.
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1; // result 변수 선언
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        /* [메소드 오버로딩]
            - 같은 이름의 메소드를 여러 번 선언하는 것을 말한다.
                1. 전달값의 타입
                2. 전달값의 개수
         */
        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(2,3)); // 2 * 2 * 2 = 8
    }
}
