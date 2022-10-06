package com.luizmangerotte.eventproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @OneToOne
    @MapsId
    @JsonIgnore
    private UserModel user;

    @ManyToMany
    @JoinTable(
            name = "event_client",
            joinColumns = @JoinColumn(name = "id_client"),
            inverseJoinColumns = @JoinColumn(name = "id_event"))
    private Set<Event> eventSet = new HashSet<>();

}
