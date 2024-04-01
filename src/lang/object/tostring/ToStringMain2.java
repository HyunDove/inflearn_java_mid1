package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이1", 2);

        System.out.println("1. 단순 toString 호출");
        System.out.println("car = " + car.toString());
        System.out.println("dog1 = " + dog1.toString());
        System.out.println("dog2 = " + dog2.toString());

        System.out.println(); // 이쁘게 출력하기 위한 줄바꿈

        System.out.println("2. println 내부에서 toString 호출");
        System.out.println("car = " + car);
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

        System.out.println(); // 이쁘게 출력하기 위한 줄바꿈

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        System.out.println(); // 이쁘게 출력하기 위한 줄바꿈

        // toString 재정의 했던 객체에 대한 참조 값 출력
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println("refValue = " + refValue);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = " + refValue2);
    }
}
