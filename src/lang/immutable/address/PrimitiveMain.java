package lang.immutable.address;

public class PrimitiveMain {

    public static void main(String[] args) {
        // 기본형은 절대로 같은 값을 공유하지 않는다.
        int a = 10;
        int b = a; // a-> b, 값 복사 후 대입

        System.out.println("a = " + a); // 실행 결과 ➡️ 10
        System.out.println("b = " + b); // 실행 결과 ➡️ 10

        b = 20; // b만 값 20으로 변경

        System.out.println("20 -> b");
        System.out.println("a = " + a); // 실행 결과 ➡️ 10
        System.out.println("b = " + b); // 실행 결과 ➡️ 20

    }
}