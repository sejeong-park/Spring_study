class Foo{
    public static String classVar = "I class var";
    public String instanceVar = "I instance Var";

    public static void classMethod(){
        System.out.println(classVar); // OK
        //System.out.println(instanceVar); // Error
    }
    public void instanceMethod(){
        System.out.println(classVar); // OK
        System.out.println(instanceVar); // OK
    }
}
public class StaticApp {
    public static void main(String[] args) {
        // class를 통해서 classVar에 접근이 가능한가?
        System.out.println(Foo.classVar);
        // class를 통해서 instanceVar에 접근이 가능한가?
        //System.out.println(Foo.instanceVar);


        // classMethod 호출 가능
        Foo.classMethod(); // OK
        // Foo.instanceMethod(); // Error -> 접근 불가능
        // 인스턴스 메서드는 인스턴스 소속이기 때문에 class를 통해서 접근하는 것은 금지 !

        Foo f1 = new Foo();
        Foo f2 = new Foo();

        System.out.println("인스턴스에서 class 변수 소환 : " + f1.classVar);
        System.out.println("인스턴스에서 instance 변수 소환 : " + f1.instanceVar);

        // instance 에서 class 변수를 바꾼다면?
        f1.classVar = "classVar changed by f1";
        // Foo 클래스에 있는 class 변수는 어떻게 바뀔까?
        System.out.println(Foo.classVar);
        // 변경을 아무 것도 안한 f2는 어떻게 변할까?
        System.out.println(f2.classVar);


        // instance 에서 instance 변수를 바꾼다!
        f1.instanceVar = "instanceVar changed by f1";
        // f1의 instance 변수는?
        System.out.println(f1.instanceVar);
        // Foo의 instance 변수는?
        // System.out.println(Foo.instnaceVar); // Error
        // 인스턴스 메서드는 인스턴스 소속이기 때문에 class를 통해서 접근하는 것은 금지 !

        // f2의 instance 변수는?
        System.out.println(f2.instanceVar);


    }
}
