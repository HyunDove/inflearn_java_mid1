package lang.string;

public class StringBasicMain {

    public static void main(String[] args) {

        // Java에서 new String("hello")와 같이 변경해준다.
        String str1 = "hello"; // 기존
        String ste2 = new String("hello"); // 편의 변경

        System.out.println("str1 = " + str1);
        System.out.println("ste2 = " + ste2);
    }
}
