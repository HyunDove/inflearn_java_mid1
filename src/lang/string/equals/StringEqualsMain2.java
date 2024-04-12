package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {

        // new String()을 사용해서 각각 인스턴스를 생성.
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002

        System.out.println("메서드 호출 비교 1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교 2 : " + isSame(str3, str4));

    }

    private static boolean isSame(String x, String y) {
        // return x == y;
        // 어떤 값이 들어올지 모르기때문에, 항상 동등성 비교를 사용한다.
        return x.equals(y);
    }
}
