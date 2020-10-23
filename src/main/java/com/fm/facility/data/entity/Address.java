package com.fm.facility.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;

/**
 * @author Nikolay Karadzhov
 *
 * created on 10/23/2020
 */

@Data
@Entity
@Table(name = "Address")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50)
    private String country;

    @Column(length = 50)
    private String city;

    @Column(length = 100)
    private String neighbourhood;

    @Column(name = "street_name", length = 50)
    private String streetName;

    @Column(name = "street_number", length = 10)
    private String streetNumber;

    @Column(length = 10)
    private String block;

    @Column(length = 10)
    private String entrance;

    private int floor;

    private int apartment;
}
