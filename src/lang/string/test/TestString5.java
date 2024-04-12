package lang.string.test;

public class TestString5 {

    /**
     * str에는 파일의 이름과 확장자가 주어진다. ext에는 파일의 확장자가 주어진다.
     * 파일명과 확장자를 분리해서 출력하라.
     * */
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        // 코드 작성
        int index = str.indexOf(ext);
        String fileName = str.substring(0, index);
        String extName = str.substring(index);

        System.out.println("fileName = " + fileName);
        System.out.println("extName = " + extName);
    }
}
