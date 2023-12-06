package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // 조건문 Else If
        // 한라봉 에이드가 있으면 +1
        // 망고주스 +1
        // 아이스 아메리카노 +1
        boolean hallabongJuice = true;
        boolean mangoJuice = true;

        if(hallabongJuice){
            System.out.println("한라봉 에이드 +1");
        } else if (mangoJuice) {
            System.out.println("망고주스 +1");
        }else {
            System.out.println("아이스아메리카노 +1");
        }
        System.out.println("커피주문완료 #1");



    }
}
