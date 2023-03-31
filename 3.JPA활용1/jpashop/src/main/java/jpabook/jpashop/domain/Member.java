package jpabook.jpashop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;

    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") // 1:다 & 연관관계의 주인이 아니예요 -> 주인은 order테이블에 있는 member필드에 의해 매핑이된다.
    private List<Order> orders = new ArrayList<>();

}
