package hello.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {

    private String name;
    private int age;

    public static void main(String[] args){
        // lombok은 Getter & Setter를 자동으로 만들어준다.
        HelloLombok helloLombok = new HelloLombok();

        helloLombok.setName("hi");

        String name = helloLombok.getName();
        System.out.println("name = " + name);

    }

}
