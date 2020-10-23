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
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "document_type", length = 50)
    private String documentType;

    @ManyToOne
    private Group group;
}
