package chap_06;

public class _02_Parameter {
    public static void power(int number) { // int number는 'Parameter(매개변수)' 라고 합니다.
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent){
        int result = 1; // result 변수 선언
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + " 의 " + exponent + " 승은 === " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 → 2 x 2 = 4
        // 3 → 3 x 3 = 9

        // 메소드 괄호 안에 값: Argument(인수)
        power(2);
        power(3);
        power(4);

        System.out.println("============================");

        powerByExp(2,3);
        powerByExp(4,5);
        powerByExp(10,0);
    }
}
