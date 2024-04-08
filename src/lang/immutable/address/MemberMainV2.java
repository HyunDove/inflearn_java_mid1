package lang.immutable.address;

public class MemberMainV2 {

    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("외원A", address);
        MemberV2 memberB = new MemberV2("외원B", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원 B의 주소를 부산으로 변경해야함
        // memberB.getAddress().setValue("부산") // 값을 변경할 수 있는 메서드가 없기에 컴파일 오류가 발생한다.
        memberB.setAddress(new ImmutableAddress("부산"));

        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
