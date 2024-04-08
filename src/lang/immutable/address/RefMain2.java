package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {

        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        ImmutableAddress a = new ImmutableAddress("서울"); // x001
        ImmutableAddress b = a; // x001

        // toString()을 재정의 했기에, 변수 값 출력
        System.out.println("a = " + a); // 실행 결과 ➡️ Address{value='서울'}
        System.out.println("b = " + b); // 실행 결과 ➡️ Address{value='서울'}

        /**
         * b의 값을 부산으로 변경 : final 객체이기때문에
         * setter가 존재하지 않음.
         * 즉, 새로운 인스턴스를 생성해서 할당해야한다.
         * b.setValue("부산");
         * */
        b = new ImmutableAddress("부산");

        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 실행 결과 ➡️ Address{value='부산'} + 사이드 이펙트 발생
        System.out.println("b = " + b); // 실행 결과 ➡️ Address{value='부산'}
    }
}

