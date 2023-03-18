package hello.core.singleton;

public class StatefulService {
    // 싱글톤 패턴
//    private int price; // 상태를 유지하는 필드

    public int order(String name, int price) {
        return price;
    }

}
