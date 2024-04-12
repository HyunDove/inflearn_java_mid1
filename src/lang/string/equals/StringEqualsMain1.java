package lang.string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {

        // new String()을 사용해서 각각 인스턴스를 생성.
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("new String() == 동일성 비교 : " + (str1 == str2)); // false
        System.out.println("new String() equals 동등성 비교 : " + (str1.equals(str2))); // true

        // 리터럴 문법의 경우, 성능 최적화를 위해 문자열 풀 (String Pool)을 사용한다.
        String str3 = "hello";
        String str4 = "hello";

        System.out.println("리터럴 == 비교 : " + (str3 == str4)); // true
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4))); // true

    }
}
