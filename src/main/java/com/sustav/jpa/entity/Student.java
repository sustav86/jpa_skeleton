package com.sustav.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Anton Sustavov
 * @since 2019/12/24
 */
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false, updatable = false, insertable = false)
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="city")
    private String city;

    public Student() {
    }

    public Student(String name, String city) {
        this.name = name;
        this.city = city;
    }

}
