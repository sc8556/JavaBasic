package chap_02;

import java.util.Scanner;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 121;
        // 어린이 키 변수 선언
        String result = (height >= 120) ? ("탑승 가능합니다.") : ("탑승 불가능합니다.");
        // 삼항 연산자를 이용하여 출력문 변수 선언
        System.out.println("키가 " + height + "이므로 " + result);
    }
}
