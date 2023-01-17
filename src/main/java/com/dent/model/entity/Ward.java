package com.dent.model.entity;
import com.dent.model.enums.WardType;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Ward {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToMany
    @Column(name = "doctor")
    private List<Doctor> doctorsList;
    @Enumerated(EnumType.STRING)
    private WardType wardType;
}
