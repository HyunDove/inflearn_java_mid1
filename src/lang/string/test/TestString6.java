package lang.string.test;

public class TestString6 {

    /**
     * str에서 key로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
     * */
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성 예시 1
        String[] splitStr = str.split(", ");
        int count = 0;

        for (String s : splitStr) {
            count += s.indexOf(key) == -1 ? 0 : 1;
        }

        System.out.println("count1 = " + count);

        // 코드 작성 예시 2
        int count2 = 0;
        int index = str.indexOf(key);

        while (index >= 0) {
            index = str.indexOf(key, index + 1);
            count2++;
        }

        System.out.println("count2 = " + count2);
    }
}
