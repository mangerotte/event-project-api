package com.luizmangerotte.eventproject.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.luizmangerotte.eventproject.model.enums.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
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
    @JsonFormat(shape = JsonFormat.Shape.STRING,
                        pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
                        timezone = "GMT")
    private Date time;
    private Integer category;
    @ManyToMany(mappedBy = "eventSet")
    private Set<Client> clientSet;

    public Event(Long id, String name, String description, Address address, Date time, Category category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.address = address;
        this.time = time;
        setCategory(category);
    }
    public Category getCategory() {return Category.valueOf(category);}

    public void setCategory(Category category) {
        this.category = category.getCode();
    }
}
