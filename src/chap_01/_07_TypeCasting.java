package chap_01;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로
        // 서로 형태를 변환해주는 것을 의미

        // int to float, double
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0
        System.out.println((double) score); // 93.0

        // float, double to int
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int)score_f); // 93
        System.out.println((int)score_d); // 98

        //정수 + 실수 연산
        score = 93 + (int)98.8; // 93 + 98
        System.out.println(score);

        score_d = (double)93 + 98.8; // 93.0 + 98.8
        System.out.println(score_d);

        score_d = 93 + 98.8; // 93.0 + 98.8 * double은 형변환 없이도 자동으로 변환되어 계산됩니다.
        System.out.println(score_d);

        //변수에 형변환된 데이터 집어넣기
        double covertedScoreDouble = score; // 191 → 191.0
        // int → long → float → double (자동 형변환)

        /*double covertedScoreDouble = (int)score_d; // 191.8 → 191
        // double → float → long → int 큰 범위에서 작은 범위로 갈 때는 수동으로 형 변환을 해줘야합니다.*/


        String s1 = String.valueOf(93);
        // 숫자를 문자열로 String.valueOf 사용하여 형변환
        s1 = Integer.toString(93);
        // 문자열을 숫자로 Integer.toString 사용하여 형변환
        System.out.println(s1);

        String s2 = String.valueOf(93);
        // 숫자를 문자열로 String.valueOf 사용하여 형변환
        s2 = Double.toString(93);
        // 문자열을 숫자로 Double.toString 사용하여 형변환
        System.out.println(s2);


        int i = Integer.parseInt("93");
        System.out.println(i);
        // 문자열을 숫자로 Integer.parseInt 사용하여 변경
        double d = Double.parseDouble("93.8");
        System.out.println(d);
        // 문자열을 숫자로 Double.parseDouble 사용하여 변경
    }
}
