package lang.object.tostring;

public class ToStringMain1 {

    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        /**
         * 하단 2개의 결과 출력 값이 같은걸 볼 수 있는데, 이유는 다음과 같다.
         * println() 함수 내부적으로 toString()을 호출하기 때문에,
         * Object 타입(자식포함)이 println()에 인수로 전달되면,
         * 내부에서 obj.toString() 메서드를 호출해서 결과를 출력한다.
         * 따라서 toString()을 직접 호출 할 필요 없이 객체를 바로 전달하면 정보를 출력할 수 있다.
         * */

        // toString() 반환 값 출력
        System.out.println("string.toString() = " + string.toString());

        // object 직접 출력
        System.out.println("string = " + string);
    }
}
