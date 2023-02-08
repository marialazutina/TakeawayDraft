//package com.takeawaydraft.Service;
//
//import com.takeawaydraft.Models.Order;
//import com.takeawaydraft.Repositories.OrderRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//
//@Service
//public class OrderService {
//    private final OrderRepository orderRepository;
////    private final CustomerRepository customerRepository;
////    private final FoodItemRepository foodItemRepository;
//    @Autowired
//    public OrderService(OrderRepository orderRepository){
//        this.orderRepository = orderRepository;
//    }
//    public void createOrder(Order order){
//        this.orderRepository.save(order);
//    }
//    public ArrayList<Order> getAll(){
//        return orderRepository.findAll();
//    }
////    Method find order by customer id(check logged in customer + getID();
////    public ArrayList<Order> findOrderByCustomerId(){
////        return orderRepository.findOrderByCustomerId();
////    }
//    public Order findById(Long id){
//        return this.orderRepository.findOrderById(id);
//    }
//
//    public void deleteById(Long id){
//        this.orderRepository.deleteById(id);
//    }
//
//
//}
