package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
//        // 나코 매장
//        System.out.println("어서오세요. 코나입니다.");
//        // 또 다른 손님이 들어오면?
//        System.out.println("어서오세요. 코나입니다.");
//
//        for ( int i = 0; i < 10; i++){
//            System.out.println("어서오세요. 코나입니다. " + i);
//        }

        // 짝수만 출력 (1)
        for (int i = 0; i < 10; i ++){
            if(i % 2 == 0){
                System.out.println("짝수만 출력: " + i);
            }else {
                continue;
            }
        }
        // 짝수만 출력 (2)
        for(int i = 0; i < 10; i += 2){
            System.out.print(i);
        }

        System.out.println();

        // 홀수만 출력
        for (int i = 1; i < 10; i += 2){
            System.out.println(i);
        }

        // 거꾸로 숫자
        for (int i = 5; i > 0 ; i--){
            System.out.println(i);
        }

        // 1부터 10까지 수들의 합
        int i = 1;
        int sum = 0;

        for(i = 1; i <= 10; i++){
            sum += i;
            System.out.println("현재 sum 값: " + sum);

        }
        System.out.println("총 합: " + sum);

    }
}
