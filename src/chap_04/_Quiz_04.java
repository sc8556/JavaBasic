package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /* 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        <조건>
        - 주차요금은 시간당 4000원 (일일 최대요금은 30000원)
        - 경차 또는 장애인 차량은 최종 요금에서 50% 할인

        <주차요금 예시>
        - 일반 차량 5시간 주차 시 20000원
        - 경차 5시간 주차 시 10000원
        - 장애인 차량 10시간 주차 시 15000원
         */
        int hour = 5; // 5시간 변수 선언
        int fee = 0; // 요금 변수 선언
        boolean isSmallCar = false; // 경차 불린으로 선언
        boolean isDisabledCar = false; // 장애인 차량 불린으로 선언

        fee = (hour * 4000); // 시간당 4000원

        // 주차요금이 30000원이 넘어가는 경우 30000원으로 적용
        if(fee >= 30000){
            fee = 30000;
        }
        // 경차이거나 장애인 차량인 경우 주차요금 반값 적용
        if(isSmallCar == true || isDisabledCar == true){
            fee /= 2;
        }

        System.out.println("주차요금은 " + fee + "원 입니다.");

    }
}
