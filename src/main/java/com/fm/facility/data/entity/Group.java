package com.fm.facility.data.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Nikolay Karadzhov
 *
 * created on 10/23/2020
 */

@Data
@Entity
@Table(name = "UserGroup")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", length = 50)
    private String groupName;
}