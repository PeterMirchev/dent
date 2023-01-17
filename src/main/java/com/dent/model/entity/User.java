package com.dent.model.entity;
import com.dent.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Role role;
}
