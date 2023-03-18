package hello.core.singleton;

public class SingletonService {
    // 자기 자신을 내부에 private으로 static으로 가지고 있다. -> statid = 클래스 레벨에 존재하기 때문에 딱 1개만 존재한다.

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {
    }

    public void logic(){
        System.out.println("싱글톤 객체 로직 호출");
    }

}
