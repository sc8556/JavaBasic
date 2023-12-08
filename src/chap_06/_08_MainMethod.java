package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s: args) {
            System.out.println(s);
        }
        System.out.println("======================================"); // 분류를 위한 출력문

        if(args.length == 1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴 입니다.");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴 입니다.");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴 입니다.");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");
            }
        }else {
            System.out.println("사용법) 1~3 메뉴 중 하나를 입력해주세요.");
        }
    }
}
