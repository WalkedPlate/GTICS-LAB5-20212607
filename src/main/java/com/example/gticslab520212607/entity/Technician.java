package com.example.gticslab520212607.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "technician")
public class Technician {

    @Id
    @Column(name = "technicianid")
    private Integer id;

    @NotBlank
    @Size(min=3, max=100, message = "el nombre debe tener entre 3 y 100 caracteres")
    @Column(name = "firstname")
    private String firstName;

    @NotBlank
    @Size(min=3, max=100, message = "el apellido debe tener entre 3 y 100 caracteres")
    @Column(name = "lastname")
    private String lastName;

    @Pattern(regexp = "\\d{8}", message = "el dni debe tener 8 digitos")
    @Column(name = "dni")
    private String dni;

    @Pattern(regexp = "\\d{8}", message = "el teléfono debe tener 9 digitos")
    @Column(name = "phone")
    private String phone;

    @Positive
    @Digits(integer = 10, fraction = 0)
    @Column(name = "age")
    private Integer age;

}
