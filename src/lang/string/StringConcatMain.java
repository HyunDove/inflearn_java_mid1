package lang.string;

public class StringConcatMain {

    public static void main(String[] args) {
        String a = "hello"; // x001
        String b = " java"; // x002

        String result1 = a.concat(b); // x001.concat(b)
        String result2 = a + b;

        /**
         * 원래는 x001 + x002 : 참조 값 끼리는 + 연산자 사용이 불가한데,
         * 문자열을 너무 자주 다루어지기때문에, Java에서는 편의상 특별히 + 연산을 제공한다.
         */

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

    }
}
