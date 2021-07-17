package com.pickUpCar.pickUpCar.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User{

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;




    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;


//    @ManyToOne(fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    @JoinColumn(name="role_id")
//    private Role role;
//
//
//    @OneToMany(fetch = FetchType.LAZY,
//            mappedBy = "user",
//            cascade = CascadeType.ALL)
//    private Set<Request> requestList;
//
//
//
//    public User(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
//    }

}
