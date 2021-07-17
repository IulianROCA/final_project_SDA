//package com.pickUpCar.pickUpCar.entity;
//
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import javax.persistence.*;
//import java.util.Set;
//
//@Data
//@NoArgsConstructor
//@Entity
//@Table(name = "role")
//public class Role {
//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//
//    @OneToMany(fetch = FetchType.LAZY,
//            mappedBy = "role",
//            cascade = CascadeType.ALL)
//    private Set<User> userList;
//
//}
