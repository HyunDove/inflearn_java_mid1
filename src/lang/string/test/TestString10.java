package lang.string.test;

public class TestString10 {

    /**
     * split()를 사용해서 fruits를 분리하고, join()을 사용해서 분리한 문자들을 하나로 합쳐라.
     * */
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 코드 작성
        String[] splitStr = fruits.split(",");
        for (String fruit : splitStr) {
            System.out.println(fruit);
        }

        String joined = String.join("->", splitStr);
        System.out.println("joined = " + joined);

    }
}
