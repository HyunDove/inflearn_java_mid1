package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    /* 최소화된 equals 구현
    @Override
    public boolean equals(Object obj) {
        // 객체의 특정 값을 사용하려면, 다운캐스팅이 필요하다.
        UserV2 user = (UserV2) obj;
        // 문자열 비교이기때문에, ==이 아니라 equals()를 사용해야한다.
        return id.equals(user.id);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}
