package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자, and, or
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // 하나라도 true이면 true, true
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // 모두 다 true이면 true, false
        // And 연산, &&
        System.out.println((5 > 3) && (3 > 1)); // (5가 3보다 크고, 3도 1보다 크다), (모두 true일 경우, true 그렇지 않으면 false), true
        System.out.println((5 > 3) && (3 < 1)); // (5가 3보다 크고, 3은 1보다 작다), (모두 true일 경우, true 그렇지 않으면 false), false
        // Or 연산, ||
        System.out.println((5 > 3) || (3 > 1)); // (5가 3보다 크거나, 3은 1보다 크다), (하나라도 true일 경우, true 그렇지 않으면 false), true
        System.out.println((5 > 3) || (3 < 1)); // (5가 3보다 크거나, 3은 1보다 작다), (하나라도 true일 경우, true 그렇지 않으면 false), true
        System.out.println((5 < 3) || (3 < 1)); // (5가 3보다 작거나, 3은 1보다 작다), (하나라도 true일 경우, true 그렇지 않으면 false), false

        //System.out.println(1 < 3 < 5);, 불가능한 코드

        //논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
