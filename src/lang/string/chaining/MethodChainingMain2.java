package lang.string.chaining;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder(); // x001
        ValueAdder adder1 = adder.add(1); // x001
        ValueAdder adder2 = adder1.add(2); // x001
        ValueAdder adder3 = adder2.add(3);  // x001

        int result = adder3.getValue();
        System.out.println("result = " + result);

        System.out.println("adder1 = " + adder1); // x001
        System.out.println("adder2 = " + adder2); // x001
        System.out.println("adder3 = " + adder3); // x001

    }
}
