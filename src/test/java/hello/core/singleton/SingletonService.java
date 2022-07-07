package hello.core.singleton;

public class SingletonService {

    //자기 자신의 객체 인스턴스 instance에 생성해서 넣어두기
    private static final SingletonService instance = new SingletonService();

    //public으로 선언해서 객체 인스턴스 필요하면 이 메소드 이용해 조회하도록 하기
    public static SingletonService getInstance() {
        return instance;
    }

    //생성자 private로 선언해서 외부에서 new 이용해 객체 생성 못하도록 막기
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
