package chap_04;

public class chap04_11_Continue {
    public static void main(String[] args) {
        // Continue
        // 치킨 주문 손님들 중 노쇼 손님이 있다고 가정
        // For
        int max = 20; // 최대로 치킨을 판매할 수 있는 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17;

        for (int i = 1; i < 50; i++) {
            System.out.println(i + "번 손님, 주문하신 치킨 나왔습니다.");
            if(i == noShow){// 손님이 없는 경우 continue
                System.out.println(i + "번 손님, 패스");
                continue;
            } else if (i == max) { // 최대 판매 수량과 같을 경우 break
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
            sold ++;
        }
        System.out.println("영업을 종료합니다.");

        System.out.println("============================="); // 구분을 위한 프린트문 출력

        int index = 0; // 인덱스 변수 선언 및 초기화
        while (true){
            index++;
            System.out.println("금일 재료가 모두 소진되었습니다.");

            //손님이 없다면??
            if(index == noShow){
                System.out.println(index + "번 손님, 패스");
                continue;
            }
            // 최대수량과 같다면??
            if(index == max){
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
        System.out.println("영업을 종료합니다.");
    }
}
