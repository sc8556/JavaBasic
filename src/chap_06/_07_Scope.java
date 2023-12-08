package chap_06;

public class _07_Scope {


    public static void methodA(){
//         System.out.println(number);
    }

    public static void methodB(){
        int result = 1; // 지역 변수

    }
    public static void main(String[] args) {
        // 변수의 범위
        int number = 3; // 지역 변수

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
//            System.out.println(i); // 지역 변수

//        System.out.println(result);
    }
}
