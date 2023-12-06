package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자
        int num = 10;
        // num에 2를 더하기
        num = num + 2;
        System.out.println(num); // 12
        // num에 2를 빼기
        num = num - 2;
        System.out.println(num); // 10
        // num에 2를 곱하기
        num = num * 2;
        System.out.println(num); // 20
        // num에 2를 나누기
        num = num / 2;
        System.out.println(num); // 10
        // num에 2를 나눴을 때 나머지 구하기
        num = num % 2;
        System.out.println(num); // 0

        // 복합 대입 연산자
        num = 10;
        // num = num + 2;
        num += 2;
        System.out.println(num); // 12
        // num = num - 2;
        num -= 2;
        System.out.println(num); // 10
        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20
        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10
        // num = num % 2;
        num %= 2;
        System.out.println(num); //  0
    }
}
