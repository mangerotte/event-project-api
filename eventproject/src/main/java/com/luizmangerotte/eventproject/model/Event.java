package com.luizmangerotte.eventproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luizmangerotte.eventproject.model.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "id_address")
    @JsonIgnore
    private Address address;
    private Date time;
    private Category category;
    @ManyToMany(mappedBy = "eventSet")
    private Set<Client> clientSet;

}
