package com.dent.model.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Clinic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    @OneToMany
    @Column(name = "ambulance")
    private Set<Ambulance> ambulanceList;
    @OneToMany
    @Column(name = "user")
    private List<User> usersList;
    @OneToMany
    @Column(name = "ward")
    private Set<Ward> wards;
    @ManyToOne
    private City city;
}
