package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        final String fistBusNo = "1234";
        final String secondBusNo = "상암08";
        // 버스 번호는 바뀌지 않기 때문에 상수로 선언
        int fistBusTime = 3;
        int SecondBusTime = 5;
        // 남은시간은 정수형 int로 선언
        Double fistBusRange = 1.5;
        Double secondBusRange = 0.8;
        // 거리는 소수점 단위가 존재하므로 Double로 선언

        System.out.println(fistBusNo + "번 버스");
        System.out.println("약 " + fistBusTime + "분 후 도착");
        System.out.println("남은 거리 " + fistBusRange + "km");
    }
}
