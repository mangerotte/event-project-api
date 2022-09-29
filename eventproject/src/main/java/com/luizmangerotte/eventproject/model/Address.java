package com.luizmangerotte.eventproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number;
    private String city;
    private String state;
    private String country;
    @Column(name = "zip_code")
    private String zipCode;
    @OneToMany(mappedBy = "address")
    private Set<Event> event = new HashSet<>();

}
