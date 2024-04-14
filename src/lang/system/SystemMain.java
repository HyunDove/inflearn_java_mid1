package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간 (밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간 (나노초)를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. - OS 환경 설정 값
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. - Java 환경 설정 값
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version = " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. -> for문보다 수 배 속도가 빠르다.
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copiedArray = " + copiedArray);
        System.out.println("Arrays.toString = " + Arrays.toString(copiedArray));

        // 프로그램 종료 -> 가급적 사용하지 않는게 좋다. 프로그램 정리 하기 전에 의도치 않게 종료 될 수 있기 때문
        System.exit(0);

    }
}
