package lang.string.test;

public class TestString4 {

    /**
     * substring()을 사용해서 hello 부분과 .txt 부분을 분리해라
     * */
    public static void main(String[] args) {
        String str = "hello.txt";

        // 코드 작성
        String fileName = str.substring(0, 5);
        String extName = str.substring(5);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);

    }
}
