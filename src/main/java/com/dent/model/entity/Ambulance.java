package com.dent.model.entity;
import com.dent.model.enums.VehicleAvailability;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Ambulance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String vehicleName;
    @Enumerated(EnumType.STRING)
    private VehicleAvailability vehicleAvailability;
    @OneToOne
    private Clinic clinic;
}
