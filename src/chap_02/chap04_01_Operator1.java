package chap_02;

public class chap04_01_Operator1 {
    public static void main(String[] args) {
        //일반 연산
        System.out.println(4 + 2); // 덧셈, 6
        System.out.println(4 - 2); // 뺄셈, 2
        System.out.println(4 * 2); // 곱셈, 8
        System.out.println(4 / 2); // 나눗셈, 2
        System.out.println(5 / 2); // 나눗셈, 2.5 → 결과는 정수로 출력되기 때문에 2 출력
        System.out.println(2 / 4); // 나눗셈, 0.5 → 결과는 정수로 출력되기 때문에 0 출력
        System.out.println(4 % 2); // 나머지 구하기, 0
        System.out.println(5 % 2); // 나머지 구하기, 1
        // 우선순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b; // 30
        System.out.println("결과는? " + c);

        c = a - b; // 10
        System.out.println("결과는? " + c);

        c = a * b; // 200
        System.out.println("결과는? " + c);

        c = a / b; // 2
        System.out.println("결과는? " + c);

        c = a % b; // 0
        System.out.println("결과는? " + c);

        //증감연산
        int val;
        val = 10;
        System.out.println(val); // 10

        System.out.println(++val); // val에 +1 한 값을 더한 후 문장 실행, 11
        System.out.println(val); // 위에서 val은 11이 되었기 때문에, 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 현재의 값인 10을 출력을 하고 나서, val + 1을 진행, 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // Ex.) 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원: " + waiting++); // 현재 대기인원 0 출력 후 +1 연산 진행, 0
        System.out.println("대기 인원: " + waiting++); // 현재 대기인원 1 출력 후 +1 연산 진행, 1
        System.out.println("대기 인원: " + waiting++); // 현재 대기인원 1 출력 후 +1 연산 진행, 2
        System.out.println("총 대기인원: " + waiting); // 총 대기인원: 3


    }
}
