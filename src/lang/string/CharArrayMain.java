package lang.string;

public class CharArrayMain {

    public static void main(String[] args) {

        // 기본형인 char은 문자를 하나씩 다룰 때 사용한다. char 배열이 들어오면, 연결해서 표현해준다.
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'};
        System.out.println(charArr);

        String str = "hello";
        System.out.println("str = " + str);

    }
}
