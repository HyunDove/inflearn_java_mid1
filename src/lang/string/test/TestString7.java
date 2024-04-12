package lang.string.test;

public class TestString7 {

    /**
     * 문자의 양쪽 공백을 제거하라
     * ex) "    Hello Java     " -> "Hello Java"
     * */
    public static void main(String[] args) {
        String original = "    Hello Java     ";

        // 코드 작성
        String strip = original.strip();
        System.out.println("'"+ strip + "'");

    }
}
