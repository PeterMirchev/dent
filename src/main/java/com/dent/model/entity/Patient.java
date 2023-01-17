package com.dent.model.entity;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Patient extends User{

    private Integer age;
    private String address;

}
