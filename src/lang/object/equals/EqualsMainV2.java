package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        // 동일성 비교 -> false
        System.out.println("identity = " + (user1 == user2));

        // equals()를 id 값으로 재정의함. 동등성 비교 -> true
        System.out.println("equality = " + (user1.equals(user2)));
    }
}
