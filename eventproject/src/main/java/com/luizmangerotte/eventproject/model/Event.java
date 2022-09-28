package com.luizmangerotte.eventproject.model;

import com.luizmangerotte.eventproject.model.enums.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "event")
public class Event {

    private Long id;
    private String name;
    private String description;
    private Address address;
    private Date time;
    private Category category;
    private List<Client> clientList;

}
