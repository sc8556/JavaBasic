package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // swich case

        // 석차에 따른 장학금 지급
        // 1등 : 전액 장학금
        // 2등 : 반액 장학금
        // 3등 : 반액 장학금
        // 그 외 : 장학금 대상 아님

        // if-else 문의 경우 범위에 해당하는 조건인 경우 사용
        int ranking = 1; // 1등
        if(ranking == 1){
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        }else {
            System.out.println("장학금 대상 아님");
        }
        System.out.println("조회 완료 #1");

        // swich case, 명확한 사유가 있는 경우에 사용
        switch ( ranking ){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
                System.out.println("반액 장학금");
                break;
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #2");
        // 같은 조건의 경우 통합하기 - 조건이 동일한 경우 위에 있는 case의 조건의 내용 및 break문을 삭제하기
        ranking = 1;
        switch ( ranking ){
            case 1:
                System.out.println("전액 장학금");
                break;
            case 2:
            case 3:
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");
        }
        System.out.println("조회완료 #3");

        // 중고상품의 등급에 따른 가격을 책정 (1급: 최상, 4급: 최하)
        int grade = 1; // 등급변수 선언
        int price = 7000; // 7000원

        switch (grade){
            case 1:
                price += 1000; // 1등급일 경우 가격 + 1000원

            case 2:
                price += 1000;

            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격은 " + price + "원 입니다.");
    }
}
