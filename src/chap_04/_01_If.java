package chap_04;

public class _01_If {
    public static void main(String[] args) {
        // 조건문 If
        int hour = 10; // 오전 10시

        // if문 내에서 하나의 문장을 실행할 때는 {} 생략가능
        if(hour < 14)
            System.out.println("아이스아메리카노 + 1");
        System.out.println("커피 주문 완료 #1");

        // if문 내에서 하나 이상의 문장을 실행할 때는 {} 생략 불가능
        hour = 10; // 오전 10시
        if(hour < 14) {
            System.out.println("아이스아메리카노 + 1");
            System.out.println("샷 추가");
        }
        System.out.println("커피 주문 완료 #2");

        // 오후 2시 이전이면서 모닝 커피를 마시지 않은 경우?
        hour = 10;
        boolean morningCoffee = false;

        if (hour <= 14 && morningCoffee == false){
            System.out.println("아이스아메리카노 + 1");
        }
        System.out.println("커피 주문 완료 #3");

        // 오후 2시 이후이거나 모닝 커피를 마신 경우?
        hour = 15;
        morningCoffee = true;

        if(hour >= 14 || morningCoffee == true){
            System.out.println("(디카페인) 아이스아메리카노+ 1");
        }
        System.out.println("커피 주문 완료 #4");






    }
}
