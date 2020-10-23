package com.fm.facility.data.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


/**
 * @author Nikolay Karadzhov
 *
 * created on 10/23/2020
 */

@Data
@Getter
@Setter
@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 25)
    private String username;

    @Column(length = 25)
    private String password;

    private String email;

    @Column(name = "first_name", length = 50)
    private String firstName;

    @Column(name = "last_name", length = 50)
    private String lastName;

    @Column(name = "phone_number")
    private int phoneNumber;

    @OneToOne
    private Address address;

    @OneToMany
    private Group group;
}