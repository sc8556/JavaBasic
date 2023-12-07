package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][]{
                {"A1","A2","A3","A4","A5"},
                {"B1","B2","B3","B4","B5"},
                {"C1","C2","C3","C4","C5"}
        };

        for (int i = 0; i < 3; i++) { // 세로 기준으로 범위 작성
            for (int j = 0; j < 5; j++) { // 가로 기준으로 범위 작성
                System.out.print(seats[i][j] + " ");
            }
                System.out.println(); // 줄바꿈용 출력문

        }
        // 범위가 일정하지 않은 경우 출력방법
        String[][] seats2 = new String[][]{
                                            {"A1","A2","A3"}, // seats2[0]
                                            {"B1","B2","B3","B4"}, // seats2[1]
                                            {"C1","C2","C3","C4","C5"} // seats2[2]
                                            };

//        for (int i = 0; i < seats2.length; i++) { // 세로 기준으로 범위 작성
//            for (int j = 0; j < seats2[i].length; j++) {   // 가로 기준으로 범위 작성
//                System.out.print(seats2[i][j] + " ");
//            }
//                System.out.println(); // 줄바꿈용 출력문

            System.out.println("==================================================="); // 구분용 출력문

            String[][] seats3 = new String[10][15]; // 세로 크기 10 X 가로 크기 15 배열 생성
            String[] eng = {"A", "B", "C", "D", "E", "F", "G", "H", "I","J"};
            for (int i = 0; i < seats3.length; i++) {
                for (int j = 0; j < seats3[i].length; j++) {
                    seats3[i][j] = eng[i] + (j+1); // Ex. A1, A2 ... 의 형식 문자열 변수에 저장
                }
                    System.out.println(); // 줄바꿈용 출력문
            }
            // 영화관 좌석 번호 확인
            for (int i = 0; i < seats3.length; i++) {
                for (int j = 0; j < seats3[i].length; j++) {
                    System.out.print(seats3[i][j] + " ");
            }
            System.out.println(); // 줄바꿈용 출력문
        }
            // 표구매
        seats3[7][8] = "__";
        seats3[7][9] = "___";

        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println(); // 줄바꿈용 출력문
        }

        }
    }
