package com.dent.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    @Column(name = "clinic")
    private List<Clinic> clinicsList;
}
