package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "조재희"; // 문자열 name 이라는 변수 선언
//        name = "나도코딩";
        int hour;
        hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A'; // 여러 글자인 String은 ""를 사용하지만 한 글자인 char는 '' 사용
        System.out.println(name + "님의 평균 점수는" + score + "점 입니다.");
        System.out.println("학점은 " + grade+ " 입니다.");

        boolean pass = true; // true, false 값을 적을 때는 ",' 사용 안함
        System.out.println("이번 시험은 합격했을까요?" + pass);
// 변수 (후반전)
        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

//        int i = 10000000000; // int의 범위는 -20 1억부터 + 1억까지의 범위기 때문에 빨간색으로 표시가 되는 것임 이러한 경우는 long을 사용
        long l = 10000000000l;
        l = 1_000_000_000_000L; // 0이 너무 많아 _로 구분 지어주기
        System.out.println(l);
    }
}
