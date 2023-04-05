package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrderRepository {

    private final EntityManager em;

    public void save(Order order) {
        em.persist(order);
    }
    
    public Order findOne(Long id){
        return em.find(Order.class, id);
    }

//    public List<Order> findAll(OrderSearch orderSearch) {
//        // JPQL
//        // 동적 쿼리를 어떻게 해결하는가..
//        String jpql = "select o from Order o join o.member m";
//        boolean isFirstCondition = true;
//
//        return em.createQuery(jpql, Order.class)
//                .setParameter("status", orderSearch.getOrderStatus())
//                .setParameter("name", orderSearch.getMemberName())
//                .setMaxResults(1000)        // 최대 1000건
//                .getResultList();
//    }
//
//    /**
//     *  JPA CRITERIA
//     * */
//    public List<Order> findAllByCriteria(OrderSearch orderSearch) {
//
//    }
    
}
