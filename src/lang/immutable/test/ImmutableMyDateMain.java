package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1); // x001
        ImmutableMyDate date2 = date1; // x001

        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // date1.setYear(2025);
        /**
         * 불변 객체에서 변경과 관련된 메서드들은 보통 새로운 객체를 반환하기때문에,
         * 꼭 반환 값을 받아야 한다.
         * */
        date1 = date1.withYear(2025); // x002
        System.out.println("date1 = " + date1); // x002
        System.out.println("date2 = " + date2); // x001
    }
}
