package chap_06;

public class _04_ParameterAndReturn {

//    public static void power(int number) { // int number는 'Parameter(매개변수)' 라고 합니다.
//        int result = number * number;
//        System.out.println(number + "의 2승은 " + result);
//    }

    // 호출할 메소드 정의
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPowerByExp(int number, int exponent){
        int result = 1; // result 변수 선언
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    };

//
//    public static void powerByExp(int number, int exponent){
//        int result = 1; // result 변수 선언
//        for (int i = 0; i < exponent; i++) {
//            result *= number;
//        }
//        System.out.println(number + " 의 " + exponent + " 승은 === " + result);
//    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int retVal = getPower(2);
        System.out.println(retVal); // 2 * 2 = 4

        retVal = getPower(3); //
        System.out.println(retVal); // 3 * 3 = 9

        retVal = getPowerByExp(3,3);
        System.out.println(retVal); // 3 * 3 * 3 = 27
    }
}
