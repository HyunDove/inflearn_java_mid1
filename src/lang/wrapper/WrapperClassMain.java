package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10); // 미래에 삭제 예정, 대신 valueOf()를 사용
        // Integer newInteger = Integer.valueOf(10); // 재사용된 값을 꺼내서 사용. cache 개념
        Integer integerObj = Integer.valueOf(10); // -128 ~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("newInteger = " + newInteger);
        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);
        long longValue = longObj.longValue();

        System.out.println("비교");
        System.out.println("== : " + (newInteger == integerObj)); // 동일성 비교 : false
        System.out.println("equals : " + (newInteger.equals(integerObj))); // 동등성 비교 : true

    }
}
