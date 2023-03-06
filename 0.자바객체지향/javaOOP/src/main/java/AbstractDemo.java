abstract class A{
    // 추상 클래스
    public abstract int b(); // 추상 메소드 -> 오버라이딩을 하여 구체적인 내용을 담아야 한다.
    public void d(){
        System.out.println("world");
    }
}
class B extends A{
    public int b(){
        return 1;
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        //A obj = new A()  ;
        B obj = new B();
    }

}
